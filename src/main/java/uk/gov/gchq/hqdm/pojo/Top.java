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
import uk.gov.gchq.hqdm.iri.IriBase;

/**
 *
 */
public interface Top {
    /**
     *
     */
    IRI CLASS_NAME = new IRI(
            new IriBase("universe", "http://www.semanticweb.org/magma-core/ontologies/universe/"),
            "class_name");

    /**
     *
     * @return class IRI
     */
    IRI getIri();

    /**
     *
     * @param iri
     */
    void setIri(IRI iri);

    /**
     *
     * @return
     */
    Map<IRI, Set<Object>> getPredicates();

    /**
     *
     * @param predicates
     * @throws HqdmException
     */
    void setPredicates(Map<IRI, Set<Object>> predicates) throws HqdmException;

    /**
     *
     * @param predicateIri
     * @param value
     */
    void addValue(IRI predicateIri, IRI value);

    /**
     *
     * @param predicateIri
     * @param value
     */
    void addStringValue(IRI predicateIri, String value);

    /**
     *
     * @param predicateIri
     * @param value
     */
    void addRealValue(IRI predicateIri, double value);

    /**
     *
     * @param value
     * @return
     */
    boolean hasValue(IRI value);

    /**
     *
     * @param iri
     * @return
     */
    Set<Object> value(IRI iri);

    /**
     *
     * @param predicateIri
     * @param value
     * @return
     */
    boolean hasThisValue(IRI predicateIri, IRI value);

    /**
     *
     * @param predicateIri
     * @param value
     * @return
     */
    boolean hasThisStringValue(IRI predicateIri, String value);

    /**
     *
     * @param predicateIri
     * @param value
     * @return
     */
    boolean hasThisStringValueIgnoreCase(IRI predicateIri, String value);

    /**
     *
     * @param predicateIri
     * @param value
     * @return
     */
    boolean hasThisStringValueFuzzy(IRI predicateIri, String value);

    /**
     *
     * @return
     */
    String toTriples();
}
