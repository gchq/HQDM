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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_REPRESENTATION;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRepresentation;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfRepresentation.
 */
public class ClassOfRepresentationImpl extends HqdmObject implements ClassOfRepresentation {
    /**
     * Constructs a new ClassOfRepresentation.
     *
     * @param iri IRI of the ClassOfRepresentation.
     */
    public ClassOfRepresentationImpl(final IRI iri) {
        super(ClassOfRepresentationImpl.class, iri, CLASS_OF_REPRESENTATION);
    }

    /**
     * Builder for constructing instances of ClassOfRepresentation.
     */
    public static class Builder {

        private final ClassOfRepresentationImpl classOfRepresentationImpl;

        /**
         * Constructs a Builder for a new ClassOfRepresentation.
         *
         * @param iri IRI of the ClassOfRepresentation.
         */
        public Builder(final IRI iri) {
            classOfRepresentationImpl = new ClassOfRepresentationImpl(iri);
        }

        /**
         * A relationship type where each {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link Class} is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the superclass.
         *
         * @param clazz the Class.
         * @return This builder.
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfRepresentationImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         * Returns an instance of ClassOfRepresentation created from the properties set on this
         * builder.
         *
         * @return The built ClassOfRepresentation.
         * @throws HqdmException If the ClassOfRepresentation is missing any mandatory properties.
         */
        public ClassOfRepresentation build() throws HqdmException {
            if (classOfRepresentationImpl.hasValue(HAS_SUPERCLASS)
                    && classOfRepresentationImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            return classOfRepresentationImpl;
        }
    }
}
