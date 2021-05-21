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
import static uk.gov.gchq.hqdm.iri.HQDM.ENTITY_NAME;
import static uk.gov.gchq.hqdm.iri.RDFS.RDF_TYPE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import uk.gov.gchq.hqdm.exception.IriException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Thing;

/**
 *
 */
public abstract class HqdmObject implements Thing {

    private static final Pattern DATE_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    private static final Pattern DATE_TIME_PATTERN = Pattern
            .compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.*");
    private IRI iri;

    private final Map<IRI, Set<Object>> predicates = new HashMap<>();

    /**
     *
     */
    public HqdmObject() {}

    /**
     *
     * @param clazz
     * @param iri
     * @param rdfType
     */
    public HqdmObject(final Class clazz, final IRI iri, final IRI rdfType) {
        addStringValue(ENTITY_CLASS_NAME, clazz.getName());
        this.iri = iri;
        addValue(RDF_TYPE, rdfType);
    }

    /**
     * {@inheritDoc}
     */
    public IRI getIri() {
        return iri;
    }

    /**
     * {@inheritDoc}
     */
    public void setIri(final IRI iri) {
        this.iri = iri;
    }

    /**
     * {@inheritDoc}
     */
    public Map<IRI, Set<Object>> getPredicates() {
        return predicates;
    }

    /**
     * {@inheritDoc}
     */
    public void setPredicates(final Map<IRI, Set<Object>> predicates) throws IriException {
        // Convert some values to IRIs if necessary - required when deserializing the
        // object.
        if (!predicates.isEmpty()) {
            this.predicates.clear();
            for (final Map.Entry<IRI, Set<Object>> entry : predicates.entrySet()) {
                final Object value = entry.getValue().iterator().next();
                final IRI key = entry.getKey();
                if (value instanceof Map) {
                    final Map valueMap = (Map) value;
                    this.predicates.remove(key);
                    this.addValue(key, new IRI(valueMap.get("iri").toString()));
                } else {
                    this.predicates.put(key, entry.getValue());
                }
            }
        }
    }

    /**
     *
     * @return
     */
    public String getName() {
        final Set<Object> names = value(ENTITY_NAME);
        if (names != null && !names.isEmpty()) {
            return (String) names.iterator().next();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void addValue(final IRI predicateIri, final IRI value) {
        final Set<Object> values = predicates.computeIfAbsent(predicateIri, k -> new HashSet<>());
        values.add(value);
    }

    /**
     * {@inheritDoc}
     */
    public void addStringValue(final IRI predicateIri, final String value) {
        final Set<Object> values = predicates.computeIfAbsent(predicateIri, k -> new HashSet<>());
        values.add(value);
    }

    /**
     * {@inheritDoc}
     */
    public void addRealValue(final IRI predicateIri, final double value) {
        final Set<Object> values = predicates.computeIfAbsent(predicateIri, k -> new HashSet<>());
        values.add(value);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasValue(final IRI value) {
        return predicates.containsKey(value);
    }

    /**
     * {@inheritDoc}
     */
    public Set<Object> value(final IRI iri) {
        return predicates.get(iri);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasThisValue(final IRI predicateIri, final IRI value) {
        final Set<Object> values = predicates.get(predicateIri);
        return values != null && values.contains(value);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasThisStringValue(final IRI predicateIri, final String value) {
        final Set<Object> values = predicates.get(predicateIri);
        return values != null && values.contains(value);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasThisStringValueIgnoreCase(final IRI predicateIri, final String value) {
        final Set<Object> values = predicates.get(predicateIri);
        if (values != null) {
            for (final Object object : values) {
                if (value.equalsIgnoreCase(object.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasThisStringValueFuzzy(final IRI predicateIri, final String value) {
        final Set<Object> values = predicates.get(predicateIri);
        if (values != null) {
            for (final Object object : values) {
                if (object.toString().toLowerCase().contains(value.toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public String toTriples() {
        final StringBuilder builder = new StringBuilder();
        builder.append('<');
        builder.append(iri.toString());
        builder.append('>');
        builder.append(' ');

        final String predicatesStr = predicates.entrySet().stream().map(v -> {
            final String predicate = "<" + v.getKey().toString() + "> ";
            return v
                    .getValue()
                    .stream()
                    .map(vv -> predicate + toTripleString(vv)).collect(Collectors.joining(";\n"));
        }).collect(Collectors.joining(";\n"));

        builder.append(predicatesStr);
        builder.append(".\n");
        return builder.toString();
    }

    private String toTripleString(final Object object) {
        final String stringValue = object.toString();
        if (object instanceof IRI) {
            return "<" + stringValue + ">";
        } else if (DATE_TIME_PATTERN.matcher(stringValue).matches()) {
            return "\"" + object + "\"^^<http://www.w3.org/2001/XMLSchema#dateTime>";
        } else if (DATE_PATTERN.matcher(stringValue).matches()) {
            return "\"" + object + "\"^^<http://www.w3.org/2001/XMLSchema#date>";
        } else if (object instanceof String) {
            return "\"\"\"" + object + "\"\"\"^^<http://www.w3.org/2001/XMLSchema#string>";
        } else if (object instanceof Integer || object instanceof Long) {
            return "\"" + object + "\"^^<http://www.w3.org/2001/XMLSchema#integer>";
        } else {
            return "\"\"\"" + stringValue + "\"\"\"";
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        predicates.forEach((key, value) -> {
            builder.append("        key: ");
            builder.append(key.toString());
            builder.append(", values: [");
            value.forEach(vv -> {
                builder.append(vv.toString());
                builder.append(" ");
            });
            builder.append("]\n");
        });
        return "HQDMObject{" + "getIri=" + iri + "\n    values=\n" + builder.toString() + '}';
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof HqdmObject)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        final HqdmObject that = (HqdmObject) object;
        return Objects.equals(iri, that.iri);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), iri);
    }
}
