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
     * Constructs a new Ownership.
     *
     * @param iri IRI of the Ownership.
     */
    public OwnershipImpl(final IRI iri) {
        super(OwnershipImpl.class, iri, OWNERSHIP);
    }

    /**
     * Builder for constructing instances of Ownership.
     */
    public static class Builder {

        private final OwnershipImpl ownershipImpl;

        /**
         * Constructs a Builder for a new Ownership.
         *
         * @param iri IRI of the Ownership.
         */
        public Builder(final IRI iri) {
            ownershipImpl = new OwnershipImpl(iri);
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
            ownershipImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#BEGINNING} relationship type where an
         * {@link Ownership} has as {@link uk.gov.gchq.hqdm.iri.HQDM#BEGINNING} exactly one
         * {@link BeginningOfOwnership}.
         *
         * @param beginningOfOwnership The BeginningOfOwnership.
         * @return This builder.
         */
        public final Builder beginning_M(final BeginningOfOwnership beginningOfOwnership) {
            ownershipImpl.addValue(BEGINNING, beginningOfOwnership.getIri());
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
            ownershipImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} relationship type where an
         * {@link Ownership} {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} exactly one
         * {@link Owner}.
         *
         * @param owner The Owner.
         * @return This builder.
         */
        public final Builder consists_Of_Participant(final Owner owner) {
            ownershipImpl.addValue(CONSISTS_OF_PARTICIPANT, owner.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} relationship type where an
         * {@link Ownership} {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_PARTICIPANT} exactly one
         * {@link Asset}.
         *
         * @param asset The Asset.
         * @return This builder.
         */
        public final Builder consists_Of_Participant_(final Asset asset) {
            ownershipImpl.addValue(CONSISTS_OF_PARTICIPANT_, asset.getIri());
            return this;
        }

        /**
         * An {@link uk.gov.gchq.hqdm.iri.HQDM#ENDING} relationship type where an {@link Ownership}
         * has as {@link uk.gov.gchq.hqdm.iri.HQDM#ENDING} not more than one
         * {@link EndingOfOwnership}.
         *
         * @param endingOfOwnership The EndingOfOwnership.
         * @return This builder.
         */
        public final Builder ending(final EndingOfOwnership endingOfOwnership) {
            ownershipImpl.addValue(ENDING, endingOfOwnership.getIri());
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
            ownershipImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where an
         * {@link uk.gov.gchq.hqdm.model.Association} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more {@link ClassOfAssociation}.
         *
         * @param classOfAssociation The ClassOfAssociation.
         * @return This builder.
         */
        public final Builder member_Of(final ClassOfAssociation classOfAssociation) {
            ownershipImpl.addValue(MEMBER_OF, classOfAssociation.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF_KIND} relationship type where each
         * {@link uk.gov.gchq.hqdm.model.Association} is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more {@link KindOfAssociation}.
         *
         * @param kindOfAssociation The KindOfAssociation.
         * @return This builder.
         */
        public final Builder member_Of_Kind_M(final KindOfAssociation kindOfAssociation) {
            ownershipImpl.addValue(MEMBER_OF_KIND, kindOfAssociation.getIri());
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
            ownershipImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
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
            ownershipImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
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
            ownershipImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
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
            ownershipImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         * Returns an instance of Ownership created from the properties set on this builder.
         *
         * @return The built Ownership.
         * @throws HqdmException If the Ownership is missing any mandatory properties.
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
