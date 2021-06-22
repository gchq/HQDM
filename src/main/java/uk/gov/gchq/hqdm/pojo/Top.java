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

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;

/**
 * Top-level interface for HQDM objects.
 */
public interface Top {

    /**
     * Get the IRI of the HQDM object.
     *
     * @return IRI of the HQDM object.
     */
    IRI getIri();

    /**
     * Set the IRI of the HQDM object.
     *
     * @param iri IRI of the HQDM object.
     */
    void setIri(IRI iri);

    /**
     * Get the predications of the HQDM object.
     *
     * @return Map of HQDM objects and IRI predicates of the entity.
     */
    Map<IRI, Set<Object>> getPredicates();

    /**
     * Set the predications of the HQDM object.
     *
     * @param predicates Predicates of the HQDM object.
     * @throws HqdmException If predicates could not be parsed.
     */
    void setPredicates(Map<IRI, Set<Object>> predicates) throws HqdmException;

    /**
     * Add predicate and object IRI reference to entity.
     *
     * @param predicateIri Predicate IRI.
     * @param objectIri IRI of the object.
     */
    void addValue(IRI predicateIri, IRI objectIri);

    /**
     * Add predicate IRI and string value to object.
     *
     * @param predicateIri Predicate IRI.
     * @param value String value.
     */
    void addStringValue(IRI predicateIri, String value);

    /**
     * Add predicate IRI and real number value to object.
     *
     * @param predicateIri Predicate IRI.
     * @param value Real number value.
     */
    void addRealValue(IRI predicateIri, double value);

    /**
     * Get predicate value(s) by predicate IRI.
     *
     * @param predicateIri Predicate IRI.
     * @return Set of predicate values (IRIs or string-literals).
     */
    Set<Object> value(IRI predicateIri);

    /**
     * Does the entity have a given predicate.
     *
     * @param predicateIri Predicate IRI.
     * @return True if has predicate value.
     */
    boolean hasValue(IRI predicateIri);

    /**
     * Does the entity have a given predicate and IRI value.
     *
     * @param predicateIri Predicate IRI.
     * @param value Object IRI.
     * @return True if has this IRI value.
     */
    boolean hasThisValue(IRI predicateIri, IRI value);

    /**
     * Does the entity have a given predicate and string value.
     *
     * @param predicateIri Predicate IRI.
     * @param value String value.
     * @return True if has this string value.
     */
    boolean hasThisStringValue(IRI predicateIri, String value);

    /**
     * Does the entity have a given predicate and string value (case-insensitive).
     *
     * @param predicateIri Predicate IRI.
     * @param value Case-insensitive string value.
     * @return True if has this string value.
     */
    boolean hasThisStringValueIgnoreCase(IRI predicateIri, String value);

    /**
     * Does the entity have a given predicate and string value.
     *
     * @param predicateIri Predicate IRI.
     * @param value String value.
     * @return True if has fuzzy string value.
     */
    boolean hasThisStringValueFuzzy(IRI predicateIri, String value);

    /**
     * Convert the object to string of RDF triples.
     *
     * @return The object as RDF triples.
     */
    String toTriples();
}
