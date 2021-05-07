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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_SYSTEM;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSystem;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfSystem;
import uk.gov.gchq.hqdm.model.System;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfSystem.
 */
public class StateOfSystemImpl extends HqdmObject implements StateOfSystem {
    /**
     *
     * @param iri
     */
    public StateOfSystemImpl(final IRI iri) {
        super(StateOfSystemImpl.class, iri, STATE_OF_SYSTEM);
    }

    /**
     * Builder for StateOfSystemImpl.
     */
    public static class Builder {
        /** */
        private final StateOfSystemImpl stateOfSystemImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfSystemImpl = new StateOfSystemImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfSystemImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfSystemImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfSystemImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_system may be a member_of one or more
         * {@link ClassOfStateOfSystem}.
         *
         * @param classOfStateOfSystem
         * @return
         */
        public final Builder member_Of(final ClassOfStateOfSystem classOfStateOfSystem) {
            stateOfSystemImpl.addValue(MEMBER_OF, classOfStateOfSystem.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfSystemImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_system may be a temporal_part_of
         * one or more {@link System}.
         *
         * @param system
         * @return
         */
        public final Builder temporal_Part_Of(final System system) {
            stateOfSystemImpl.addValue(TEMPORAL_PART_OF, system.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfSystem build() throws HqdmException {
            if (stateOfSystemImpl.hasValue(AGGREGATED_INTO)
                    && stateOfSystemImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfSystemImpl.hasValue(BEGINNING)
                    && stateOfSystemImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfSystemImpl.hasValue(ENDING)
                    && stateOfSystemImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfSystemImpl.hasValue(MEMBER__OF)
                    && stateOfSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfSystemImpl.hasValue(MEMBER_OF)
                    && stateOfSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfSystemImpl.hasValue(PART__OF)
                    && stateOfSystemImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfSystemImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfSystemImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfSystemImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfSystemImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfSystemImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfSystemImpl;
        }
    }
}
