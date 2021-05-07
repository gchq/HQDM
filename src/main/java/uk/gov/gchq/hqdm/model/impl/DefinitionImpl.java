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
import static uk.gov.gchq.hqdm.iri.HQDM.DEFINITION;
import static uk.gov.gchq.hqdm.iri.HQDM.REPRESENTED;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.Definition;
import uk.gov.gchq.hqdm.model.Pattern;
import uk.gov.gchq.hqdm.model.RecognizingLanguageCommunity;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Definition.
 */
public class DefinitionImpl extends HqdmObject implements Definition {
    /**
     *
     * @param iri
     */
    public DefinitionImpl(final IRI iri) {
        super(DefinitionImpl.class, iri, DEFINITION);
    }

    /**
     * Builder for DefinitionImpl.
     */
    public static class Builder {
        /** */
        private final DefinitionImpl definitionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            definitionImpl = new DefinitionImpl(iri);
        }

        /**
         *
         * @param pattern
         * @return
         */
        public final Builder consists_Of_By_Class_M(final Pattern pattern) {
            definitionImpl.addValue(CONSISTS_OF_BY_CLASS, pattern.getIri());
            return this;
        }

        /**
         *
         * @param recognizingLanguageCommunity
         * @return
         */
        public final Builder consists_Of_In_Members_M(
                final RecognizingLanguageCommunity recognizingLanguageCommunity) {
            definitionImpl.addValue(CONSISTS_OF_IN_MEMBERS, recognizingLanguageCommunity.getIri());
            return this;
        }

        /**
         * A relationship type where exactly one {@link Class} is defined by the definition.
         *
         * @param clazz
         * @return
         */
        public final Builder represented_M(final Class clazz) {
            definitionImpl.addValue(REPRESENTED, clazz.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Definition build() throws HqdmException {
            if (!definitionImpl.hasValue(CONSISTS_OF_BY_CLASS)) {
                throw new HqdmException("Property Not Set: consists_of_by_class");
            }
            if (!definitionImpl.hasValue(CONSISTS_OF_IN_MEMBERS)) {
                throw new HqdmException("Property Not Set: consists_of_in_members");
            }
            if (!definitionImpl.hasValue(REPRESENTED)) {
                throw new HqdmException("Property Not Set: represented");
            }
            return definitionImpl;
        }
    }
}
