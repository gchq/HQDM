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

import static uk.gov.gchq.hqdm.iri.HQDM.ACCEPTANCE_OF_OFFER_FOR_GOODS;
import static uk.gov.gchq.hqdm.iri.HQDM.AGGREGATED_INTO;
import static uk.gov.gchq.hqdm.iri.HQDM.BEGINNING;
import static uk.gov.gchq.hqdm.iri.HQDM.CAUSES;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF;
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
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.AcceptanceOfOfferForGoods;
import uk.gov.gchq.hqdm.model.Activity;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSociallyConstructedActivity;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.OfferAndAcceptanceForGoods;
import uk.gov.gchq.hqdm.model.OfferForGoods;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of AcceptanceOfOfferForGoods.
 */
public class AcceptanceOfOfferForGoodsImpl extends HqdmObject
        implements AcceptanceOfOfferForGoods {
    /**
     *
     * @param iri
     */
    public AcceptanceOfOfferForGoodsImpl(final IRI iri) {
        super(AcceptanceOfOfferForGoodsImpl.class, iri, ACCEPTANCE_OF_OFFER_FOR_GOODS);
    }

    /**
     * Builder for AcceptanceOfOfferForGoodsImpl.
     */
    public static class Builder {
        /** */
        private final AcceptanceOfOfferForGoodsImpl acceptanceOfOfferForGoodsImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            acceptanceOfOfferForGoodsImpl = new AcceptanceOfOfferForGoodsImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            acceptanceOfOfferForGoodsImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            acceptanceOfOfferForGoodsImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            acceptanceOfOfferForGoodsImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            acceptanceOfOfferForGoodsImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param activity
         * @return
         */
        public final Builder consists_Of(final Activity activity) {
            acceptanceOfOfferForGoodsImpl.addValue(CONSISTS_OF, activity.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            acceptanceOfOfferForGoodsImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            acceptanceOfOfferForGoodsImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            acceptanceOfOfferForGoodsImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            acceptanceOfOfferForGoodsImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfSociallyConstructedActivity
         * @return
         */
        public final Builder member_Of(
                final ClassOfSociallyConstructedActivity classOfSociallyConstructedActivity) {
            acceptanceOfOfferForGoodsImpl.addValue(MEMBER_OF,
                    classOfSociallyConstructedActivity.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            acceptanceOfOfferForGoodsImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            acceptanceOfOfferForGoodsImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where an acceptance_of_offer_for_goods is a part_of exactly
         * one {@link OfferAndAcceptanceForGoods}.
         *
         * @param offerAndAcceptanceForGoods
         * @return
         */
        public final Builder part_Of_M(
                final OfferAndAcceptanceForGoods offerAndAcceptanceForGoods) {
            acceptanceOfOfferForGoodsImpl.addValue(PART_OF, offerAndAcceptanceForGoods.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            acceptanceOfOfferForGoodsImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            acceptanceOfOfferForGoodsImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A references relationship to exactly one {@link OfferForGoods} accepted.
         *
         * @param offerForGoods
         * @return
         */
        public final Builder references_M(final OfferForGoods offerForGoods) {
            acceptanceOfOfferForGoodsImpl.addValue(REFERENCES, offerForGoods.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            acceptanceOfOfferForGoodsImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            acceptanceOfOfferForGoodsImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public AcceptanceOfOfferForGoods build() throws HqdmException {
            if (acceptanceOfOfferForGoodsImpl.hasValue(AGGREGATED_INTO)
                    && acceptanceOfOfferForGoodsImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(BEGINNING)
                    && acceptanceOfOfferForGoodsImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!acceptanceOfOfferForGoodsImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(DETERMINES)
                    && acceptanceOfOfferForGoodsImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(ENDING)
                    && acceptanceOfOfferForGoodsImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(MEMBER__OF)
                    && acceptanceOfOfferForGoodsImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(MEMBER_OF)
                    && acceptanceOfOfferForGoodsImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!acceptanceOfOfferForGoodsImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(PART__OF)
                    && acceptanceOfOfferForGoodsImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!acceptanceOfOfferForGoodsImpl.hasValue(PART_OF)) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(PART_OF_)
                    && acceptanceOfOfferForGoodsImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!acceptanceOfOfferForGoodsImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (!acceptanceOfOfferForGoodsImpl.hasValue(REFERENCES)) {
                throw new HqdmException("Property Not Set: references");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(TEMPORAL__PART_OF)
                    && acceptanceOfOfferForGoodsImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (acceptanceOfOfferForGoodsImpl.hasValue(TEMPORAL_PART_OF)
                    && acceptanceOfOfferForGoodsImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return acceptanceOfOfferForGoodsImpl;
        }
    }
}
