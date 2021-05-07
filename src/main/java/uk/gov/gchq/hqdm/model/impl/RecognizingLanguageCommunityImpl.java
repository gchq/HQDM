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
import static uk.gov.gchq.hqdm.iri.HQDM.PARTICIPANT_IN;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.RECOGNIZING_LANGUAGE_COMMUNITY;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrganization;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.LanguageCommunity;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.RecognizingLanguageCommunity;
import uk.gov.gchq.hqdm.model.RepresentationBySign;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of RecognizingLanguageCommunity.
 */
public class RecognizingLanguageCommunityImpl extends HqdmObject
        implements RecognizingLanguageCommunity {
    /**
     *
     * @param iri
     */
    public RecognizingLanguageCommunityImpl(final IRI iri) {
        super(RecognizingLanguageCommunityImpl.class, iri, RECOGNIZING_LANGUAGE_COMMUNITY);
    }

    /**
     * Builder for RecognizingLanguageCommunityImpl.
     */
    public static class Builder {
        /** */
        private final RecognizingLanguageCommunityImpl recognizingLanguageCommunityImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            recognizingLanguageCommunityImpl = new RecognizingLanguageCommunityImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            recognizingLanguageCommunityImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            recognizingLanguageCommunityImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            recognizingLanguageCommunityImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfStateOfOrganization
         * @return
         */
        public final Builder member_Of(
                final ClassOfStateOfOrganization classOfStateOfOrganization) {
            recognizingLanguageCommunityImpl.addValue(MEMBER_OF,
                    classOfStateOfOrganization.getIri());
            return this;
        }

        /**
         *
         * @param role
         * @return
         */
        public final Builder member_Of_Kind_M(final Role role) {
            recognizingLanguageCommunityImpl.addValue(MEMBER_OF_KIND, role.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            recognizingLanguageCommunityImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         * A participant_in relationship type where a recognizing_language_community is a
         * participant_in one or more {@link RepresentationBySign}.
         *
         * @param representationBySign
         * @return
         */
        public final Builder participant_In(final RepresentationBySign representationBySign) {
            recognizingLanguageCommunityImpl.addValue(PARTICIPANT_IN,
                    representationBySign.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param languageCommunity
         * @return
         */
        public final Builder temporal_Part_Of(final LanguageCommunity languageCommunity) {
            recognizingLanguageCommunityImpl.addValue(TEMPORAL_PART_OF, languageCommunity.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public RecognizingLanguageCommunity build() throws HqdmException {
            if (recognizingLanguageCommunityImpl.hasValue(AGGREGATED_INTO)
                    && recognizingLanguageCommunityImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (recognizingLanguageCommunityImpl.hasValue(BEGINNING)
                    && recognizingLanguageCommunityImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (recognizingLanguageCommunityImpl.hasValue(ENDING)
                    && recognizingLanguageCommunityImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (recognizingLanguageCommunityImpl.hasValue(MEMBER__OF)
                    && recognizingLanguageCommunityImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (recognizingLanguageCommunityImpl.hasValue(MEMBER_OF)
                    && recognizingLanguageCommunityImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!recognizingLanguageCommunityImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (recognizingLanguageCommunityImpl.hasValue(PART__OF)
                    && recognizingLanguageCommunityImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!recognizingLanguageCommunityImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (recognizingLanguageCommunityImpl.hasValue(PARTICIPANT_IN)
                    && recognizingLanguageCommunityImpl.value(PARTICIPANT_IN).isEmpty()) {
                throw new HqdmException("Property Not Set: participant_in");
            }
            if (recognizingLanguageCommunityImpl.hasValue(TEMPORAL__PART_OF)
                    && recognizingLanguageCommunityImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (recognizingLanguageCommunityImpl.hasValue(TEMPORAL_PART_OF)
                    && recognizingLanguageCommunityImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return recognizingLanguageCommunityImpl;
        }
    }
}
