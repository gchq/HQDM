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
import static uk.gov.gchq.hqdm.iri.HQDM.CAUSES;
import static uk.gov.gchq.hqdm.iri.HQDM.CAUSES_BEGINNING;
import static uk.gov.gchq.hqdm.iri.HQDM.CAUSES_ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT_;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.DETERMINES;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REFERENCES;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TRANSFER_OF_OWNERSHIP;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Activity;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.Asset;
import uk.gov.gchq.hqdm.model.BeginningOfOwnership;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSociallyConstructedActivity;
import uk.gov.gchq.hqdm.model.EndingOfOwnership;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.ExchangeOfGoodsAndMoney;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.model.TransferOfOwnership;
import uk.gov.gchq.hqdm.model.Transferee;
import uk.gov.gchq.hqdm.model.Transferor;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of TransferOfOwnership.
 */
public class TransferOfOwnershipImpl extends HqdmObject implements TransferOfOwnership {
    /**
     *
     * @param iri
     */
    public TransferOfOwnershipImpl(final IRI iri) {
        super(TransferOfOwnershipImpl.class, iri, TRANSFER_OF_OWNERSHIP);
    }

    /**
     * Builder for TransferOfOwnershipImpl.
     */
    public static class Builder {
        /** */
        private final TransferOfOwnershipImpl transferOfOwnershipImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            transferOfOwnershipImpl = new TransferOfOwnershipImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            transferOfOwnershipImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            transferOfOwnershipImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            transferOfOwnershipImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         * A causes relationship type where a transfer_of_ownership causes exactly one
         * {@link BeginningOfOwnership}.
         *
         * @param beginningOfOwnership
         * @return
         */
        public final Builder causes_Beginning_M(final BeginningOfOwnership beginningOfOwnership) {
            transferOfOwnershipImpl.addValue(CAUSES_BEGINNING, beginningOfOwnership.getIri());
            return this;
        }

        /**
         * A causes relationship type where a transfer_of_ownership causes exactly one
         * {@link EndingOfOwnership}.
         *
         * @param endingOfOwnership
         * @return
         */
        public final Builder causes_Ending_M(final EndingOfOwnership endingOfOwnership) {
            transferOfOwnershipImpl.addValue(CAUSES_ENDING, endingOfOwnership.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            transferOfOwnershipImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param activity
         * @return
         */
        public final Builder consists_Of(final Activity activity) {
            transferOfOwnershipImpl.addValue(CONSISTS_OF, activity.getIri());
            return this;
        }

        /**
         * A consists_of_participant relationship type where a transfer_of_ownership
         * consists_of_participant exactly one {@link Transferor}.
         *
         * @param transferor
         * @return
         */
        public final Builder consists_Of_Participant(final Transferor transferor) {
            transferOfOwnershipImpl.addValue(CONSISTS_OF_PARTICIPANT, transferor.getIri());
            return this;
        }

        /**
         * A consists_of_participant relationship type where a transfer_of_ownership
         * consists_of_participant exactly one {@link Transferee}.
         *
         * @param transferee
         * @return
         */
        public final Builder consists_Of_Participant_(final Transferee transferee) {
            transferOfOwnershipImpl.addValue(CONSISTS_OF_PARTICIPANT_, transferee.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            transferOfOwnershipImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            transferOfOwnershipImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            transferOfOwnershipImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfSociallyConstructedActivity
         * @return
         */
        public final Builder member_Of(
                final ClassOfSociallyConstructedActivity classOfSociallyConstructedActivity) {
            transferOfOwnershipImpl.addValue(MEMBER_OF,
                    classOfSociallyConstructedActivity.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            transferOfOwnershipImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            transferOfOwnershipImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a transfer_of_ownership may be part_of not more than
         * one {@link ExchangeOfGoodsAndMoney}.
         *
         * @param exchangeOfGoodsAndMoney
         * @return
         */
        public final Builder part_Of(final ExchangeOfGoodsAndMoney exchangeOfGoodsAndMoney) {
            transferOfOwnershipImpl.addValue(PART_OF, exchangeOfGoodsAndMoney.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            transferOfOwnershipImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            transferOfOwnershipImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A references relationship type where a transfer_of_ownership references exactly one
         * {@link Asset}.
         *
         * @param asset
         * @return
         */
        public final Builder references_M(final Asset asset) {
            transferOfOwnershipImpl.addValue(REFERENCES, asset.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            transferOfOwnershipImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            transferOfOwnershipImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public TransferOfOwnership build() throws HqdmException {
            if (transferOfOwnershipImpl.hasValue(AGGREGATED_INTO)
                    && transferOfOwnershipImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (transferOfOwnershipImpl.hasValue(BEGINNING)
                    && transferOfOwnershipImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!transferOfOwnershipImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (!transferOfOwnershipImpl.hasValue(CAUSES_BEGINNING)) {
                throw new HqdmException("Property Not Set: causes_beginning");
            }
            if (!transferOfOwnershipImpl.hasValue(CAUSES_ENDING)) {
                throw new HqdmException("Property Not Set: causes_ending");
            }
            if (transferOfOwnershipImpl.hasValue(DETERMINES)
                    && transferOfOwnershipImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (transferOfOwnershipImpl.hasValue(ENDING)
                    && transferOfOwnershipImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (transferOfOwnershipImpl.hasValue(MEMBER__OF)
                    && transferOfOwnershipImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (transferOfOwnershipImpl.hasValue(MEMBER_OF)
                    && transferOfOwnershipImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!transferOfOwnershipImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (transferOfOwnershipImpl.hasValue(PART__OF)
                    && transferOfOwnershipImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (transferOfOwnershipImpl.hasValue(PART_OF)
                    && transferOfOwnershipImpl.value(PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (transferOfOwnershipImpl.hasValue(PART_OF_)
                    && transferOfOwnershipImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!transferOfOwnershipImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (!transferOfOwnershipImpl.hasValue(REFERENCES)) {
                throw new HqdmException("Property Not Set: references");
            }
            if (transferOfOwnershipImpl.hasValue(TEMPORAL__PART_OF)
                    && transferOfOwnershipImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (transferOfOwnershipImpl.hasValue(TEMPORAL_PART_OF)
                    && transferOfOwnershipImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return transferOfOwnershipImpl;
        }
    }
}
