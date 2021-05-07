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

import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_IN_MEMBERS;
import static uk.gov.gchq.hqdm.iri.HQDM.REPRESENTATION_BY_PATTERN;
import static uk.gov.gchq.hqdm.iri.HQDM.REPRESENTED;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Pattern;
import uk.gov.gchq.hqdm.model.RecognizingLanguageCommunity;
import uk.gov.gchq.hqdm.model.RepresentationByPattern;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of RepresentationByPattern.
 */
public class RepresentationByPatternImpl extends HqdmObject implements RepresentationByPattern {
    /**
     *
     * @param iri
     */
    public RepresentationByPatternImpl(final IRI iri) {
        super(RepresentationByPatternImpl.class, iri, REPRESENTATION_BY_PATTERN);
    }

    /**
     * Builder for RepresentationByPatternImpl.
     */
    public static class Builder {
        /** */
        private final RepresentationByPatternImpl representationByPatternImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            representationByPatternImpl = new RepresentationByPatternImpl(iri);
        }

        /**
         * A consists_of_by_class relationship type where a member_of the representation_by_pattern
         * has a sign that is a member_of the {@link Pattern}.
         *
         * @param pattern
         * @return
         */
        public final Builder consists_Of_By_Class_M(final Pattern pattern) {
            representationByPatternImpl.addValue(CONSISTS_OF_BY_CLASS, pattern.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link RecognizingLanguageCommunity} is a participant_in each
         * member_of one or more representation_by_pattern.
         *
         * @param recognizingLanguageCommunity
         * @return
         */
        public final Builder consists_Of_In_Members_M(
                final RecognizingLanguageCommunity recognizingLanguageCommunity) {
            representationByPatternImpl.addValue(CONSISTS_OF_IN_MEMBERS,
                    recognizingLanguageCommunity.getIri());
            return this;
        }

        /**
         * A relationship type where the {@link Thing} is represented by each member_of the
         * representation_by_pattern.
         *
         * @param thing
         * @return
         */
        public final Builder represented_M(final Thing thing) {
            representationByPatternImpl.addValue(REPRESENTED, thing.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public RepresentationByPattern build() throws HqdmException {
            if (!representationByPatternImpl.hasValue(CONSISTS_OF_BY_CLASS)) {
                throw new HqdmException("Property Not Set: consists_of_by_class");
            }
            if (!representationByPatternImpl.hasValue(CONSISTS_OF_IN_MEMBERS)) {
                throw new HqdmException("Property Not Set: consists_of_in_members");
            }
            if (!representationByPatternImpl.hasValue(REPRESENTED)) {
                throw new HqdmException("Property Not Set: represented");
            }
            return representationByPatternImpl;
        }
    }
}
