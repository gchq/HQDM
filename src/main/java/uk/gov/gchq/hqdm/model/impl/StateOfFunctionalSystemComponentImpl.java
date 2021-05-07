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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.FunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfFunctionalSystemComponent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfFunctionalSystemComponent.
 */
public class StateOfFunctionalSystemComponentImpl extends HqdmObject
        implements StateOfFunctionalSystemComponent {
    /**
     *
     * @param iri
     */
    public StateOfFunctionalSystemComponentImpl(final IRI iri) {
        super(StateOfFunctionalSystemComponentImpl.class, iri,
                STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT);
    }

    /**
     * Builder for StateOfFunctionalSystemComponentImpl.
     */
    public static class Builder {
        /** */
        private final StateOfFunctionalSystemComponentImpl stateOfFunctionalSystemComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfFunctionalSystemComponentImpl = new StateOfFunctionalSystemComponentImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemComponentImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfFunctionalSystemComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemComponentImpl.addValue(CONSISTS__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfFunctionalSystemComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfFunctionalSystemComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_functional_system_component may be a
         * member_of one or more {@link ClassOfStateOfFunctionalSystemComponent}.
         *
         * @param classOfStateOfFunctionalSystemComponent
         * @return
         */
        @SuppressWarnings("LineLength")
        public final Builder member_Of(
                final ClassOfStateOfFunctionalSystemComponent classOfStateOfFunctionalSystemComponent) {
            stateOfFunctionalSystemComponentImpl.addValue(MEMBER_OF,
                    classOfStateOfFunctionalSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemComponentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfFunctionalSystemComponentImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfFunctionalSystemComponentImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_functional_system_component may be
         * a temporal_part_of one or more {@link FunctionalSystemComponent}.
         *
         * @param functionalSystemComponent
         * @return
         */
        public final Builder temporal_Part_Of(
                final FunctionalSystemComponent functionalSystemComponent) {
            stateOfFunctionalSystemComponentImpl.addValue(TEMPORAL_PART_OF,
                    functionalSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfFunctionalSystemComponent build() throws HqdmException {
            if (stateOfFunctionalSystemComponentImpl.hasValue(AGGREGATED_INTO)
                    && stateOfFunctionalSystemComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfFunctionalSystemComponentImpl.hasValue(BEGINNING)
                    && stateOfFunctionalSystemComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfFunctionalSystemComponentImpl.hasValue(ENDING)
                    && stateOfFunctionalSystemComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfFunctionalSystemComponentImpl.hasValue(MEMBER__OF)
                    && stateOfFunctionalSystemComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfFunctionalSystemComponentImpl.hasValue(MEMBER_OF)
                    && stateOfFunctionalSystemComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfFunctionalSystemComponentImpl.hasValue(PART__OF)
                    && stateOfFunctionalSystemComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfFunctionalSystemComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfFunctionalSystemComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfFunctionalSystemComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfFunctionalSystemComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfFunctionalSystemComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfFunctionalSystemComponentImpl;
        }
    }
}
