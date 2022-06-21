/**
 * Define the module exports and dependencies.
 * */
module uk.gov.gchq.hqdm.rdf {
    exports uk.gov.gchq.hqdm.rdf.exception;
    exports uk.gov.gchq.hqdm.rdf.iri;
    exports uk.gov.gchq.hqdm.rdf;
    exports uk.gov.gchq.hqdm.rdf.services;
    requires transitive uk.gov.gchq.hqdm.core;
}
