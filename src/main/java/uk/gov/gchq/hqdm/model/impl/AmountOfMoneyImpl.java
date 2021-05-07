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
import static uk.gov.gchq.hqdm.iri.HQDM.AMOUNT_OF_MONEY;
import static uk.gov.gchq.hqdm.iri.HQDM.BEGINNING;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_CURRENCY;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.AmountOfMoney;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfAmountOfMoney;
import uk.gov.gchq.hqdm.model.Currency;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfSociallyConstructedObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of AmountOfMoney.
 */
public class AmountOfMoneyImpl extends HqdmObject implements AmountOfMoney {
    /**
     *
     * @param iri
     */
    public AmountOfMoneyImpl(final IRI iri) {
        super(AmountOfMoneyImpl.class, iri, AMOUNT_OF_MONEY);
    }

    /**
     * Builder for AmountOfMoneyImpl.
     */
    public static class Builder {
        /** */
        private final AmountOfMoneyImpl amountOfMoneyImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            amountOfMoneyImpl = new AmountOfMoneyImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            amountOfMoneyImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            amountOfMoneyImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            amountOfMoneyImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            amountOfMoneyImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            amountOfMoneyImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an amount_of_money may be a member_of one or more
         * {@link ClassOfAmountOfMoney}.
         *
         * @param classOfAmountOfMoney
         * @return
         */
        public final Builder member_Of(final ClassOfAmountOfMoney classOfAmountOfMoney) {
            amountOfMoneyImpl.addValue(MEMBER_OF, classOfAmountOfMoney.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an amount_of_money may be a member_of exactly one
         * {@link Currency}.
         *
         * @param currency
         * @return
         */
        public final Builder member_Of_Currency(final Currency currency) {
            amountOfMoneyImpl.addValue(MEMBER_OF_CURRENCY, currency.getIri());
            return this;
        }

        /**
         *
         * @param kindOfSociallyConstructedObject
         * @return
         */
        public final Builder member_Of_Kind(
                final KindOfSociallyConstructedObject kindOfSociallyConstructedObject) {
            amountOfMoneyImpl.addValue(MEMBER_OF_KIND, kindOfSociallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            amountOfMoneyImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            amountOfMoneyImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            amountOfMoneyImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param amountOfMoney
         * @return
         */
        public final Builder temporal_Part_Of(final AmountOfMoney amountOfMoney) {
            amountOfMoneyImpl.addValue(TEMPORAL_PART_OF, amountOfMoney.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public AmountOfMoney build() throws HqdmException {
            if (amountOfMoneyImpl.hasValue(AGGREGATED_INTO)
                    && amountOfMoneyImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (amountOfMoneyImpl.hasValue(BEGINNING)
                    && amountOfMoneyImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (amountOfMoneyImpl.hasValue(ENDING)
                    && amountOfMoneyImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (amountOfMoneyImpl.hasValue(MEMBER__OF)
                    && amountOfMoneyImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (amountOfMoneyImpl.hasValue(MEMBER_OF)
                    && amountOfMoneyImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (amountOfMoneyImpl.hasValue(MEMBER_OF_CURRENCY)
                    && amountOfMoneyImpl.value(MEMBER_OF_CURRENCY).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_currency");
            }
            if (amountOfMoneyImpl.hasValue(MEMBER_OF_KIND)
                    && amountOfMoneyImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (amountOfMoneyImpl.hasValue(PART__OF)
                    && amountOfMoneyImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!amountOfMoneyImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (amountOfMoneyImpl.hasValue(TEMPORAL__PART_OF)
                    && amountOfMoneyImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (amountOfMoneyImpl.hasValue(TEMPORAL_PART_OF)
                    && amountOfMoneyImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return amountOfMoneyImpl;
        }
    }
}
