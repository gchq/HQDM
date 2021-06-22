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
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PHYSICAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfPhysicalObject;
import uk.gov.gchq.hqdm.model.PhysicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of PhysicalObject.
 */
public class PhysicalObjectImpl extends HqdmObject implements PhysicalObject {
    /**
     * Constructs a new PhysicalObject.
     *
     * @param iri IRI of the PhysicalObject.
     */
    public PhysicalObjectImpl(final IRI iri) {
        super(PhysicalObjectImpl.class, iri, PHYSICAL_OBJECT);
    }

    /**
     * Builder for constructing instances of PhysicalObject.
     */
    public static class Builder {

        private final PhysicalObjectImpl physicalObjectImpl;

        /**
         * Constructs a Builder for a new PhysicalObject.
         *
         * @param iri IRI of the PhysicalObject.
         */
        public Builder(final IRI iri) {
            physicalObjectImpl = new PhysicalObjectImpl(iri);
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
            physicalObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
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
            physicalObjectImpl.addValue(BEGINNING, event.getIri());
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
            physicalObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
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
            physicalObjectImpl.addValue(ENDING, event.getIri());
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
            physicalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a
         * {@link PhysicalObject} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link ClassOfPhysicalObject}.
         *
         * @param classOfPhysicalObject The ClassOfPhysicalObject.
         * @return This builder.
         */
        public final Builder member_Of(final ClassOfPhysicalObject classOfPhysicalObject) {
            physicalObjectImpl.addValue(MEMBER_OF, classOfPhysicalObject.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a
         * {@link PhysicalObject} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link KindOfPhysicalObject}.
         *
         * @param kindOfPhysicalObject The KindOfPhysicalObject.
         * @return This builder.
         */
        public final Builder member_Of_Kind(final KindOfPhysicalObject kindOfPhysicalObject) {
            physicalObjectImpl.addValue(MEMBER_OF_KIND, kindOfPhysicalObject.getIri());
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
            physicalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
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
            physicalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
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
            physicalObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
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
            physicalObjectImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         * Returns an instance of PhysicalObject created from the properties set on this builder.
         *
         * @return The built PhysicalObject.
         * @throws HqdmException If the PhysicalObject is missing any mandatory properties.
         */
        public PhysicalObject build() throws HqdmException {
            if (physicalObjectImpl.hasValue(AGGREGATED_INTO)
                    && physicalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (physicalObjectImpl.hasValue(BEGINNING)
                    && physicalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (physicalObjectImpl.hasValue(ENDING)
                    && physicalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (physicalObjectImpl.hasValue(MEMBER__OF)
                    && physicalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (physicalObjectImpl.hasValue(MEMBER_OF)
                    && physicalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (physicalObjectImpl.hasValue(MEMBER_OF_KIND)
                    && physicalObjectImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (physicalObjectImpl.hasValue(PART__OF)
                    && physicalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!physicalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (physicalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && physicalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (physicalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && physicalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return physicalObjectImpl;
        }
    }
}
