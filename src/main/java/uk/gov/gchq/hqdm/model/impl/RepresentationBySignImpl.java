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
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REPRESENTATION_BY_SIGN;
import static uk.gov.gchq.hqdm.iri.HQDM.REPRESENTS;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRepresentation;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfAssociation;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.RecognizingLanguageCommunity;
import uk.gov.gchq.hqdm.model.RepresentationByPattern;
import uk.gov.gchq.hqdm.model.RepresentationBySign;
import uk.gov.gchq.hqdm.model.Sign;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of RepresentationBySign.
 */
public class RepresentationBySignImpl extends HqdmObject implements RepresentationBySign {
    /**
     *
     * @param iri
     */
    public RepresentationBySignImpl(final IRI iri) {
        super(RepresentationBySignImpl.class, iri, REPRESENTATION_BY_SIGN);
    }

    /**
     * Builder for RepresentationBySignImpl.
     */
    public static class Builder {
        /** */
        private final RepresentationBySignImpl representationBySignImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            representationBySignImpl = new RepresentationBySignImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            representationBySignImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            representationBySignImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            representationBySignImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where one or more {@link Sign} is used in the
         * representation_by_sign.
         *
         * @param sign
         * @return
         */
        public final Builder consists_Of(final Sign sign) {
            representationBySignImpl.addValue(CONSISTS_OF, sign.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where a representation_by_sign consists of one or more
         * {@link RecognizingLanguageCommunity}.
         *
         * @param recognizingLanguageCommunity
         * @return
         */
        public final Builder consists_Of_(
                final RecognizingLanguageCommunity recognizingLanguageCommunity) {
            representationBySignImpl.addValue(CONSISTS_OF_, recognizingLanguageCommunity.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            representationBySignImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            representationBySignImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            representationBySignImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where the representation_by_sign may be a member_of one or
         * more {@link ClassOfRepresentation}.
         *
         * @param classOfRepresentation
         * @return
         */
        public final Builder member_Of(final ClassOfRepresentation classOfRepresentation) {
            representationBySignImpl.addValue(MEMBER_OF, classOfRepresentation.getIri());
            return this;
        }

        /**
         * A member_of relationship type where the representation_by_sign must be a member_of
         * exactly one {@link RepresentationByPattern}.
         *
         * @param representationByPattern
         * @return
         */
        public final Builder member_Of__M(final RepresentationByPattern representationByPattern) {
            representationBySignImpl.addValue(MEMBER_OF_, representationByPattern.getIri());
            return this;
        }

        /**
         *
         * @param kindOfAssociation
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfAssociation kindOfAssociation) {
            representationBySignImpl.addValue(MEMBER_OF_KIND, kindOfAssociation.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            representationBySignImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            representationBySignImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A relationship type where a representation_by_sign represents one or more {@link Thing}.
         *
         * @param thing
         * @return
         */
        public final Builder represents_M(final Thing thing) {
            representationBySignImpl.addValue(REPRESENTS, thing.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            representationBySignImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            representationBySignImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public RepresentationBySign build() throws HqdmException {
            if (representationBySignImpl.hasValue(AGGREGATED_INTO)
                    && representationBySignImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (representationBySignImpl.hasValue(BEGINNING)
                    && representationBySignImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (representationBySignImpl.hasValue(ENDING)
                    && representationBySignImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (representationBySignImpl.hasValue(MEMBER__OF)
                    && representationBySignImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (representationBySignImpl.hasValue(MEMBER_OF)
                    && representationBySignImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!representationBySignImpl.hasValue(MEMBER_OF_)) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (!representationBySignImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (representationBySignImpl.hasValue(PART__OF)
                    && representationBySignImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!representationBySignImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (!representationBySignImpl.hasValue(REPRESENTS)) {
                throw new HqdmException("Property Not Set: represents");
            }
            if (representationBySignImpl.hasValue(TEMPORAL__PART_OF)
                    && representationBySignImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (representationBySignImpl.hasValue(TEMPORAL_PART_OF)
                    && representationBySignImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return representationBySignImpl;
        }
    }
}
