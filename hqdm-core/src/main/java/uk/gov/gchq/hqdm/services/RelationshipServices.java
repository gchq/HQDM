package uk.gov.gchq.hqdm.services;

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
     * Create a Specialization with an String.
     *
     * @param id the String.
     * @return a Specialization instance.
     */
    public static Specialization createSpecialization(final String id) {
        return new SpecializationImpl(id);
    }

    /**
     * Create a Scale with an String.
     *
     * @param id the String.
     * @return a Scale instance.
     */
    public static Scale createScale(final String id) {
        return new ScaleImpl(id);
    }

    /**
     * Create a UnitOfMeasure with an String.
     *
     * @param id the String.
     * @return a UnitOfMeasure instance.
     */
    public static UnitOfMeasure createUnitOfMeasure(final String id) {
        return new UnitOfMeasureImpl(id);
    }

    /**
     * Create a Function_ with an String.
     *
     * @param id the String.
     * @return a Function_ instance.
     */
    public static Function_ createFunction(final String id) {
        return new FunctionImpl(id);
    }

    /**
     * Create a Classification with an String.
     *
     * @param id the String.
     * @return a Classification instance.
     */
    public static Classification createClassification(final String id) {
        return new ClassificationImpl(id);
    }

    /**
     * Create a TemporalComposition with an String.
     *
     * @param id the String.
     * @return a TemporalComposition instance.
     */
    public static TemporalComposition createTemporalComposition(final String id) {
        return new TemporalCompositionImpl(id);
    }

    /**
     * Create a Composition with an String.
     *
     * @param id the String.
     * @return a Composition instance.
     */
    public static Composition createComposition(final String id) {
        return new CompositionImpl(id);
    }

    /**
     * Create a Aggregation with an String.
     *
     * @param id the String.
     * @return a Aggregation instance.
     */
    public static Aggregation createAggregation(final String id) {
        return new AggregationImpl(id);
    }

    /**
     * Create a Relationship with an String.
     *
     * @param id the String.
     * @return a Relationship instance.
     */
    public static Relationship createRelationship(final String id) {
        return new RelationshipImpl(id);
    }

    /**
     * Create a DefinedRelationship with an String.
     *
     * @param id the String.
     * @return a DefinedRelationship instance.
     */
    public static DefinedRelationship createDefinedRelationship(final String id) {
        return new DefinedRelationshipImpl(id);
    }

}
