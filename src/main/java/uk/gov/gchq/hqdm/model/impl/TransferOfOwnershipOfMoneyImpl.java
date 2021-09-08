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
import static uk.gov.gchq.hqdm.iri.HQDM.TRANSFER_OF_OWNERSHIP_OF_MONEY;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Activity;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.BeginningOfOwnership;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSociallyConstructedActivity;
import uk.gov.gchq.hqdm.model.EndingOfOwnership;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.ExchangeOfGoodsAndMoney;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.MoneyAsset;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.model.TransferOfOwnershipOfMoney;
import uk.gov.gchq.hqdm.model.Transferee;
import uk.gov.gchq.hqdm.model.Transferor;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of TransferOfOwnershipOfMoney.
 */
public class TransferOfOwnershipOfMoneyImpl extends HqdmObject
        implements TransferOfOwnershipOfMoney {
    /**
     * Constructs a new TransferOfOwnershipOfMoney.
     *
     * @param iri IRI of the TransferOfOwnershipOfMoney.
     */
    public TransferOfOwnershipOfMoneyImpl(final IRI iri) {
        super(TransferOfOwnershipOfMoneyImpl.class, iri, TRANSFER_OF_OWNERSHIP_OF_MONEY);
    }

    /**
     * Builder for constructing instances of TransferOfOwnershipOfMoney.
     */
    public static class Builder {

        private final TransferOfOwnershipOfMoneyImpl transferOfOwnershipOfMoneyImpl;

        /**
         * Constructs a Builder for a new TransferOfOwnershipOfMoney.
         *
         * @param iri IRI of the TransferOfOwnershipOfMoney.
         */
        public Builder(final IRI iri) {
            transferOfOwnershipOfMoneyImpl = new TransferOfOwnershipOfMoneyImpl(iri);
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
            transferOfOwnershipOfMoneyImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
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
            transferOfOwnershipOfMoneyImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A relationship type where each {@link Activity} is the cause of one or more
         * {@link Event}.
         *
         * @param event The Event.
         * @return This builder.
         */
        public final Builder causes_M(final Event event) {
            transferOfOwnershipOfMoneyImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CAUSES} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.TransferOfOwnership}
         * {@link uk.gov.gchq.hqdm.iri.HQDM#CAUSES} exactly one {@link BeginningOfOwnership}.
         *
         * @param beginningOfOwnership The BeginningOfOwnership.
         * @return This builder.
         */
        public final Builder causes_Beginning_M(final BeginningOfOwnership beginningOfOwnership) {
            transferOfOwnershipOfMoneyImpl.addValue(CAUSES_BEGINNING,
                    beginningOfOwnership.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CAUSES} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.TransferOfOwnership} causes exactly one
         * {@link EndingOfOwnership}.
         *
         * @param endingOfOwnership The EndingOfOwnership.
         * @return This builder.
         */
        public final Builder causes_Ending_M(final EndingOfOwnership endingOfOwnership) {
            transferOfOwnershipOfMoneyImpl.addValue(CAUSES_ENDING, endingOfOwnership.getIri());
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
            transferOfOwnershipOfMoneyImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF} relationship type where an
         * {@link Activity} may {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF} one or more other
         * {@link Activity}.
         *
         * @param activity The Activity.
         * @return This builder.
         */
        public final Builder consists_Of(final Activity activity) {
            transferOfOwnershipOfMoneyImpl.addValue(CONSISTS_OF, activity.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.TransferOfOwnership}
         * {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} exactly one {@link Transferor}.
         *
         * @param transferor The Transferor.
         * @return This builder.
         */
        public final Builder consists_Of_Participant(final Transferor transferor) {
            transferOfOwnershipOfMoneyImpl.addValue(CONSISTS_OF_PARTICIPANT, transferor.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.TransferOfOwnership}
         * {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} exactly one {@link Transferee}.
         *
         * @param transferee The Transferee.
         * @return This builder.
         */
        public final Builder consists_Of_Participant_(final Transferee transferee) {
            transferOfOwnershipOfMoneyImpl.addValue(CONSISTS_OF_PARTICIPANT_, transferee.getIri());
            return this;
        }

        /**
         * A relationship type where an {@link Activity} may determine one or more {@link Thing} to
         * be the case.
         *
         * @param thing The Thing.
         * @return This builder.
         */
        public final Builder determines(final Thing thing) {
            transferOfOwnershipOfMoneyImpl.addValue(DETERMINES, thing.getIri());
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
            transferOfOwnershipOfMoneyImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link Thing} may be a member of one or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            transferOfOwnershipOfMoneyImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.SociallyConstructedActivity} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link ClassOfSociallyConstructedActivity}.
         *
         * @param classOfSociallyConstructedActivity The ClassOfSociallyConstructedActivity.
         * @return This builder.
         */
        public final Builder member_Of(
                final ClassOfSociallyConstructedActivity classOfSociallyConstructedActivity) {
            transferOfOwnershipOfMoneyImpl.addValue(MEMBER_OF,
                    classOfSociallyConstructedActivity.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF_KIND} relationship type where each
         * {@link Activity} is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link KindOfActivity}.
         *
         * @param kindOfActivity The KindOfActivity.
         * @return This builder.
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            transferOfOwnershipOfMoneyImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
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
            transferOfOwnershipOfMoneyImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link TransferOfOwnershipOfMoney}may be a {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} at
         * most one {@link ExchangeOfGoodsAndMoney}.
         *
         * @param exchangeOfGoodsAndMoney The ExchangeOfGoodsAndMoney.
         * @return This builder.
         */
        public final Builder part_Of(final ExchangeOfGoodsAndMoney exchangeOfGoodsAndMoney) {
            transferOfOwnershipOfMoneyImpl.addValue(PART_OF, exchangeOfGoodsAndMoney.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.SociallyConstructedObject} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} one or more {@link AgreementExecution}.
         *
         * @param agreementExecution The AgreementExecution.
         * @return This builder.
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            transferOfOwnershipOfMoneyImpl.addValue(PART_OF_, agreementExecution.getIri());
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
            transferOfOwnershipOfMoneyImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A references relationship type where a {@link TransferOfOwnershipOfMoney}references
         * exactly one {@link MoneyAsset}.
         *
         * @param moneyAsset The MoneyAsset.
         * @return This builder.
         */
        public final Builder references_M(final MoneyAsset moneyAsset) {
            transferOfOwnershipOfMoneyImpl.addValue(REFERENCES, moneyAsset.getIri());
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
            transferOfOwnershipOfMoneyImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.State} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} one or more {@link Individual}.
         *
         * <p>
         * Note: The relationship is optional because an {@link Individual} is not necessarily a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} another {@link Individual}, yet is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} {@link uk.gov.gchq.hqdm.model.State} as well
         * as {@link Individual}. This applies to all subtypes of
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} that are between a {@code state_of_X}
         * and {@code X}.
         * </p>
         *
         * @param individual The Individual.
         * @return This builder.
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            transferOfOwnershipOfMoneyImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         * Returns an instance of TransferOfOwnershipOfMoney created from the properties set on this
         * builder.
         *
         * @return The built TransferOfOwnershipOfMoney.
         * @throws HqdmException If the TransferOfOwnershipOfMoney is missing any mandatory
         *         properties.
         */
        public TransferOfOwnershipOfMoney build() throws HqdmException {
            if (transferOfOwnershipOfMoneyImpl.hasValue(AGGREGATED_INTO)
                    && transferOfOwnershipOfMoneyImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(BEGINNING)
                    && transferOfOwnershipOfMoneyImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!transferOfOwnershipOfMoneyImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (!transferOfOwnershipOfMoneyImpl.hasValue(CAUSES_BEGINNING)) {
                throw new HqdmException("Property Not Set: causes_beginning");
            }
            if (!transferOfOwnershipOfMoneyImpl.hasValue(CAUSES_ENDING)) {
                throw new HqdmException("Property Not Set: causes_ending");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(DETERMINES)
                    && transferOfOwnershipOfMoneyImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(ENDING)
                    && transferOfOwnershipOfMoneyImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(MEMBER__OF)
                    && transferOfOwnershipOfMoneyImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(MEMBER_OF)
                    && transferOfOwnershipOfMoneyImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!transferOfOwnershipOfMoneyImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(PART__OF)
                    && transferOfOwnershipOfMoneyImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(PART_OF)
                    && transferOfOwnershipOfMoneyImpl.value(PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(PART_OF_)
                    && transferOfOwnershipOfMoneyImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!transferOfOwnershipOfMoneyImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (!transferOfOwnershipOfMoneyImpl.hasValue(REFERENCES)) {
                throw new HqdmException("Property Not Set: references");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(TEMPORAL__PART_OF)
                    && transferOfOwnershipOfMoneyImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (transferOfOwnershipOfMoneyImpl.hasValue(TEMPORAL_PART_OF)
                    && transferOfOwnershipOfMoneyImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return transferOfOwnershipOfMoneyImpl;
        }
    }
}
