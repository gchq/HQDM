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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_SIGN;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSign;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Sign;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfSign;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfSign.
 */
public class StateOfSignImpl extends HqdmObject implements StateOfSign {
    /**
     *
     * @param iri
     */
    public StateOfSignImpl(final IRI iri) {
        super(StateOfSignImpl.class, iri, STATE_OF_SIGN);
    }

    /**
     * Builder for StateOfSignImpl.
     */
    public static class Builder {
        /** */
        private final StateOfSignImpl stateOfSignImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfSignImpl = new StateOfSignImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSignImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfSignImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSignImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfSignImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfSignImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_sign may be a member_of one or more
         * {@link ClassOfStateOfSign}.
         *
         * @param classOfStateOfSign
         * @return
         */
        public final Builder member_Of(final ClassOfStateOfSign classOfStateOfSign) {
            stateOfSignImpl.addValue(MEMBER_OF, classOfStateOfSign.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSignImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfSignImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSignImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_sign may be a temporal_part_of one
         * or more {@link Sign}.
         *
         * @param sign
         * @return
         */
        public final Builder temporal_Part_Of(final Sign sign) {
            stateOfSignImpl.addValue(TEMPORAL_PART_OF, sign.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfSign build() throws HqdmException {
            if (stateOfSignImpl.hasValue(AGGREGATED_INTO)
                    && stateOfSignImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfSignImpl.hasValue(BEGINNING)
                    && stateOfSignImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfSignImpl.hasValue(ENDING)
                    && stateOfSignImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfSignImpl.hasValue(MEMBER__OF)
                    && stateOfSignImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfSignImpl.hasValue(MEMBER_OF)
                    && stateOfSignImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfSignImpl.hasValue(PART__OF)
                    && stateOfSignImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfSignImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfSignImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfSignImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfSignImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfSignImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfSignImpl;
        }
    }
}
