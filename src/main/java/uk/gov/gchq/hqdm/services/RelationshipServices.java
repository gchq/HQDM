package uk.gov.gchq.hqdm.services;

import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Aggregation;
import uk.gov.gchq.hqdm.model.Classification;
import uk.gov.gchq.hqdm.model.Composition;
import uk.gov.gchq.hqdm.model.DefinedRelationship;
import uk.gov.gchq.hqdm.model.Function_;
import uk.gov.gchq.hqdm.model.Relationship;
import uk.gov.gchq.hqdm.model.Scale;
import uk.gov.gchq.hqdm.model.Specialization;
import uk.gov.gchq.hqdm.model.TemporalComposition;
import uk.gov.gchq.hqdm.model.UnitOfMeasure;
import uk.gov.gchq.hqdm.model.impl.AggregationImpl;
import uk.gov.gchq.hqdm.model.impl.ClassificationImpl;
import uk.gov.gchq.hqdm.model.impl.CompositionImpl;
import uk.gov.gchq.hqdm.model.impl.DefinedRelationshipImpl;
import uk.gov.gchq.hqdm.model.impl.FunctionImpl;
import uk.gov.gchq.hqdm.model.impl.RelationshipImpl;
import uk.gov.gchq.hqdm.model.impl.ScaleImpl;
import uk.gov.gchq.hqdm.model.impl.SpecializationImpl;
import uk.gov.gchq.hqdm.model.impl.TemporalCompositionImpl;
import uk.gov.gchq.hqdm.model.impl.UnitOfMeasureImpl;

/**
 * Methods for creating Relationsip objects.
 *
 * */
public class RelationshipServices {
    /**
     * Create a Specialization with an IRI.
     *
     * @param iri the IRI.
     * @return a Specialization instance.
     */
    public static Specialization createSpecialization(final IRI iri) {
        return new SpecializationImpl(iri);
    }

    /**
     * Create a Scale with an IRI.
     *
     * @param iri the IRI.
     * @return a Scale instance.
     */
    public static Scale createScale(final IRI iri) {
        return new ScaleImpl(iri);
    }

    /**
     * Create a UnitOfMeasure with an IRI.
     *
     * @param iri the IRI.
     * @return a UnitOfMeasure instance.
     */
    public static UnitOfMeasure createUnitOfMeasure(final IRI iri) {
        return new UnitOfMeasureImpl(iri);
    }

    /**
     * Create a Function_ with an IRI.
     *
     * @param iri the IRI.
     * @return a Function_ instance.
     */
    public static Function_ createFunction(final IRI iri) {
        return new FunctionImpl(iri);
    }

    /**
     * Create a Classification with an IRI.
     *
     * @param iri the IRI.
     * @return a Classification instance.
     */
    public static Classification createClassification(final IRI iri) {
        return new ClassificationImpl(iri);
    }

    /**
     * Create a TemporalComposition with an IRI.
     *
     * @param iri the IRI.
     * @return a TemporalComposition instance.
     */
    public static TemporalComposition createTemporalComposition(final IRI iri) {
        return new TemporalCompositionImpl(iri);
    }

    /**
     * Create a Composition with an IRI.
     *
     * @param iri the IRI.
     * @return a Composition instance.
     */
    public static Composition createComposition(final IRI iri) {
        return new CompositionImpl(iri);
    }

    /**
     * Create a Aggregation with an IRI.
     *
     * @param iri the IRI.
     * @return a Aggregation instance.
     */
    public static Aggregation createAggregation(final IRI iri) {
        return new AggregationImpl(iri);
    }

    /**
     * Create a Relationship with an IRI.
     *
     * @param iri the IRI.
     * @return a Relationship instance.
     */
    public static Relationship createRelationship(final IRI iri) {
        return new RelationshipImpl(iri);
    }

    /**
     * Create a DefinedRelationship with an IRI.
     *
     * @param iri the IRI.
     * @return a DefinedRelationship instance.
     */
    public static DefinedRelationship createDefinedRelationship(final IRI iri) {
        return new DefinedRelationshipImpl(iri);
    }

}
