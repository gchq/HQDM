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

import java.util.Map;
import java.util.Set;

/**
 * Top-level interface for HQDM objects.
 */
public interface Top {

    /**
     * Get the String of the HQDM object.
     *
     * @return String of the HQDM object.
     */
    String getId();

    /**
     * Set the String of the HQDM object.
     *
     * @param id String of the HQDM object.
     */
    void setId(String id);

    /**
     * Get the predications of the HQDM object.
     *
     * @return Map of HQDM objects and String predicates of the entity.
     */
    Map<String, Set<Object>> getPredicates();

    /**
     * Set the predications of the HQDM object.
     *
     * @param predicates Predicates of the HQDM object.
     */
    void setPredicates(Map<String, Set<Object>> predicates);

    /**
     * Add predicate and object String reference to entity.
     *
     * @param predicateId Predicate String.
     * @param objectId String of the object.
     */
    void addValue(String predicateId, String objectId);

    /**
     * Add predicate String and string value to object.
     *
     * @param predicateId Predicate String.
     * @param value String value.
     */
    void addStringValue(String predicateId, String value);

    /**
     * Add predicate String and real number value to object.
     *
     * @param predicateId Predicate String.
     * @param value Real number value.
     */
    void addRealValue(String predicateId, double value);

    /**
     * Get predicate value(s) by predicate String.
     *
     * @param predicateId Predicate String.
     * @return Set of predicate values (Strings or string-literals).
     */
    Set<Object> value(String predicateId);

    /**
     * Does the entity have a given predicate.
     *
     * @param predicateId Predicate String.
     * @return True if has predicate value.
     */
    boolean hasValue(String predicateId);

    /**
     * Does the entity have a given predicate and String value.
     *
     * @param predicateId Predicate String.
     * @param value Object String.
     * @return True if has this String value.
     */
    boolean hasThisValue(String predicateId, String value);

    /**
     * Does the entity have a given predicate and string value.
     *
     * @param predicateId Predicate String.
     * @param value String value.
     * @return True if has this string value.
     */
    boolean hasThisStringValue(String predicateId, String value);

    /**
     * Does the entity have a given predicate and string value (case-insensitive).
     *
     * @param predicateId Predicate String.
     * @param value Case-insensitive string value.
     * @return True if has this string value.
     */
    boolean hasThisStringValueIgnoreCase(String predicateId, String value);

    /**
     * Does the entity have a given predicate and string value.
     *
     * @param predicateId Predicate String.
     * @param value String value.
     * @return True if has fuzzy string value.
     */
    boolean hasThisStringValueFuzzy(String predicateId, String value);

    /**
     * Remove a predicate value.
     *
     * @param predicateId the id {@link String} of the predicate.
     * @param value the value {@link String} to be removed.
    */
    void removeValue(String predicateId, String value);
}
