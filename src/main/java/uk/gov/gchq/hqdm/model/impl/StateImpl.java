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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfState;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.State;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of State.
 */
public class StateImpl extends HqdmObject implements State {
    /**
     *
     * @param iri
     */
    public StateImpl(final IRI iri) {
        super(StateImpl.class, iri, STATE);
    }

    /**
     * Builder for StateImpl.
     */
    public static class Builder {
        /** */
        private final StateImpl stateImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateImpl = new StateImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state may be a member_of one or more
         * {@link ClassOfState}.
         *
         * @param classOfState
         * @return
         */
        public final Builder member_Of(final ClassOfState classOfState) {
            stateImpl.addValue(MEMBER_OF, classOfState.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state may be a temporal_part_of one or more
         * {@link Individual}.
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            stateImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public State build() throws HqdmException {
            if (stateImpl.hasValue(AGGREGATED_INTO)
                    && stateImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateImpl.hasValue(BEGINNING)
                    && stateImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateImpl.hasValue(ENDING)
                    && stateImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateImpl.hasValue(MEMBER__OF)
                    && stateImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateImpl.hasValue(MEMBER_OF)
                    && stateImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateImpl.hasValue(PART__OF)
                    && stateImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateImpl.hasValue(TEMPORAL__PART_OF)
                    && stateImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateImpl.hasValue(TEMPORAL_PART_OF)
                    && stateImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateImpl;
        }
    }
}
