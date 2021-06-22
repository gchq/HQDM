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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_ORDINARY_FUNCTIONAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.OrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfOrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfOrdinaryFunctionalObject.
 */
public class StateOfOrdinaryFunctionalObjectImpl extends HqdmObject
        implements StateOfOrdinaryFunctionalObject {
    /**
     * Constructs a new StateOfOrdinaryFunctionalObject.
     *
     * @param iri IRI of the StateOfOrdinaryFunctionalObject.
     */
    public StateOfOrdinaryFunctionalObjectImpl(final IRI iri) {
        super(StateOfOrdinaryFunctionalObjectImpl.class, iri, STATE_OF_ORDINARY_FUNCTIONAL_OBJECT);
    }

    /**
     * Builder for constructing instances of StateOfOrdinaryFunctionalObject.
     */
    public static class Builder {

        private final StateOfOrdinaryFunctionalObjectImpl stateOfOrdinaryFunctionalObjectImpl;

        /**
         * Constructs a Builder for a new StateOfOrdinaryFunctionalObject.
         *
         * @param iri IRI of the StateOfOrdinaryFunctionalObject.
         */
        public Builder(final IRI iri) {
            stateOfOrdinaryFunctionalObjectImpl = new StateOfOrdinaryFunctionalObjectImpl(iri);
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(BEGINNING, event.getIri());
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(CONSISTS__OF,
                    spatioTemporalExtent.getIri());
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(ENDING, event.getIri());
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a
         * {@link StateOfOrdinaryFunctionalObject} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link ClassOfStateOfOrdinaryFunctionalObject}.
         *
         * @param classOfStateOfOrdinaryFunctionalObject The ClassOfStateOfOrdinaryFunctionalObject.
         * @return This builder.
         */
        @SuppressWarnings("LineLength")
        public final Builder member_Of(
                final ClassOfStateOfOrdinaryFunctionalObject classOfStateOfOrdinaryFunctionalObject) {
            stateOfOrdinaryFunctionalObjectImpl.addValue(MEMBER_OF,
                    classOfStateOfOrdinaryFunctionalObject.getIri());
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
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
            stateOfOrdinaryFunctionalObjectImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} relationship type where a
         * {@link StateOfOrdinaryFunctionalObject} may be a temporal part of one or more
         * {@link OrdinaryFunctionalObject}.
         *
         * @param ordinaryFunctionalObject The OrdinaryFunctionalObject.
         * @return This builder.
         */
        public final Builder temporal_Part_Of(
                final OrdinaryFunctionalObject ordinaryFunctionalObject) {
            stateOfOrdinaryFunctionalObjectImpl.addValue(TEMPORAL_PART_OF,
                    ordinaryFunctionalObject.getIri());
            return this;
        }

        /**
         * Returns an instance of StateOfOrdinaryFunctionalObject created from the properties set on
         * this builder.
         *
         * @return The built StateOfOrdinaryFunctionalObject.
         * @throws HqdmException If the StateOfOrdinaryFunctionalObject is missing any mandatory
         *         properties.
         */
        public StateOfOrdinaryFunctionalObject build() throws HqdmException {
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(AGGREGATED_INTO)
                    && stateOfOrdinaryFunctionalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(BEGINNING)
                    && stateOfOrdinaryFunctionalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(ENDING)
                    && stateOfOrdinaryFunctionalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(MEMBER__OF)
                    && stateOfOrdinaryFunctionalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(MEMBER_OF)
                    && stateOfOrdinaryFunctionalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(PART__OF)
                    && stateOfOrdinaryFunctionalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfOrdinaryFunctionalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfOrdinaryFunctionalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfOrdinaryFunctionalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfOrdinaryFunctionalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfOrdinaryFunctionalObjectImpl;
        }
    }
}
