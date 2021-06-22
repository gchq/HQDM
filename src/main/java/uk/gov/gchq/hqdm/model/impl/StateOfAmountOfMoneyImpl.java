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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_AMOUNT_OF_MONEY;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.AmountOfMoney;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfAmountOfMoney;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfAmountOfMoney;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfAmountOfMoney.
 */
public class StateOfAmountOfMoneyImpl extends HqdmObject implements StateOfAmountOfMoney {
    /**
     * Constructs a new StateOfAmountOfMoney.
     *
     * @param iri IRI of the StateOfAmountOfMoney.
     */
    public StateOfAmountOfMoneyImpl(final IRI iri) {
        super(StateOfAmountOfMoneyImpl.class, iri, STATE_OF_AMOUNT_OF_MONEY);
    }

    /**
     * Builder for constructing instances of StateOfAmountOfMoney.
     */
    public static class Builder {

        private final StateOfAmountOfMoneyImpl stateOfAmountOfMoneyImpl;

        /**
         * Constructs a Builder for a new StateOfAmountOfMoney.
         *
         * @param iri IRI of the StateOfAmountOfMoney.
         */
        public Builder(final IRI iri) {
            stateOfAmountOfMoneyImpl = new StateOfAmountOfMoneyImpl(iri);
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
            stateOfAmountOfMoneyImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
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
            stateOfAmountOfMoneyImpl.addValue(BEGINNING, event.getIri());
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
            stateOfAmountOfMoneyImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
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
            stateOfAmountOfMoneyImpl.addValue(ENDING, event.getIri());
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
            stateOfAmountOfMoneyImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a
         * {@link StateOfAmountOfMoney} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or
         * more {@link ClassOfStateOfAmountOfMoney}.
         *
         * @param classOfStateOfAmountOfMoney The ClassOfStateOfAmountOfMoney.
         * @return This builder.
         */
        public final Builder member_Of(
                final ClassOfStateOfAmountOfMoney classOfStateOfAmountOfMoney) {
            stateOfAmountOfMoneyImpl.addValue(MEMBER_OF, classOfStateOfAmountOfMoney.getIri());
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
            stateOfAmountOfMoneyImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
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
            stateOfAmountOfMoneyImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
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
            stateOfAmountOfMoneyImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} relationship type where a
         * {@link StateOfAmountOfMoney} may be a {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF}
         * one or more {@link AmountOfMoney}.
         *
         * @param amountOfMoney The AmountOfMoney.
         * @return This builder.
         */
        public final Builder temporal_Part_Of(final AmountOfMoney amountOfMoney) {
            stateOfAmountOfMoneyImpl.addValue(TEMPORAL_PART_OF, amountOfMoney.getIri());
            return this;
        }

        /**
         * Returns an instance of StateOfAmountOfMoney created from the properties set on this
         * builder.
         *
         * @return The built StateOfAmountOfMoney.
         * @throws HqdmException If the StateOfAmountOfMoney is missing any mandatory properties.
         */
        public StateOfAmountOfMoney build() throws HqdmException {
            if (stateOfAmountOfMoneyImpl.hasValue(AGGREGATED_INTO)
                    && stateOfAmountOfMoneyImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfAmountOfMoneyImpl.hasValue(BEGINNING)
                    && stateOfAmountOfMoneyImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfAmountOfMoneyImpl.hasValue(ENDING)
                    && stateOfAmountOfMoneyImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfAmountOfMoneyImpl.hasValue(MEMBER__OF)
                    && stateOfAmountOfMoneyImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfAmountOfMoneyImpl.hasValue(MEMBER_OF)
                    && stateOfAmountOfMoneyImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfAmountOfMoneyImpl.hasValue(PART__OF)
                    && stateOfAmountOfMoneyImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfAmountOfMoneyImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfAmountOfMoneyImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfAmountOfMoneyImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfAmountOfMoneyImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfAmountOfMoneyImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfAmountOfMoneyImpl;
        }
    }
}
