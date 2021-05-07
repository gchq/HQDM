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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REFERENCES;
import static uk.gov.gchq.hqdm.iri.HQDM.SALE_OF_GOODS;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfContractProcess;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.ExchangeOfGoodsAndMoney;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.OfferAndAcceptanceForGoods;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.ReachingAgreement;
import uk.gov.gchq.hqdm.model.SaleOfGoods;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of SaleOfGoods.
 */
public class SaleOfGoodsImpl extends HqdmObject implements SaleOfGoods {
    /**
     *
     * @param iri
     */
    public SaleOfGoodsImpl(final IRI iri) {
        super(SaleOfGoodsImpl.class, iri, SALE_OF_GOODS);
    }

    /**
     * Builder for SaleOfGoodsImpl.
     */
    public static class Builder {
        /** */
        private final SaleOfGoodsImpl saleOfGoodsImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            saleOfGoodsImpl = new SaleOfGoodsImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            saleOfGoodsImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            saleOfGoodsImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            saleOfGoodsImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            saleOfGoodsImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where a sale_of_goods consists_of exactly one
         * {@link OfferAndAcceptanceForGoods}.
         *
         * @param offerAndAcceptanceForGoods
         * @return
         */
        public final Builder consists_Of(
                final OfferAndAcceptanceForGoods offerAndAcceptanceForGoods) {
            saleOfGoodsImpl.addValue(CONSISTS_OF, offerAndAcceptanceForGoods.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where a sale_of_goods consists_of exactly one
         * {@link ExchangeOfGoodsAndMoney}.
         *
         * @param exchangeOfGoodsAndMoney
         * @return
         */
        public final Builder consists_Of_(final ExchangeOfGoodsAndMoney exchangeOfGoodsAndMoney) {
            saleOfGoodsImpl.addValue(CONSISTS_OF_, exchangeOfGoodsAndMoney.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            saleOfGoodsImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            saleOfGoodsImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            saleOfGoodsImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            saleOfGoodsImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfContractProcess
         * @return
         */
        public final Builder member_Of(final ClassOfContractProcess classOfContractProcess) {
            saleOfGoodsImpl.addValue(MEMBER_OF, classOfContractProcess.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            saleOfGoodsImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            saleOfGoodsImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param reachingAgreement
         * @return
         */
        public final Builder part_Of(final ReachingAgreement reachingAgreement) {
            saleOfGoodsImpl.addValue(PART_OF, reachingAgreement.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            saleOfGoodsImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            saleOfGoodsImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder references(final Thing thing) {
            saleOfGoodsImpl.addValue(REFERENCES, thing.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            saleOfGoodsImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            saleOfGoodsImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public SaleOfGoods build() throws HqdmException {
            if (saleOfGoodsImpl.hasValue(AGGREGATED_INTO)
                    && saleOfGoodsImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (saleOfGoodsImpl.hasValue(BEGINNING)
                    && saleOfGoodsImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!saleOfGoodsImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (saleOfGoodsImpl.hasValue(DETERMINES)
                    && saleOfGoodsImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (saleOfGoodsImpl.hasValue(ENDING)
                    && saleOfGoodsImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (saleOfGoodsImpl.hasValue(MEMBER__OF)
                    && saleOfGoodsImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (saleOfGoodsImpl.hasValue(MEMBER_OF)
                    && saleOfGoodsImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!saleOfGoodsImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (saleOfGoodsImpl.hasValue(PART__OF)
                    && saleOfGoodsImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (saleOfGoodsImpl.hasValue(PART_OF)
                    && saleOfGoodsImpl.value(PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (saleOfGoodsImpl.hasValue(PART_OF_)
                    && saleOfGoodsImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!saleOfGoodsImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (saleOfGoodsImpl.hasValue(REFERENCES)
                    && saleOfGoodsImpl.value(REFERENCES).isEmpty()) {
                throw new HqdmException("Property Not Set: references");
            }
            if (saleOfGoodsImpl.hasValue(TEMPORAL__PART_OF)
                    && saleOfGoodsImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (saleOfGoodsImpl.hasValue(TEMPORAL_PART_OF)
                    && saleOfGoodsImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return saleOfGoodsImpl;
        }
    }
}
