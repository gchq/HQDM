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
     *
     * @param iri
     */
    public DescriptionImpl(final IRI iri) {
        super(DescriptionImpl.class, iri, DESCRIPTION);
    }

    /**
     * Builder for DescriptionImpl.
     */
    public static class Builder {
        /** */
        private final DescriptionImpl descriptionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            descriptionImpl = new DescriptionImpl(iri);
        }

        /**
         *
         * @param pattern
         * @return
         */
        public final Builder consists_Of_By_Class_M(final Pattern pattern) {
            descriptionImpl.addValue(CONSISTS_OF_BY_CLASS, pattern.getIri());
            return this;
        }

        /**
         *
         * @param recognizingLanguageCommunity
         * @return
         */
        public final Builder consists_Of_In_Members_M(
                final RecognizingLanguageCommunity recognizingLanguageCommunity) {
            descriptionImpl.addValue(CONSISTS_OF_IN_MEMBERS, recognizingLanguageCommunity.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder represented_M(final Thing thing) {
            descriptionImpl.addValue(REPRESENTED, thing.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
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
