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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_SYSTEM_COMPONENT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSystemComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfSystemComponent;
import uk.gov.gchq.hqdm.model.SystemComponent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfSystemComponent.
 */
public class StateOfSystemComponentImpl extends HqdmObject implements StateOfSystemComponent {
    /**
     *
     * @param iri
     */
    public StateOfSystemComponentImpl(final IRI iri) {
        super(StateOfSystemComponentImpl.class, iri, STATE_OF_SYSTEM_COMPONENT);
    }

    /**
     * Builder for StateOfSystemComponentImpl.
     */
    public static class Builder {
        /** */
        private final StateOfSystemComponentImpl stateOfSystemComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfSystemComponentImpl = new StateOfSystemComponentImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemComponentImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfSystemComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemComponentImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfSystemComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfSystemComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_system_component may be a member_of one or
         * more {@link ClassOfStateOfSystemComponent}.
         *
         * @param classOfStateOfSystemComponent
         * @return
         */
        public final Builder member_Of(
                final ClassOfStateOfSystemComponent classOfStateOfSystemComponent) {
            stateOfSystemComponentImpl.addValue(MEMBER_OF, classOfStateOfSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemComponentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfSystemComponentImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSystemComponentImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_system_component may be a
         * temporal_part_of one or more {@link SystemComponent}.
         *
         * @param systemComponent
         * @return
         */
        public final Builder temporal_Part_Of(final SystemComponent systemComponent) {
            stateOfSystemComponentImpl.addValue(TEMPORAL_PART_OF, systemComponent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfSystemComponent build() throws HqdmException {
            if (stateOfSystemComponentImpl.hasValue(AGGREGATED_INTO)
                    && stateOfSystemComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfSystemComponentImpl.hasValue(BEGINNING)
                    && stateOfSystemComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfSystemComponentImpl.hasValue(ENDING)
                    && stateOfSystemComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfSystemComponentImpl.hasValue(MEMBER__OF)
                    && stateOfSystemComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfSystemComponentImpl.hasValue(MEMBER_OF)
                    && stateOfSystemComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfSystemComponentImpl.hasValue(PART__OF)
                    && stateOfSystemComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfSystemComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfSystemComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfSystemComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfSystemComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfSystemComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfSystemComponentImpl;
        }
    }
}
