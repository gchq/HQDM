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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_PARTY;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfParty;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Party;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfParty;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfParty.
 */
public class StateOfPartyImpl extends HqdmObject implements StateOfParty {
    /**
     *
     * @param iri
     */
    public StateOfPartyImpl(final IRI iri) {
        super(StateOfPartyImpl.class, iri, STATE_OF_PARTY);
    }

    /**
     * Builder for StateOfPartyImpl.
     */
    public static class Builder {
        /** */
        private final StateOfPartyImpl stateOfPartyImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfPartyImpl = new StateOfPartyImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfPartyImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfPartyImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfPartyImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfPartyImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfPartyImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_party may be a member_of one or more
         * {@link ClassOfStateOfParty}.
         *
         * @param classOfStateOfParty
         * @return
         */
        public final Builder member_Of(final ClassOfStateOfParty classOfStateOfParty) {
            stateOfPartyImpl.addValue(MEMBER_OF, classOfStateOfParty.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfPartyImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfPartyImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfPartyImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_party may be a temporal_part_of one
         * or more {@link Party}.
         *
         * @param party
         * @return
         */
        public final Builder temporal_Part_Of(final Party party) {
            stateOfPartyImpl.addValue(TEMPORAL_PART_OF, party.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfParty build() throws HqdmException {
            if (stateOfPartyImpl.hasValue(AGGREGATED_INTO)
                    && stateOfPartyImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfPartyImpl.hasValue(BEGINNING)
                    && stateOfPartyImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfPartyImpl.hasValue(ENDING)
                    && stateOfPartyImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfPartyImpl.hasValue(MEMBER__OF)
                    && stateOfPartyImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfPartyImpl.hasValue(MEMBER_OF)
                    && stateOfPartyImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfPartyImpl.hasValue(PART__OF)
                    && stateOfPartyImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfPartyImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfPartyImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfPartyImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfPartyImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfPartyImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfPartyImpl;
        }
    }
}
