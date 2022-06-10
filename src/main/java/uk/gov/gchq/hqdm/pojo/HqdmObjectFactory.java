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

import static uk.gov.gchq.hqdm.iri.HQDM.ENTITY_CLASS_NAME;
import static uk.gov.gchq.hqdm.iri.RDFS.RDF_TYPE;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.HqdmIri;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Thing;

/**
 * Object factory for building HQDM Java objects from RDF triples.
 */
public final class HqdmObjectFactory {

    private static final Map<String, Constructor> CONSTRUCTOR_MAP = new HashMap<>();

    private HqdmObjectFactory() {}

    /**
     * Create a new HQDM object from a HQDM entity type and IRI.
     *
     * @param <T> {@link Thing} or any of its subclasses.
     * @param hqdmType IRI definition of HQDM object type defined in
     *        {@link uk.gov.gchq.hqdm.iri.HQDM}.
     * @param iri IRI of the object.
     * @return The constructed HQDM Object.
     * @throws HqdmException If the HqdmObject could not be built.
     */
    public static <T extends Thing> T create(final HqdmIri hqdmType, final IRI iri)
            throws HqdmException {
        try {
            final String className = "uk.gov.gchq.hqdm.impl."
                    + toCamelCase(hqdmType.getResource()) + "Impl";
            final Class clazz = Class.forName(className);
            final Constructor<T> constructor = getIriConstructor(clazz);
            return constructor.newInstance(iri);
        } catch (final Exception ex) {
            throw new HqdmException(ex);
        }
    }

    /**
     * Create a HqdmObject from an IRI and list of predicates.
     *
     * @param iri IRI of the object.
     * @param pairs Object attributes.
     * @return The constructed HQDM Object.
     * @throws HqdmException If the HqdmObject could not be built.
     */
    public static HqdmObject create(final String iri, final List<Pair<String, String>> pairs)
            throws HqdmException {
        try {
            final List<IRI> iris = new ArrayList<>();
            for (final Pair<String, String> pair : pairs
                    .stream()
                    .filter(pair -> pair.getLeft().equals(RDF_TYPE.toString()))
                    .collect(Collectors.toList())) {
                iris.add(new IRI(pair.getRight()));
            }

            final List<String> classNames = pairs
                    .stream()
                    .filter(pair -> pair.getLeft().equals(ENTITY_CLASS_NAME.toString()))
                    .map(Pair::getRight).collect(Collectors.toList());

            if (!iris.isEmpty()) {
                String className;
                if (!classNames.isEmpty()) {
                    className = classNames.get(0);
                } else {
                    if (!iris.isEmpty()) {
                        className = iris.get(0).getResource();
                        className = "uk.gov.gchq.hqdm.impl." + toCamelCase(className) + "Impl";
                    } else {
                        className = "NOT FOUND";
                    }
                }
                final Class clazz = Class.forName(className);

                final Constructor constructor = getIriConstructor(clazz);
                final HqdmObject result = (HqdmObject) constructor.newInstance(new IRI(iri));

                for (final Pair<String, String> pair : pairs) {
                    if (pair.getRight().startsWith("http")) {
                        result.addValue(new IRI(pair.getLeft()), new IRI(pair.getRight()));
                    } else {
                        result.addStringValue(new IRI(pair.getLeft()), pair.getRight());
                    }
                }
                return result;
            } else {
                throw new HqdmException("No type information for: " + iri);
            }
        } catch (final Exception ex) {
            throw new HqdmException(ex);
        }
    }

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
