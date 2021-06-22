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

package uk.gov.gchq.hqdm.model.impl;

import static uk.gov.gchq.hqdm.iri.HQDM.AGGREGATED_INTO;
import static uk.gov.gchq.hqdm.iri.HQDM.BEGINNING;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ORDINARY_BIOLOGICAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfOrdinaryBiologicalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfOrdinaryBiologicalObject;
import uk.gov.gchq.hqdm.model.OrdinaryBiologicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of OrdinaryBiologicalObject.
 */
public class OrdinaryBiologicalObjectImpl extends HqdmObject implements OrdinaryBiologicalObject {
    /**
     * Constructs a new OrdinaryBiologicalObject.
     *
     * @param iri IRI of the OrdinaryBiologicalObject.
     */
    public OrdinaryBiologicalObjectImpl(final IRI iri) {
        super(OrdinaryBiologicalObjectImpl.class, iri, ORDINARY_BIOLOGICAL_OBJECT);
    }

    /**
     * Builder for constructing instances of OrdinaryBiologicalObject.
     */
    public static class Builder {

        private final OrdinaryBiologicalObjectImpl ordinaryBiologicalObjectImpl;

        /**
         * Constructs a Builder for a new OrdinaryBiologicalObject.
         *
         * @param iri IRI of the OrdinaryBiologicalObject.
         */
        public Builder(final IRI iri) {
            ordinaryBiologicalObjectImpl = new OrdinaryBiologicalObjectImpl(iri);
        }

        /**
         * A relationship type where a {@link SpatioTemporalExtent} may be aggregated into one or
         * more others.
         * <p>
         * Note: This has the same meaning as, but different representation to, the
         * {@link uk.gov.gchq.hqdm.model.Aggregation} entity type.
         * </p>
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryBiologicalObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its beginning.
         *
         * @param event The Event.
         * @return This builder.
         */
        public final Builder beginning(final Event event) {
            ordinaryBiologicalObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link SpatioTemporalExtent} may consist of one or more
         * others.
         *
         * <p>
         * Note: This is the inverse of {@link uk.gov.gchq.hqdm.iri.HQDM#PART__OF}.
         * </p>
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryBiologicalObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its ending.
         *
         * @param event The Event.
         * @return This builder.
         */
        public final Builder ending(final Event event) {
            ordinaryBiologicalObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            ordinaryBiologicalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where an
         * {@link OrdinaryBiologicalObject} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one
         * or more {@link ClassOfOrdinaryBiologicalObject}.
         *
         * @param classOfOrdinaryBiologicalObject The ClassOfOrdinaryBiologicalObject.
         * @return This builder.
         */
        public final Builder member_Of(
                final ClassOfOrdinaryBiologicalObject classOfOrdinaryBiologicalObject) {
            ordinaryBiologicalObjectImpl.addValue(MEMBER_OF,
                    classOfOrdinaryBiologicalObject.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where an
         * {@link OrdinaryBiologicalObject} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one
         * or more {@link KindOfOrdinaryBiologicalObject}.
         *
         * @param kindOfOrdinaryBiologicalObject The KindOfOrdinaryBiologicalObject.
         * @return This builder.
         */
        public final Builder member_Of_Kind(
                final KindOfOrdinaryBiologicalObject kindOfOrdinaryBiologicalObject) {
            ordinaryBiologicalObjectImpl.addValue(MEMBER_OF_KIND,
                    kindOfOrdinaryBiologicalObject.getIri());
            return this;
        }

        /**
         * An {@link uk.gov.gchq.hqdm.iri.HQDM#AGGREGATED_INTO} relationship type where a
         * {@link SpatioTemporalExtent} may be part of another and the whole has emergent properties
         * and is more than just the sum of its parts.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryBiologicalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} may be {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} one or more
         * {@link PossibleWorld}.
         *
         * <p>
         * Note: The relationship is optional because a {@link PossibleWorld} is not
         * {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} any other {@link SpatioTemporalExtent}.
         * </p>
         *
         * @param possibleWorld The PossibleWorld.
         * @return This builder.
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            ordinaryBiologicalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} may be a temporal part of one or more other
         * {@link SpatioTemporalExtent}.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryBiologicalObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.StateOfOrdinaryBiologicalObject} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} one or more
         * {@link OrdinaryBiologicalObject}.
         *
         * @param ordinaryBiologicalObject The OrdinaryBiologicalObject.
         * @return This builder.
         */
        public final Builder temporal_Part_Of(
                final OrdinaryBiologicalObject ordinaryBiologicalObject) {
            ordinaryBiologicalObjectImpl.addValue(TEMPORAL_PART_OF,
                    ordinaryBiologicalObject.getIri());
            return this;
        }

        /**
         * Returns an instance of OrdinaryBiologicalObject created from the properties set on this
         * builder.
         *
         * @return The built OrdinaryBiologicalObject.
         * @throws HqdmException If the OrdinaryBiologicalObject is missing any mandatory
         *         properties.
         */
        public OrdinaryBiologicalObject build() throws HqdmException {
            if (ordinaryBiologicalObjectImpl.hasValue(AGGREGATED_INTO)
                    && ordinaryBiologicalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(BEGINNING)
                    && ordinaryBiologicalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(ENDING)
                    && ordinaryBiologicalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(MEMBER__OF)
                    && ordinaryBiologicalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(MEMBER_OF)
                    && ordinaryBiologicalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(MEMBER_OF_KIND)
                    && ordinaryBiologicalObjectImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(PART__OF)
                    && ordinaryBiologicalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!ordinaryBiologicalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && ordinaryBiologicalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (ordinaryBiologicalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && ordinaryBiologicalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return ordinaryBiologicalObjectImpl;
        }
    }
}
