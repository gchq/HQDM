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
import static uk.gov.gchq.hqdm.iri.HQDM.DESCRIPTION;
import static uk.gov.gchq.hqdm.iri.HQDM.REPRESENTED;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Description;
import uk.gov.gchq.hqdm.model.Pattern;
import uk.gov.gchq.hqdm.model.RecognizingLanguageCommunity;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Description.
 */
public class DescriptionImpl extends HqdmObject implements Description {
    /**
     * Constructs a new Description.
     *
     * @param iri IRI of the Description.
     */
    public DescriptionImpl(final IRI iri) {
        super(DescriptionImpl.class, iri, DESCRIPTION);
    }

    /**
     * Builder for constructing instances of Description.
     */
    public static class Builder {

        private final DescriptionImpl descriptionImpl;

        /**
         * Constructs a Builder for a new Description.
         *
         * @param iri IRI of the Description.
         */
        public Builder(final IRI iri) {
            descriptionImpl = new DescriptionImpl(iri);
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_BY_CLASS} relationship type where a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link uk.gov.gchq.hqdm.model.RepresentationByPattern} has a
         * {@link uk.gov.gchq.hqdm.model.Sign} that is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF}
         * the {@link Pattern}.
         *
         * @param pattern The Pattern.
         * @return This builder.
         */
        public final Builder consists_Of_By_Class_M(final Pattern pattern) {
            descriptionImpl.addValue(CONSISTS_OF_BY_CLASS, pattern.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link RecognizingLanguageCommunity} is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#PARTICIPANT_IN} each
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link uk.gov.gchq.hqdm.model.RepresentationByPattern}.
         *
         * @param recognizingLanguageCommunity The RecognizingLanguageCommunity.
         * @return This builder.
         */
        public final Builder consists_Of_In_Members_M(
                final RecognizingLanguageCommunity recognizingLanguageCommunity) {
            descriptionImpl.addValue(CONSISTS_OF_IN_MEMBERS, recognizingLanguageCommunity.getIri());
            return this;
        }

        /**
         * A relationship type where the {@link Thing} is represented by each
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link uk.gov.gchq.hqdm.model.RepresentationByPattern}.
         *
         * @param thing The Thing.
         * @return This builder.
         */
        public final Builder represented_M(final Thing thing) {
            descriptionImpl.addValue(REPRESENTED, thing.getIri());
            return this;
        }

        /**
         * Returns an instance of Description created from the properties set on this builder.
         *
         * @return The built Description.
         * @throws HqdmException If the Description is missing any mandatory properties.
         */
        public Description build() throws HqdmException {
            if (!descriptionImpl.hasValue(CONSISTS_OF_BY_CLASS)) {
                throw new HqdmException("Property Not Set: consists_of_by_class");
            }
            if (!descriptionImpl.hasValue(CONSISTS_OF_IN_MEMBERS)) {
                throw new HqdmException("Property Not Set: consists_of_in_members");
            }
            if (!descriptionImpl.hasValue(REPRESENTED)) {
                throw new HqdmException("Property Not Set: represented");
            }
            return descriptionImpl;
        }
    }
}
