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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_BIOLOGICAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.BiologicalObject;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfBiologicalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfBiologicalObject;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfBiologicalObject.
 */
public class StateOfBiologicalObjectImpl extends HqdmObject implements StateOfBiologicalObject {
    /**
     *
     * @param iri
     */
    public StateOfBiologicalObjectImpl(final IRI iri) {
        super(StateOfBiologicalObjectImpl.class, iri, STATE_OF_BIOLOGICAL_OBJECT);
    }

    /**
     * Builder for StateOfBiologicalObjectImpl.
     */
    public static class Builder {
        /** */
        private final StateOfBiologicalObjectImpl stateOfBiologicalObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfBiologicalObjectImpl = new StateOfBiologicalObjectImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfBiologicalObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfBiologicalObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfBiologicalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_biological_object may be a member_of one
         * or more {@link ClassOfStateOfBiologicalObject}.
         *
         * @param classOfStateOfBiologicalObject
         * @return
         */
        public final Builder member_Of(
                final ClassOfStateOfBiologicalObject classOfStateOfBiologicalObject) {
            stateOfBiologicalObjectImpl.addValue(MEMBER_OF,
                    classOfStateOfBiologicalObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfBiologicalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfBiologicalObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_biological_object may be a
         * temporal_part_of one or more {@link BiologicalObject}.
         *
         * @param biologicalObject
         * @return
         */
        public final Builder temporal_Part_Of(final BiologicalObject biologicalObject) {
            stateOfBiologicalObjectImpl.addValue(TEMPORAL_PART_OF, biologicalObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfBiologicalObject build() throws HqdmException {
            if (stateOfBiologicalObjectImpl.hasValue(AGGREGATED_INTO)
                    && stateOfBiologicalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfBiologicalObjectImpl.hasValue(BEGINNING)
                    && stateOfBiologicalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfBiologicalObjectImpl.hasValue(ENDING)
                    && stateOfBiologicalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfBiologicalObjectImpl.hasValue(MEMBER__OF)
                    && stateOfBiologicalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfBiologicalObjectImpl.hasValue(MEMBER_OF)
                    && stateOfBiologicalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfBiologicalObjectImpl.hasValue(PART__OF)
                    && stateOfBiologicalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfBiologicalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfBiologicalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfBiologicalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfBiologicalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfBiologicalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfBiologicalObjectImpl;
        }
    }
}
