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

import static uk.gov.gchq.hqdm.iri.HQDM.FUNCTION_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.Function_;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Function.
 */
public class FunctionImpl extends HqdmObject implements Function_ {
    /**
     * Constructs a new Function_.
     *
     * @param iri IRI of the Function_.
     */
    public FunctionImpl(final IRI iri) {
        super(FunctionImpl.class, iri, FUNCTION_);
    }

    /**
     * Builder for constructing instances of Function.
     */
    public static class Builder {

        private final FunctionImpl functionImpl;

        /**
         * Constructs a Builder for a new Function.
         *
         * @param iri IRI of the Function.
         */
        public Builder(final IRI iri) {
            functionImpl = new FunctionImpl(iri);
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            functionImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a relationship is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a {@link ClassOfRelationship}.
         *
         * @param classOfRelationship The ClassOfRelationship.
         * @return This builder.
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            functionImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * Builds the Function_.
         *
         * @return The built Function_.
         * @throws HqdmException If the Function_ is missing any mandatory properties.
         */
        public Function_ build() throws HqdmException {
            if (functionImpl.hasValue(MEMBER__OF)
                    && functionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (functionImpl.hasValue(MEMBER_OF)
                    && functionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return functionImpl;
        }
    }
}
