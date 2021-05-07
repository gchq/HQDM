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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_BIOLOGICAL_SYSTEM;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.BiologicalSystem;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfBiologicalSystem;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfBiologicalSystem;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfBiologicalSystem.
 */
public class StateOfBiologicalSystemImpl extends HqdmObject implements StateOfBiologicalSystem {
    /**
     *
     * @param iri
     */
    public StateOfBiologicalSystemImpl(final IRI iri) {
        super(StateOfBiologicalSystemImpl.class, iri, STATE_OF_BIOLOGICAL_SYSTEM);
    }

    /**
     * Builder for StateOfBiologicalSystemImpl.
     */
    public static class Builder {
        /** */
        private final StateOfBiologicalSystemImpl stateOfBiologicalSystemImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfBiologicalSystemImpl = new StateOfBiologicalSystemImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalSystemImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfBiologicalSystemImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalSystemImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfBiologicalSystemImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfBiologicalSystemImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of_relationship type where a state_of_biological_system may be a member_of one
         * or more {@link ClassOfStateOfBiologicalSystem}.
         *
         * @param classOfStateOfBiologicalSystem
         * @return
         */
        public final Builder member_Of(
                final ClassOfStateOfBiologicalSystem classOfStateOfBiologicalSystem) {
            stateOfBiologicalSystemImpl.addValue(MEMBER_OF,
                    classOfStateOfBiologicalSystem.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalSystemImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfBiologicalSystemImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalSystemImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_biological_system may be a
         * temporal_part_of one or more {@link BiologicalSystem}.
         *
         * @param biologicalSystem
         * @return
         */
        public final Builder temporal_Part_Of(final BiologicalSystem biologicalSystem) {
            stateOfBiologicalSystemImpl.addValue(TEMPORAL_PART_OF, biologicalSystem.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfBiologicalSystem build() throws HqdmException {
            if (stateOfBiologicalSystemImpl.hasValue(AGGREGATED_INTO)
                    && stateOfBiologicalSystemImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfBiologicalSystemImpl.hasValue(BEGINNING)
                    && stateOfBiologicalSystemImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfBiologicalSystemImpl.hasValue(ENDING)
                    && stateOfBiologicalSystemImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfBiologicalSystemImpl.hasValue(MEMBER__OF)
                    && stateOfBiologicalSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfBiologicalSystemImpl.hasValue(MEMBER_OF)
                    && stateOfBiologicalSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfBiologicalSystemImpl.hasValue(PART__OF)
                    && stateOfBiologicalSystemImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfBiologicalSystemImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfBiologicalSystemImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfBiologicalSystemImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfBiologicalSystemImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfBiologicalSystemImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfBiologicalSystemImpl;
        }
    }
}
