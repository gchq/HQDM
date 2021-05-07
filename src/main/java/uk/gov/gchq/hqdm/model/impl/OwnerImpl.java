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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.OWNER;
import static uk.gov.gchq.hqdm.iri.HQDM.PARTICIPANT_IN;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfParty;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Owner;
import uk.gov.gchq.hqdm.model.Ownership;
import uk.gov.gchq.hqdm.model.Party;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Owner.
 */
public class OwnerImpl extends HqdmObject implements Owner {
    /**
     *
     * @param iri
     */
    public OwnerImpl(final IRI iri) {
        super(OwnerImpl.class, iri, OWNER);
    }

    /**
     * Builder for OwnerImpl.
     */
    public static class Builder {
        /** */
        private final OwnerImpl ownerImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            ownerImpl = new OwnerImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            ownerImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            ownerImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ownerImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            ownerImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            ownerImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfStateOfParty
         * @return
         */
        public final Builder member_Of(final ClassOfStateOfParty classOfStateOfParty) {
            ownerImpl.addValue(MEMBER_OF, classOfStateOfParty.getIri());
            return this;
        }

        /**
         *
         * @param role
         * @return
         */
        public final Builder member_Of_Kind_M(final Role role) {
            ownerImpl.addValue(MEMBER_OF_KIND, role.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ownerImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            ownerImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A participant_in relationship type where an owner is a participant_in exactly one
         * {@link Ownership}.
         *
         * @param ownership
         * @return
         */
        public final Builder participant_In_M(final Ownership ownership) {
            ownerImpl.addValue(PARTICIPANT_IN, ownership.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ownerImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param party
         * @return
         */
        public final Builder temporal_Part_Of(final Party party) {
            ownerImpl.addValue(TEMPORAL_PART_OF, party.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Owner build() throws HqdmException {
            if (ownerImpl.hasValue(AGGREGATED_INTO)
                    && ownerImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (ownerImpl.hasValue(BEGINNING)
                    && ownerImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (ownerImpl.hasValue(ENDING)
                    && ownerImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (ownerImpl.hasValue(MEMBER__OF)
                    && ownerImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (ownerImpl.hasValue(MEMBER_OF)
                    && ownerImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!ownerImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (ownerImpl.hasValue(PART__OF)
                    && ownerImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!ownerImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (!ownerImpl.hasValue(PARTICIPANT_IN)) {
                throw new HqdmException("Property Not Set: participant_in");
            }
            if (ownerImpl.hasValue(TEMPORAL__PART_OF)
                    && ownerImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (ownerImpl.hasValue(TEMPORAL_PART_OF)
                    && ownerImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return ownerImpl;
        }
    }
}
