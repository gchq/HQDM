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
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT_;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.OWNERSHIP;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Asset;
import uk.gov.gchq.hqdm.model.BeginningOfOwnership;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfAssociation;
import uk.gov.gchq.hqdm.model.EndingOfOwnership;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfAssociation;
import uk.gov.gchq.hqdm.model.Owner;
import uk.gov.gchq.hqdm.model.Ownership;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Ownership.
 */
public class OwnershipImpl extends HqdmObject implements Ownership {
    /**
     *
     * @param iri
     */
    public OwnershipImpl(final IRI iri) {
        super(OwnershipImpl.class, iri, OWNERSHIP);
    }

    /**
     * Builder for OwnershipImpl.
     */
    public static class Builder {
        /** */
        private final OwnershipImpl ownershipImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            ownershipImpl = new OwnershipImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            ownershipImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A beginning relationship type where an ownership has as beginning exactly one
         * {@link BeginningOfOwnership}.
         *
         * @param beginningOfOwnership
         * @return
         */
        public final Builder beginning_M(final BeginningOfOwnership beginningOfOwnership) {
            ownershipImpl.addValue(BEGINNING, beginningOfOwnership.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ownershipImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A consists_of_participant relationship type where an ownership consists_of_participant
         * exactly one {@link Owner}.
         *
         * @param owner
         * @return
         */
        public final Builder consists_Of_Participant(final Owner owner) {
            ownershipImpl.addValue(CONSISTS_OF_PARTICIPANT, owner.getIri());
            return this;
        }

        /**
         * A consists_of_participant relationship type where an ownership association
         * consists_of_participant exactly one {@link Asset}.
         *
         * @param asset
         * @return
         */
        public final Builder consists_Of_Participant_(final Asset asset) {
            ownershipImpl.addValue(CONSISTS_OF_PARTICIPANT_, asset.getIri());
            return this;
        }

        /**
         * An ending relationship type where an ownership has as ending not more than one
         * {@link EndingOfOwnership}.
         *
         * @param endingOfOwnership
         * @return
         */
        public final Builder ending(final EndingOfOwnership endingOfOwnership) {
            ownershipImpl.addValue(ENDING, endingOfOwnership.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            ownershipImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfAssociation
         * @return
         */
        public final Builder member_Of(final ClassOfAssociation classOfAssociation) {
            ownershipImpl.addValue(MEMBER_OF, classOfAssociation.getIri());
            return this;
        }

        /**
         *
         * @param kindOfAssociation
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfAssociation kindOfAssociation) {
            ownershipImpl.addValue(MEMBER_OF_KIND, kindOfAssociation.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ownershipImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            ownershipImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ownershipImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            ownershipImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Ownership build() throws HqdmException {
            if (ownershipImpl.hasValue(AGGREGATED_INTO)
                    && ownershipImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (!ownershipImpl.hasValue(BEGINNING)) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (ownershipImpl.hasValue(ENDING)
                    && ownershipImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (ownershipImpl.hasValue(MEMBER__OF)
                    && ownershipImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (ownershipImpl.hasValue(MEMBER_OF)
                    && ownershipImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!ownershipImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (ownershipImpl.hasValue(PART__OF)
                    && ownershipImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!ownershipImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (ownershipImpl.hasValue(TEMPORAL__PART_OF)
                    && ownershipImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (ownershipImpl.hasValue(TEMPORAL_PART_OF)
                    && ownershipImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return ownershipImpl;
        }
    }
}
