/*
 * Copyright 2021 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package uk.gov.gchq.hqdm.pojo;

import static uk.gov.gchq.hqdm.iri.RDFS.TYPE;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.jena.atlas.lib.Pair;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.HqdmIri;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Thing;

/**
 *
 */
public final class HqdmObjectFactory {
    /** */
    private static final Map<String, Constructor> CONSTRUCTOR_MAP = new HashMap<>();

    private HqdmObjectFactory() {}

    /**
     *
     * @param <T>
     * @param hqdmType
     * @param iri
     * @return
     * @throws HqdmException
     */
    public static <T extends Thing> T create(final HqdmIri hqdmType, final IRI iri)
            throws HqdmException {
        try {
            final String className = "uk.gov.gchq.hqdm.impl."
                    + toCamelCase(hqdmType.getValue()) + "Impl";
            final Class clazz = Class.forName(className);
            final Constructor<T> constructor = getIriConstructor(clazz);
            return constructor.newInstance(iri);
        } catch (final Exception ex) {
            throw new HqdmException(ex);
        }
    }

    /**
     *
     * @param key
     * @param pairs
     * @return
     */
    public static HqdmObject create(final String key, final List<Pair<String, String>> pairs)
            throws HqdmException {
        final String rdfType = TYPE.toString();
        final String classNameIri = Top.CLASS_NAME.toString();

        try {
            final List<IRI> iris = new ArrayList<>();
            for (final Pair<String, String> pair : pairs
                    .stream()
                    .filter(pair -> pair.getLeft().equals(rdfType))
                    .collect(Collectors.toList())) {
                iris.add(new IRI(pair.getRight()));
            }

            final List<String> classNames = pairs
                    .stream()
                    .filter(pair -> pair.getLeft().equals(classNameIri))
                    .map(Pair::getRight).collect(Collectors.toList());

            if (!iris.isEmpty()) {
                String className;
                if (!classNames.isEmpty()) {
                    className = classNames.get(0);
                } else {
                    if (!iris.isEmpty()) {
                        className = iris.get(0).getValue();
                        className = "uk.gov.gchq.hqdm.impl." + toCamelCase(className) + "Impl";
                    } else {
                        className = "NOT FOUND";
                    }
                }
                final Class clazz = Class.forName(className);

                final Constructor constructor = getIriConstructor(clazz);
                final HqdmObject result = (HqdmObject) constructor.newInstance(new IRI(key));

                for (final Pair<String, String> pair : pairs) {
                    if (pair.getRight().startsWith("http")) {
                        result.addValue(new IRI(pair.getLeft()), new IRI(pair.getRight()));
                    } else {
                        result.addStringValue(new IRI(pair.getLeft()), pair.getRight());
                    }
                }
                return result;
            } else {
                throw new HqdmException("No type information for: " + key);
            }
        } catch (final Exception ex) {
            throw new HqdmException(ex);
        }
    }

    /**
     *
     * @param name
     * @return
     */
    private static String toCamelCase(final String name) {
        final char[] result = name.toCharArray();
        boolean toggle = true;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == '_') {
                toggle = true;
            } else {
                if (toggle) {
                    result[i] = Character.toUpperCase(result[i]);
                    toggle = false;
                }
            }
        }
        return new String(result).replace("_", "");
    }

    private static <T> Constructor<T> getIriConstructor(final Class clazz) throws HqdmException {
        if (CONSTRUCTOR_MAP.containsKey(clazz.getName())) {
            return CONSTRUCTOR_MAP.get(clazz.getName());
        }

        final Constructor<T>[] constructors = clazz.getConstructors();
        final Constructor<T> result = Arrays
                .stream(constructors)
                .filter(cl -> cl.getParameterCount() == 1)
                .filter(cl -> (cl.getParameterTypes()[0]) == IRI.class).findFirst()
                .orElseThrow(() -> new HqdmException(
                        "No IRI-only constructor for " + clazz.getName()));

        CONSTRUCTOR_MAP.put(clazz.getName(), result);
        return result;
    }
}
