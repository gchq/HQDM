package uk.gov.gchq.hqdm.iri;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.gov.gchq.hqdm.rdf.HqdmObjectFactory;
import uk.gov.gchq.hqdm.rdf.exception.IriException;
import uk.gov.gchq.hqdm.rdf.iri.IRI;
import uk.gov.gchq.hqdm.rdf.iri.IriBase;
import uk.gov.gchq.hqdm.rdf.iri.RDFS;

/**
 * Tests for the {@link HqdmObjectFactory}.
 * */
public class IriTest {

    /**
     * Test creating a new IRI successfully.
     *
     * */
    @Test
    public void testCreateIriSuccess1() {
        final var iri = new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type");

        assertEquals(RDFS.RDF_TYPE.getIri(), iri.getIri());
        assertEquals("type", iri.getResource());
        assertEquals(iri.getIri(), iri.toString());
    }

    /**
     * Test creating a new IRI successfully.
     *
     * */
    @Test
    public void testCreateIriSuccess2() {
        final var iri = new IRI(new IriBase("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"), "type");

        assertEquals(RDFS.RDF_TYPE.getIri(), iri.getIri());
        assertEquals("type", iri.getResource());
        assertEquals(iri.getIri(), iri.toString());
    }

    /**
     * Test creating a new IRI that fails.
     *
     * */
    @Test(expected = IriException.class)
    public void testCreateIriFail() {
        new IRI("bad iri");
    }

}
