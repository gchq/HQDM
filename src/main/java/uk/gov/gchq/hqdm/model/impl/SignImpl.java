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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PARTICIPANT_IN;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.SIGN;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSign;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfSociallyConstructedObject;
import uk.gov.gchq.hqdm.model.Pattern;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.RepresentationBySign;
import uk.gov.gchq.hqdm.model.Sign;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Sign.
 */
public class SignImpl extends HqdmObject implements Sign {
    /**
     *
     * @param iri
     */
    public SignImpl(final IRI iri) {
        super(SignImpl.class, iri, SIGN);
    }

    /**
     * Builder for SignImpl.
     */
    public static class Builder {
        /** */
        private final SignImpl signImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            signImpl = new SignImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            signImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            signImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            signImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            signImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            signImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a sign may be a member_of one or more
         * {@link ClassOfSign}.
         *
         * @param classOfSign
         * @return
         */
        public final Builder member_Of(final ClassOfSign classOfSign) {
            signImpl.addValue(MEMBER_OF, classOfSign.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a sign is a member_of one or more {@link Pattern}.
         *
         * @param pattern
         * @return
         */
        public final Builder member_Of__M(final Pattern pattern) {
            signImpl.addValue(MEMBER_OF_, pattern.getIri());
            return this;
        }

        /**
         *
         * @param kindOfSociallyConstructedObject
         * @return
         */
        public final Builder member_Of_Kind(
                final KindOfSociallyConstructedObject kindOfSociallyConstructedObject) {
            signImpl.addValue(MEMBER_OF_KIND, kindOfSociallyConstructedObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            signImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            signImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A participant_in relationship type where a sign is a participant_in one or more
         * {@link RepresentationBySign}.
         *
         * @param representationBySign
         * @return
         */
        public final Builder participant_In_M(final RepresentationBySign representationBySign) {
            signImpl.addValue(PARTICIPANT_IN, representationBySign.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            signImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            signImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Sign build() throws HqdmException {
            if (signImpl.hasValue(AGGREGATED_INTO)
                    && signImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (signImpl.hasValue(BEGINNING)
                    && signImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (signImpl.hasValue(ENDING)
                    && signImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (signImpl.hasValue(MEMBER__OF)
                    && signImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (signImpl.hasValue(MEMBER_OF)
                    && signImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!signImpl.hasValue(MEMBER_OF_)) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (signImpl.hasValue(MEMBER_OF_KIND)
                    && signImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (signImpl.hasValue(PART__OF)
                    && signImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!signImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (!signImpl.hasValue(PARTICIPANT_IN)) {
                throw new HqdmException("Property Not Set: participant_in");
            }
            if (signImpl.hasValue(TEMPORAL__PART_OF)
                    && signImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (signImpl.hasValue(TEMPORAL_PART_OF)
                    && signImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return signImpl;
        }
    }
}
