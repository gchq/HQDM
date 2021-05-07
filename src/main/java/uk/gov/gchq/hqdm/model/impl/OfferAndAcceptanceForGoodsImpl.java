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
import static uk.gov.gchq.hqdm.iri.HQDM.OFFER_AND_ACCEPTANCE_FOR_GOODS;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REFERENCES;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.AcceptanceOfOfferForGoods;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfAgreeContract;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.OfferAndAcceptanceForGoods;
import uk.gov.gchq.hqdm.model.OfferForGoods;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SaleOfGoods;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of OfferAndAcceptanceForGoods.
 */
public class OfferAndAcceptanceForGoodsImpl extends HqdmObject
        implements OfferAndAcceptanceForGoods {
    /**
     *
     * @param iri
     */
    public OfferAndAcceptanceForGoodsImpl(final IRI iri) {
        super(OfferAndAcceptanceForGoodsImpl.class, iri, OFFER_AND_ACCEPTANCE_FOR_GOODS);
    }

    /**
     * Builder for OfferAndAcceptanceForGoodsImpl.
     */
    public static class Builder {
        /** */
        private final OfferAndAcceptanceForGoodsImpl offerAndAcceptanceForGoodsImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            offerAndAcceptanceForGoodsImpl = new OfferAndAcceptanceForGoodsImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            offerAndAcceptanceForGoodsImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            offerAndAcceptanceForGoodsImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            offerAndAcceptanceForGoodsImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            offerAndAcceptanceForGoodsImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where an offer_and_acceptance_for_goods consists of
         * exactly one {@link AcceptanceOfOfferForGoods}.
         *
         * @param acceptanceOfOfferForGoods
         * @return
         */
        public final Builder consists_Of(
                final AcceptanceOfOfferForGoods acceptanceOfOfferForGoods) {
            offerAndAcceptanceForGoodsImpl.addValue(CONSISTS_OF,
                    acceptanceOfOfferForGoods.getIri());
            return this;
        }

        /**
         * A consists_of_ relationship type where an offer_and_acceptance_for_goods consists_of
         * exactly one {@link OfferForGoods}.
         *
         * @param offerForGoods
         * @return
         */
        public final Builder consists_Of_(final OfferForGoods offerForGoods) {
            offerAndAcceptanceForGoodsImpl.addValue(CONSISTS_OF_, offerForGoods.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            offerAndAcceptanceForGoodsImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            offerAndAcceptanceForGoodsImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            offerAndAcceptanceForGoodsImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            offerAndAcceptanceForGoodsImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfAgreeContract
         * @return
         */
        public final Builder member_Of(final ClassOfAgreeContract classOfAgreeContract) {
            offerAndAcceptanceForGoodsImpl.addValue(MEMBER_OF, classOfAgreeContract.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            offerAndAcceptanceForGoodsImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            offerAndAcceptanceForGoodsImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where an offer_and_acceptance_for_goods is a part_of exactly
         * one {@link SaleOfGoods}.
         *
         * @param saleOfGoods
         * @return
         */
        public final Builder part_Of_M(final SaleOfGoods saleOfGoods) {
            offerAndAcceptanceForGoodsImpl.addValue(PART_OF, saleOfGoods.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            offerAndAcceptanceForGoodsImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            offerAndAcceptanceForGoodsImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder references(final Thing thing) {
            offerAndAcceptanceForGoodsImpl.addValue(REFERENCES, thing.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            offerAndAcceptanceForGoodsImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            offerAndAcceptanceForGoodsImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public OfferAndAcceptanceForGoods build() throws HqdmException {
            if (offerAndAcceptanceForGoodsImpl.hasValue(AGGREGATED_INTO)
                    && offerAndAcceptanceForGoodsImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(BEGINNING)
                    && offerAndAcceptanceForGoodsImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!offerAndAcceptanceForGoodsImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(DETERMINES)
                    && offerAndAcceptanceForGoodsImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(ENDING)
                    && offerAndAcceptanceForGoodsImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(MEMBER__OF)
                    && offerAndAcceptanceForGoodsImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(MEMBER_OF)
                    && offerAndAcceptanceForGoodsImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!offerAndAcceptanceForGoodsImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(PART__OF)
                    && offerAndAcceptanceForGoodsImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!offerAndAcceptanceForGoodsImpl.hasValue(PART_OF)) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(PART_OF_)
                    && offerAndAcceptanceForGoodsImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!offerAndAcceptanceForGoodsImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(REFERENCES)
                    && offerAndAcceptanceForGoodsImpl.value(REFERENCES).isEmpty()) {
                throw new HqdmException("Property Not Set: references");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(TEMPORAL__PART_OF)
                    && offerAndAcceptanceForGoodsImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (offerAndAcceptanceForGoodsImpl.hasValue(TEMPORAL_PART_OF)
                    && offerAndAcceptanceForGoodsImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return offerAndAcceptanceForGoodsImpl;
        }
    }
}
