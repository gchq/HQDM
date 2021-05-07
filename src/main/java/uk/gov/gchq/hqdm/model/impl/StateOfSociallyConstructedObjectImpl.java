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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT;
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
import uk.gov.gchq.hqdm.model.StateOfSociallyConstructedObject;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfSociallyConstructedObject.
 */
public class StateOfSociallyConstructedObjectImpl extends HqdmObject
        implements StateOfSociallyConstructedObject {
    /**
     *
     * @param iri
     */
    public StateOfSociallyConstructedObjectImpl(final IRI iri) {
        super(StateOfSociallyConstructedObjectImpl.class, iri,
                STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT);
    }

    /**
     * Builder for StateOfSociallyConstructedObjectImpl.
     */
    public static class Builder {
        /** */
        private final StateOfSociallyConstructedObjectImpl stateOfSociallyConstructedObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfSociallyConstructedObjectImpl = new StateOfSociallyConstructedObjectImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedObjectImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfSociallyConstructedObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedObjectImpl.addValue(CONSISTS__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfSociallyConstructedObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfSociallyConstructedObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_socially_constructed_object may be a
         * member_of one or more {@link ClassOfStateOfSociallyConstructedObject}.
         *
         * @param classOfStateOfSociallyConstructedObject
         * @return
         */
        @SuppressWarnings("LineLength")
        public final Builder member_Of(
                final ClassOfStateOfSociallyConstructedObject classOfStateOfSociallyConstructedObject) {
            stateOfSociallyConstructedObjectImpl.addValue(MEMBER_OF,
                    classOfStateOfSociallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfSociallyConstructedObjectImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSociallyConstructedObjectImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_socially_constructed_object may be
         * a temporal_part_of one or more {@link SociallyConstructedObject}.
         *
         * @param sociallyConstructedObject
         * @return
         */
        public final Builder temporal_Part_Of(
                final SociallyConstructedObject sociallyConstructedObject) {
            stateOfSociallyConstructedObjectImpl.addValue(TEMPORAL_PART_OF,
                    sociallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfSociallyConstructedObject build() throws HqdmException {
            if (stateOfSociallyConstructedObjectImpl.hasValue(AGGREGATED_INTO)
                    && stateOfSociallyConstructedObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfSociallyConstructedObjectImpl.hasValue(BEGINNING)
                    && stateOfSociallyConstructedObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfSociallyConstructedObjectImpl.hasValue(ENDING)
                    && stateOfSociallyConstructedObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfSociallyConstructedObjectImpl.hasValue(MEMBER__OF)
                    && stateOfSociallyConstructedObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfSociallyConstructedObjectImpl.hasValue(MEMBER_OF)
                    && stateOfSociallyConstructedObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfSociallyConstructedObjectImpl.hasValue(PART__OF)
                    && stateOfSociallyConstructedObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfSociallyConstructedObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfSociallyConstructedObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfSociallyConstructedObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfSociallyConstructedObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfSociallyConstructedObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfSociallyConstructedObjectImpl;
        }
    }
}
