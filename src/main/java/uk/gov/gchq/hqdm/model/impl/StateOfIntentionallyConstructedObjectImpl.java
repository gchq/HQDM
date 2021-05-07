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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfIntentionallyConstructedObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.IntentionallyConstructedObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfIntentionallyConstructedObject;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfIntentionallyConstructedObject.
 */
public class StateOfIntentionallyConstructedObjectImpl extends HqdmObject
        implements StateOfIntentionallyConstructedObject {
    /**
     *
     * @param iri
     */
    public StateOfIntentionallyConstructedObjectImpl(final IRI iri) {
        super(StateOfIntentionallyConstructedObjectImpl.class, iri,
                STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT);
    }

    /**
     * Builder for StateOfIntentionallyConstructedObjectImpl.
     */
    public static class Builder {
        /** */
        @SuppressWarnings("LineLength")
        private final StateOfIntentionallyConstructedObjectImpl stateOfIntentionallyConstructedObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfIntentionallyConstructedObjectImpl =
                    new StateOfIntentionallyConstructedObjectImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfIntentionallyConstructedObjectImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfIntentionallyConstructedObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfIntentionallyConstructedObjectImpl.addValue(CONSISTS__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfIntentionallyConstructedObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfIntentionallyConstructedObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_intentionally_constructed_object may be a
         * member_of one or more {@link ClassOfStateOfIntentionallyConstructedObject}.
         *
         * @param classOfStateOfIntentionallyConstructedObject
         * @return
         */
        @SuppressWarnings("LineLength")
        public final Builder member_Of(
                final ClassOfStateOfIntentionallyConstructedObject classOfStateOfIntentionallyConstructedObject) {
            stateOfIntentionallyConstructedObjectImpl.addValue(MEMBER_OF,
                    classOfStateOfIntentionallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfIntentionallyConstructedObjectImpl.addValue(PART__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfIntentionallyConstructedObjectImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfIntentionallyConstructedObjectImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_intentionally_constructed_object
         * may be a temporal_part_of one or more {@link IntentionallyConstructedObject}.
         *
         * @param intentionallyConstructedObject
         * @return
         */
        public final Builder temporal_Part_Of(
                final IntentionallyConstructedObject intentionallyConstructedObject) {
            stateOfIntentionallyConstructedObjectImpl.addValue(TEMPORAL_PART_OF,
                    intentionallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfIntentionallyConstructedObject build() throws HqdmException {
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(AGGREGATED_INTO)
                    && stateOfIntentionallyConstructedObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(BEGINNING)
                    && stateOfIntentionallyConstructedObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(ENDING)
                    && stateOfIntentionallyConstructedObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(MEMBER__OF)
                    && stateOfIntentionallyConstructedObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(MEMBER_OF)
                    && stateOfIntentionallyConstructedObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(PART__OF)
                    && stateOfIntentionallyConstructedObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfIntentionallyConstructedObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfIntentionallyConstructedObjectImpl.value(TEMPORAL__PART_OF)
                            .isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfIntentionallyConstructedObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfIntentionallyConstructedObjectImpl.value(TEMPORAL_PART_OF)
                            .isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfIntentionallyConstructedObjectImpl;
        }
    }
}
