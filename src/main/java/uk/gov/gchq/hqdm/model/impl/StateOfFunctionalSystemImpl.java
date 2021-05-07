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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_FUNCTIONAL_SYSTEM;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfFunctionalSystem;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.FunctionalSystem;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfFunctionalSystem;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfFunctionalSystem.
 */
public class StateOfFunctionalSystemImpl extends HqdmObject implements StateOfFunctionalSystem {
    /**
     *
     * @param iri
     */
    public StateOfFunctionalSystemImpl(final IRI iri) {
        super(StateOfFunctionalSystemImpl.class, iri, STATE_OF_FUNCTIONAL_SYSTEM);
    }

    /**
     * Builder for StateOfFunctionalSystemImpl.
     */
    public static class Builder {
        /** */
        private final StateOfFunctionalSystemImpl stateOfFunctionalSystemImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfFunctionalSystemImpl = new StateOfFunctionalSystemImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfFunctionalSystemImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfFunctionalSystemImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfFunctionalSystemImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_functional_system may be a member_of one
         * or more {@link ClassOfStateOfFunctionalSystem}.
         *
         * @param classOfStateOfFunctionalSystem
         * @return
         */
        public final Builder member_Of(
                final ClassOfStateOfFunctionalSystem classOfStateOfFunctionalSystem) {
            stateOfFunctionalSystemImpl.addValue(MEMBER_OF,
                    classOfStateOfFunctionalSystem.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfFunctionalSystemImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_functional_system may be a
         * temporal_part_of one or more {@link FunctionalSystem}.
         *
         * @param functionalSystem
         * @return
         */
        public final Builder temporal_Part_Of(final FunctionalSystem functionalSystem) {
            stateOfFunctionalSystemImpl.addValue(TEMPORAL_PART_OF, functionalSystem.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfFunctionalSystem build() throws HqdmException {
            if (stateOfFunctionalSystemImpl.hasValue(AGGREGATED_INTO)
                    && stateOfFunctionalSystemImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfFunctionalSystemImpl.hasValue(BEGINNING)
                    && stateOfFunctionalSystemImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfFunctionalSystemImpl.hasValue(ENDING)
                    && stateOfFunctionalSystemImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfFunctionalSystemImpl.hasValue(MEMBER__OF)
                    && stateOfFunctionalSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfFunctionalSystemImpl.hasValue(MEMBER_OF)
                    && stateOfFunctionalSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfFunctionalSystemImpl.hasValue(PART__OF)
                    && stateOfFunctionalSystemImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfFunctionalSystemImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfFunctionalSystemImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfFunctionalSystemImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfFunctionalSystemImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfFunctionalSystemImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfFunctionalSystemImpl;
        }
    }
}
