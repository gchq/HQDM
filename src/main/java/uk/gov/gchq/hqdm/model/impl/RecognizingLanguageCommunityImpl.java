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
     * Constructs a new RecognizingLanguageCommunity.
     *
     * @param iri IRI of the RecognizingLanguageCommunity.
     */
    public RecognizingLanguageCommunityImpl(final IRI iri) {
        super(RecognizingLanguageCommunityImpl.class, iri, RECOGNIZING_LANGUAGE_COMMUNITY);
    }

    /**
     * Builder for constructing instances of RecognizingLanguageCommunity.
     */
    public static class Builder {

        private final RecognizingLanguageCommunityImpl recognizingLanguageCommunityImpl;

        /**
         * Constructs a Builder for a new RecognizingLanguageCommunity.
         *
         * @param iri IRI of the RecognizingLanguageCommunity.
         */
        public Builder(final IRI iri) {
            recognizingLanguageCommunityImpl = new RecognizingLanguageCommunityImpl(iri);
        }

        /**
         * A relationship type where a {@link SpatioTemporalExtent} may be aggregated into one or
         * more others.
         * <p>
         * Note: This has the same meaning as, but different representation to, the
         * {@link uk.gov.gchq.hqdm.model.Aggregation} entity type.
         * </p>
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its beginning.
         *
         * @param event The Event.
         * @return This builder.
         */
        public final Builder beginning(final Event event) {
            recognizingLanguageCommunityImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link SpatioTemporalExtent} may consist of one or more
         * others.
         *
         * <p>
         * Note: This is the inverse of {@link uk.gov.gchq.hqdm.iri.HQDM#PART__OF}.
         * </p>
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its ending.
         *
         * @param event The Event.
         * @return This builder.
         */
        public final Builder ending(final Event event) {
            recognizingLanguageCommunityImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            recognizingLanguageCommunityImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.StateOfOrganization} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link ClassOfStateOfOrganization}.
         *
         * @param classOfStateOfOrganization The ClassOfStateOfOrganization.
         * @return This builder.
         */
        public final Builder member_Of(
                final ClassOfStateOfOrganization classOfStateOfOrganization) {
            recognizingLanguageCommunityImpl.addValue(MEMBER_OF,
                    classOfStateOfOrganization.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF_KIND} relationship type where each
         * {@link uk.gov.gchq.hqdm.model.Participant} is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more {@link Role}.
         *
         * @param role The Role.
         * @return This builder.
         */
        public final Builder member_Of_Kind_M(final Role role) {
            recognizingLanguageCommunityImpl.addValue(MEMBER_OF_KIND, role.getIri());
            return this;
        }

        /**
         * An {@link uk.gov.gchq.hqdm.iri.HQDM#AGGREGATED_INTO} relationship type where a
         * {@link SpatioTemporalExtent} may be part of another and the whole has emergent properties
         * and is more than just the sum of its parts.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} may be {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} one or more
         * {@link PossibleWorld}.
         *
         * <p>
         * Note: The relationship is optional because a {@link PossibleWorld} is not
         * {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} any other {@link SpatioTemporalExtent}.
         * </p>
         *
         * @param possibleWorld The PossibleWorld.
         * @return This builder.
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            recognizingLanguageCommunityImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PARTICIPANT_IN} relationship type where a
         * {@link RecognizingLanguageCommunity} is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#PARTICIPANT_IN} one or more
         * {@link RepresentationBySign}.
         *
         * @param representationBySign The RepresentationBySign.
         * @return This builder.
         */
        public final Builder participant_In(final RepresentationBySign representationBySign) {
            recognizingLanguageCommunityImpl.addValue(PARTICIPANT_IN,
                    representationBySign.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} may be a temporal part of one or more other
         * {@link SpatioTemporalExtent}.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            recognizingLanguageCommunityImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.StateOfLanguageCommunity} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} one or more {@link LanguageCommunity}.
         *
         * @param languageCommunity The LanguageCommunity.
         * @return This builder.
         */
        public final Builder temporal_Part_Of(final LanguageCommunity languageCommunity) {
            recognizingLanguageCommunityImpl.addValue(TEMPORAL_PART_OF, languageCommunity.getIri());
            return this;
        }

        /**
         * Returns an instance of RecognizingLanguageCommunity created from the properties set on
         * this builder.
         *
         * @return The built RecognizingLanguageCommunity.
         * @throws HqdmException If the RecognizingLanguageCommunity is missing any mandatory
         *         properties.
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
