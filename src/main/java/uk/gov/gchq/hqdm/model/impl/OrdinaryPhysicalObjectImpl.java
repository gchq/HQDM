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
import static uk.gov.gchq.hqdm.iri.HQDM.ORDINARY_PHYSICAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfOrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfOrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.OrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of OrdinaryPhysicalObject.
 */
public class OrdinaryPhysicalObjectImpl extends HqdmObject implements OrdinaryPhysicalObject {
    /**
     * Constructs a new OrdinaryPhysicalObject.
     *
     * @param iri IRI of the OrdinaryPhysicalObject.
     */
    public OrdinaryPhysicalObjectImpl(final IRI iri) {
        super(OrdinaryPhysicalObjectImpl.class, iri, ORDINARY_PHYSICAL_OBJECT);
    }

    /**
     * Builder for constructing instances of OrdinaryPhysicalObject.
     */
    public static class Builder {

        private final OrdinaryPhysicalObjectImpl ordinaryPhysicalObjectImpl;

        /**
         * Constructs a Builder for a new OrdinaryPhysicalObject.
         *
         * @param iri IRI of the OrdinaryPhysicalObject.
         */
        public Builder(final IRI iri) {
            ordinaryPhysicalObjectImpl = new OrdinaryPhysicalObjectImpl(iri);
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
            ordinaryPhysicalObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
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
            ordinaryPhysicalObjectImpl.addValue(BEGINNING, event.getIri());
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
            ordinaryPhysicalObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
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
            ordinaryPhysicalObjectImpl.addValue(ENDING, event.getIri());
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
            ordinaryPhysicalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where an
         * {@link OrdinaryPhysicalObject} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one
         * or more {@link ClassOfOrdinaryPhysicalObject}.
         *
         * @param classOfOrdinaryPhysicalObject The ClassOfOrdinaryPhysicalObject.
         * @return This builder.
         */
        public final Builder member_Of(
                final ClassOfOrdinaryPhysicalObject classOfOrdinaryPhysicalObject) {
            ordinaryPhysicalObjectImpl.addValue(MEMBER_OF, classOfOrdinaryPhysicalObject.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF_KIND} relationship type where an
         * {@link OrdinaryPhysicalObject} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one
         * or more {@link KindOfOrdinaryPhysicalObject}.
         *
         * @param kindOfOrdinaryPhysicalObject The KindOfOrdinaryPhysicalObject.
         * @return This builder.
         */
        public final Builder member_Of_Kind(
                final KindOfOrdinaryPhysicalObject kindOfOrdinaryPhysicalObject) {
            ordinaryPhysicalObjectImpl.addValue(MEMBER_OF_KIND,
                    kindOfOrdinaryPhysicalObject.getIri());
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
            ordinaryPhysicalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
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
            ordinaryPhysicalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
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
            ordinaryPhysicalObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.State} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} one or more {@link Individual}.
         *
         * <p>
         * Note: The relationship is optional because an {@link Individual} is not necessarily a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} another {@link Individual}, yet is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} {@link uk.gov.gchq.hqdm.model.State} as well
         * as {@link Individual}. This applies to all subtypes of
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} that are between a {@code state_of_X}
         * and {@code X}.
         * </p>
         *
         * @param individual The Individual.
         * @return This builder.
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            ordinaryPhysicalObjectImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         * Returns an instance of OrdinaryPhysicalObject created from the properties set on this
         * builder.
         *
         * @return The built OrdinaryPhysicalObject.
         * @throws HqdmException If the OrdinaryPhysicalObject is missing any mandatory properties.
         */
        public OrdinaryPhysicalObject build() throws HqdmException {
            if (ordinaryPhysicalObjectImpl.hasValue(AGGREGATED_INTO)
                    && ordinaryPhysicalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(BEGINNING)
                    && ordinaryPhysicalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(ENDING)
                    && ordinaryPhysicalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(MEMBER__OF)
                    && ordinaryPhysicalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(MEMBER_OF)
                    && ordinaryPhysicalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(MEMBER_OF_KIND)
                    && ordinaryPhysicalObjectImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(PART__OF)
                    && ordinaryPhysicalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!ordinaryPhysicalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && ordinaryPhysicalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && ordinaryPhysicalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return ordinaryPhysicalObjectImpl;
        }
    }
}
