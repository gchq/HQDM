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
import static uk.gov.gchq.hqdm.iri.HQDM.LANGUAGE_COMMUNITY;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrganization;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfOrganization;
import uk.gov.gchq.hqdm.model.LanguageCommunity;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of LanguageCommunity.
 */
public class LanguageCommunityImpl extends HqdmObject implements LanguageCommunity {
    /**
     *
     * @param iri
     */
    public LanguageCommunityImpl(final IRI iri) {
        super(LanguageCommunityImpl.class, iri, LANGUAGE_COMMUNITY);
    }

    /**
     * Builder for LanguageCommunityImpl.
     */
    public static class Builder {
        /** */
        private final LanguageCommunityImpl languageCommunityImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            languageCommunityImpl = new LanguageCommunityImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            languageCommunityImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            languageCommunityImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            languageCommunityImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            languageCommunityImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            languageCommunityImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfStateOfOrganization
         * @return
         */
        public final Builder member_Of(
                final ClassOfStateOfOrganization classOfStateOfOrganization) {
            languageCommunityImpl.addValue(MEMBER_OF, classOfStateOfOrganization.getIri());
            return this;
        }

        /**
         *
         * @param kindOfOrganization
         * @return
         */
        public final Builder member_Of_Kind(final KindOfOrganization kindOfOrganization) {
            languageCommunityImpl.addValue(MEMBER_OF_KIND, kindOfOrganization.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            languageCommunityImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            languageCommunityImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            languageCommunityImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param languageCommunity
         * @return
         */
        public final Builder temporal_Part_Of(final LanguageCommunity languageCommunity) {
            languageCommunityImpl.addValue(TEMPORAL_PART_OF, languageCommunity.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public LanguageCommunity build() throws HqdmException {
            if (languageCommunityImpl.hasValue(AGGREGATED_INTO)
                    && languageCommunityImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (languageCommunityImpl.hasValue(BEGINNING)
                    && languageCommunityImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (languageCommunityImpl.hasValue(ENDING)
                    && languageCommunityImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (languageCommunityImpl.hasValue(MEMBER__OF)
                    && languageCommunityImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (languageCommunityImpl.hasValue(MEMBER_OF)
                    && languageCommunityImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (languageCommunityImpl.hasValue(MEMBER_OF_KIND)
                    && languageCommunityImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (languageCommunityImpl.hasValue(PART__OF)
                    && languageCommunityImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!languageCommunityImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (languageCommunityImpl.hasValue(TEMPORAL__PART_OF)
                    && languageCommunityImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (languageCommunityImpl.hasValue(TEMPORAL_PART_OF)
                    && languageCommunityImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return languageCommunityImpl;
        }
    }
}
