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

package uk.gov.gchq.hqdm.iri;

/**
 *
 */
public final class RDFS {
    private RDFS() {}

    /** */
    public static final IriBase RDF =
            new IriBase("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");

    /** */
    public static final IRI RDF_TYPE = new IRI(RDF, "type");

    /** */
    public static final IriBase RDFS =
            new IriBase("rdfs", "http://www.w3.org/2000/01/rdf-schema#");

    /** */
    public static final IRI RDFS_LITERAL = new IRI(RDFS, "Literal");
}
