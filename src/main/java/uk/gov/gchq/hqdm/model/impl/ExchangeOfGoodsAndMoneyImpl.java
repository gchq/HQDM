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
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.DETERMINES;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.EXCHANGE_OF_GOODS_AND_MONEY;
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

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfContractExecution;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.ExchangeOfGoodsAndMoney;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SaleOfGoods;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.model.TransferOfOwnership;
import uk.gov.gchq.hqdm.model.TransferOfOwnershipOfMoney;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ExchangeOfGoodsAndMoney.
 */
public class ExchangeOfGoodsAndMoneyImpl extends HqdmObject implements ExchangeOfGoodsAndMoney {
    /**
     *
     * @param iri
     */
    public ExchangeOfGoodsAndMoneyImpl(final IRI iri) {
        super(ExchangeOfGoodsAndMoneyImpl.class, iri, EXCHANGE_OF_GOODS_AND_MONEY);
    }

    /**
     * Builder for ExchangeOfGoodsAndMoneyImpl.
     */
    public static class Builder {
        /** */
        private final ExchangeOfGoodsAndMoneyImpl exchangeOfGoodsAndMoneyImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            exchangeOfGoodsAndMoneyImpl = new ExchangeOfGoodsAndMoneyImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            exchangeOfGoodsAndMoneyImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            exchangeOfGoodsAndMoneyImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            exchangeOfGoodsAndMoneyImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            exchangeOfGoodsAndMoneyImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where an exchange_of_goods_and_money consists of exactly
         * one {@link TransferOfOwnership} as a part.
         *
         * @param transferOfOwnership
         * @return
         */
        public final Builder consists_Of(final TransferOfOwnership transferOfOwnership) {
            exchangeOfGoodsAndMoneyImpl.addValue(CONSISTS_OF, transferOfOwnership.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where an exchange_of_goods_and_money consists of exactly
         * one {@link TransferOfOwnershipOfMoney}.
         *
         * @param transferOfOwnershipOfMoney
         * @return
         */
        public final Builder consists_Of_(
                final TransferOfOwnershipOfMoney transferOfOwnershipOfMoney) {
            exchangeOfGoodsAndMoneyImpl.addValue(CONSISTS_OF_, transferOfOwnershipOfMoney.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            exchangeOfGoodsAndMoneyImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            exchangeOfGoodsAndMoneyImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            exchangeOfGoodsAndMoneyImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            exchangeOfGoodsAndMoneyImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfContractExecution
         * @return
         */
        public final Builder member_Of(final ClassOfContractExecution classOfContractExecution) {
            exchangeOfGoodsAndMoneyImpl.addValue(MEMBER_OF, classOfContractExecution.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            exchangeOfGoodsAndMoneyImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            exchangeOfGoodsAndMoneyImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where an exchange_of_goods_and_money is a part_of exactly one
         * {@link SaleOfGoods}.
         *
         * @param saleOfGoods
         * @return
         */
        public final Builder part_Of_M(final SaleOfGoods saleOfGoods) {
            exchangeOfGoodsAndMoneyImpl.addValue(PART_OF, saleOfGoods.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            exchangeOfGoodsAndMoneyImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            exchangeOfGoodsAndMoneyImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder references(final Thing thing) {
            exchangeOfGoodsAndMoneyImpl.addValue(REFERENCES, thing.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            exchangeOfGoodsAndMoneyImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            exchangeOfGoodsAndMoneyImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ExchangeOfGoodsAndMoney build() throws HqdmException {
            if (exchangeOfGoodsAndMoneyImpl.hasValue(AGGREGATED_INTO)
                    && exchangeOfGoodsAndMoneyImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(BEGINNING)
                    && exchangeOfGoodsAndMoneyImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!exchangeOfGoodsAndMoneyImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(DETERMINES)
                    && exchangeOfGoodsAndMoneyImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(ENDING)
                    && exchangeOfGoodsAndMoneyImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(MEMBER__OF)
                    && exchangeOfGoodsAndMoneyImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(MEMBER_OF)
                    && exchangeOfGoodsAndMoneyImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!exchangeOfGoodsAndMoneyImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(PART__OF)
                    && exchangeOfGoodsAndMoneyImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!exchangeOfGoodsAndMoneyImpl.hasValue(PART_OF)) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(PART_OF_)
                    && exchangeOfGoodsAndMoneyImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!exchangeOfGoodsAndMoneyImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(REFERENCES)
                    && exchangeOfGoodsAndMoneyImpl.value(REFERENCES).isEmpty()) {
                throw new HqdmException("Property Not Set: references");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(TEMPORAL__PART_OF)
                    && exchangeOfGoodsAndMoneyImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (exchangeOfGoodsAndMoneyImpl.hasValue(TEMPORAL_PART_OF)
                    && exchangeOfGoodsAndMoneyImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return exchangeOfGoodsAndMoneyImpl;
        }
    }
}
