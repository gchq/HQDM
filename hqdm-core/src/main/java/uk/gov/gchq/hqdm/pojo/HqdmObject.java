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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import uk.gov.gchq.hqdm.model.Thing;

/**
 * Basic implementation of a HQDM object.
 */
public abstract class HqdmObject implements Thing {

    private String id;

    private final Map<String, Set<Object>> predicates = new HashMap<>();

    /**
     * Constructs a new {@code HqdmObject}.
     *
     * @param id String of the HQDM object.
     */
    public HqdmObject(final String id) {
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, Set<Object>> getPredicates() {
        return predicates;
    }

    /**
     * {@inheritDoc}
     */
    public void setPredicates(final Map<String, Set<Object>> predicates) {
        // Convert some values to Strings if necessary - required when deserializing the
        // object.
        if (!predicates.isEmpty()) {
            this.predicates.clear();
            for (final Map.Entry<String, Set<Object>> entry : predicates.entrySet()) {
                final Object value = entry.getValue().iterator().next();
                final String key = entry.getKey();
                if (value instanceof Map) {
                    final Map valueMap = (Map) value;
                    this.predicates.remove(key);
                    this.addValue(key, new String(valueMap.get("id").toString()));
                } else {
                    this.predicates.put(key, entry.getValue());
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void addValue(final String predicateId, final String value) {
        final Set<Object> values = predicates.computeIfAbsent(predicateId, k -> new HashSet<>());
        values.add(value);
    }

    /**
     * {@inheritDoc}
     */
    public void addStringValue(final String predicateId, final String value) {
        final Set<Object> values = predicates.computeIfAbsent(predicateId, k -> new HashSet<>());
        values.add(value);
    }

    /**
     * {@inheritDoc}
     */
    public void addRealValue(final String predicateId, final double value) {
        final Set<Object> values = predicates.computeIfAbsent(predicateId, k -> new HashSet<>());
        values.add(value);
    }

    /**
     * {@inheritDoc}
     */
    public Set<Object> value(final String id) {
        return predicates.get(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasValue(final String value) {
        return predicates.containsKey(value);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasThisValue(final String predicateId, final String value) {
        final Set<Object> values = predicates.get(predicateId);
        return values != null && values.contains(value);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasThisStringValue(final String predicateId, final String value) {
        final Set<Object> values = predicates.get(predicateId);
        return values != null && values.contains(value);
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasThisStringValueIgnoreCase(final String predicateId, final String value) {
        final Set<Object> values = predicates.get(predicateId);
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
    public boolean hasThisStringValueFuzzy(final String predicateId, final String value) {
        final Set<Object> values = predicates.get(predicateId);
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
     * Output HQDM object and predicate values as collection of string values including predicates.
     *
     * @return Formatted string output of HQDM object.
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
        return "HQDMObject{" + "getId=" + id + "\n    values=\n" + builder.toString() + '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param object The reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument; false otherwise.
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
        return Objects.equals(id, that.id);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    /**
     * Remove a predicate value.
     *
     * @param predicateId {@link String}
     * @param value       {@link String}
     */
    public void removeValue(final String predicateId, final String value) {
        if (predicates.containsKey(predicateId)) {
            final var v = predicates.get(predicateId);
            if (v.contains(value)) {
                v.remove(value);
            }
        }
    }
}
