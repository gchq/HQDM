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
package uk.gov.gchq.hqdm.rdf;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import uk.gov.gchq.hqdm.rdf.iri.HQDM;
import uk.gov.gchq.hqdm.rdf.iri.IRI;
import uk.gov.gchq.hqdm.rdf.iri.RDFS;

/**
 * Tests for the {@link Triples} class.
 * */
public class TriplesTest {

    private static final String EXPECTED1 = """
<http://www.semanticweb.org/hqdm#person1> <http://www.semanticweb.org/hqdm#member_of_kind> \"\"\"PERSON_KIND\"\"\"^^<http://www.w3.org/2001/XMLSchema#string>;
<http://www.semanticweb.org/hqdm#data_EntityName> \"\"\"person1\"\"\"^^<http://www.w3.org/2001/XMLSchema#string>;
<http://www.w3.org/1999/02/22-rdf-syntax-ns#type> \"\"\"http://www.semanticweb.org/hqdm#participant\"\"\"^^<http://www.w3.org/2001/XMLSchema#string>;
<http://www.w3.org/1999/02/22-rdf-syntax-ns#type> \"\"\"http://www.semanticweb.org/hqdm#person\"\"\"^^<http://www.w3.org/2001/XMLSchema#string>.
""";
    /**
     * Test successfully converting an object to triples.
     *
     * */
    @Test
    public void testCreateObjectWithPredicatesSuccess() {
        // Create an object for the test.
        final var personId = "person1";
        final var personIri = new IRI(HQDM.HQDM, personId);

        final var person = HqdmObjectFactory.create(personIri.getIri(), List.of(
                    new Pair<>(RDFS.RDF_TYPE.getIri(), HQDM.PERSON.getIri()),
                    new Pair<>(RDFS.RDF_TYPE.getIri(), HQDM.PARTICIPANT.getIri()),
                    new Pair<>(HQDM.ENTITY_NAME.getIri(), personId),
                    new Pair<>(HQDM.MEMBER_OF_KIND.getIri(), "PERSON_KIND")
                    ));

        // Convert the object to a triples string.
        final var triples  = Triples.toTriples(person);
        //
        // Assert the values are correct.
        assertEquals(EXPECTED1, triples);
    }

}
