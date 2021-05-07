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
import static uk.gov.gchq.hqdm.iri.HQDM.PARTICIPANT;
import static uk.gov.gchq.hqdm.iri.HQDM.PARTICIPANT_IN;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfParticipant;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.ParticipantInActivityOrAssociation;
import uk.gov.gchq.hqdm.model.PhysicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Participant.
 */
public class ParticipantImpl extends HqdmObject implements Participant {
    /**
     *
     * @param iri
     */
    public ParticipantImpl(final IRI iri) {
        super(ParticipantImpl.class, iri, PARTICIPANT);
    }

    /**
     * Builder for ParticipantImpl.
     */
    public static class Builder {
        /** */
        private final ParticipantImpl participantImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            participantImpl = new ParticipantImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            participantImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            participantImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            participantImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            participantImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            participantImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a participant may be a member_of one or more
         * {@link ClassOfParticipant}.
         *
         * @param classOfParticipant
         * @return
         */
        public final Builder member_Of(final ClassOfParticipant classOfParticipant) {
            participantImpl.addValue(MEMBER_OF, classOfParticipant.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where each participant is a member_of one or more
         * {@link Role}.
         *
         * @param role
         * @return
         */
        public final Builder member_Of_Kind_M(final Role role) {
            participantImpl.addValue(MEMBER_OF_KIND, role.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            participantImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            participantImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param participantInActivityOrAssociation
         * @return
         */
        public final Builder participant_In(
                final ParticipantInActivityOrAssociation participantInActivityOrAssociation) {
            participantImpl.addValue(PARTICIPANT_IN, participantInActivityOrAssociation.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            participantImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param physicalObject
         * @return
         */
        public final Builder temporal_Part_Of(final PhysicalObject physicalObject) {
            participantImpl.addValue(TEMPORAL_PART_OF, physicalObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Participant build() throws HqdmException {
            if (participantImpl.hasValue(AGGREGATED_INTO)
                    && participantImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (participantImpl.hasValue(BEGINNING)
                    && participantImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (participantImpl.hasValue(ENDING)
                    && participantImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (participantImpl.hasValue(MEMBER__OF)
                    && participantImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (participantImpl.hasValue(MEMBER_OF)
                    && participantImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!participantImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (participantImpl.hasValue(PART__OF)
                    && participantImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!participantImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (participantImpl.hasValue(PARTICIPANT_IN)
                    && participantImpl.value(PARTICIPANT_IN).isEmpty()) {
                throw new HqdmException("Property Not Set: participant_in");
            }
            if (participantImpl.hasValue(TEMPORAL__PART_OF)
                    && participantImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (participantImpl.hasValue(TEMPORAL_PART_OF)
                    && participantImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return participantImpl;
        }
    }
}
