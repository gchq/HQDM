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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSociallyConstructedObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SociallyConstructedObject;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfSociallyConstructedActivity;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfSociallyConstructedActivity.
 */
public class StateOfSociallyConstructedActivityImpl extends HqdmObject
        implements StateOfSociallyConstructedActivity {
    /**
     *
     * @param iri
     */
    public StateOfSociallyConstructedActivityImpl(final IRI iri) {
        super(StateOfSociallyConstructedActivityImpl.class, iri,
                STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY);
    }

    /**
     * Builder for StateOfSociallyConstructedActivityImpl.
     */
    public static class Builder {
        /** */
        private final StateOfSociallyConstructedActivityImpl stateOfSociallyConstructedActivityImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfSociallyConstructedActivityImpl =
                    new StateOfSociallyConstructedActivityImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedActivityImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfSociallyConstructedActivityImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedActivityImpl.addValue(CONSISTS__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfSociallyConstructedActivityImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfSociallyConstructedActivityImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfStateOfSociallyConstructedObject
         * @return
         */
        @SuppressWarnings("LineLength")
        public final Builder member_Of(
                final ClassOfStateOfSociallyConstructedObject classOfStateOfSociallyConstructedObject) {
            stateOfSociallyConstructedActivityImpl.addValue(MEMBER_OF,
                    classOfStateOfSociallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedActivityImpl.addValue(PART__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfSociallyConstructedActivityImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedActivityImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param sociallyConstructedObject
         * @return
         */
        public final Builder temporal_Part_Of(
                final SociallyConstructedObject sociallyConstructedObject) {
            stateOfSociallyConstructedActivityImpl.addValue(TEMPORAL_PART_OF,
                    sociallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfSociallyConstructedActivity build() throws HqdmException {
            if (stateOfSociallyConstructedActivityImpl.hasValue(AGGREGATED_INTO)
                    && stateOfSociallyConstructedActivityImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfSociallyConstructedActivityImpl.hasValue(BEGINNING)
                    && stateOfSociallyConstructedActivityImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfSociallyConstructedActivityImpl.hasValue(ENDING)
                    && stateOfSociallyConstructedActivityImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfSociallyConstructedActivityImpl.hasValue(MEMBER__OF)
                    && stateOfSociallyConstructedActivityImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfSociallyConstructedActivityImpl.hasValue(MEMBER_OF)
                    && stateOfSociallyConstructedActivityImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfSociallyConstructedActivityImpl.hasValue(PART__OF)
                    && stateOfSociallyConstructedActivityImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfSociallyConstructedActivityImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfSociallyConstructedActivityImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfSociallyConstructedActivityImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfSociallyConstructedActivityImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfSociallyConstructedActivityImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfSociallyConstructedActivityImpl;
        }
    }
}
