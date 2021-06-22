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

import static uk.gov.gchq.hqdm.iri.HQDM.ABSTRACT_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.AbstractObject;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of AbstractObject.
 */
public class AbstractObjectImpl extends HqdmObject implements AbstractObject {
    /**
     * Constructs a new AbstractObject.
     *
     * @param iri IRI of the AbstractObject.
     */
    public AbstractObjectImpl(final IRI iri) {
        super(AbstractObjectImpl.class, iri, ABSTRACT_OBJECT);
    }

    /**
     * Builder for constructing instances of AbstractObject.
     */
    public static class Builder {

        private final AbstractObjectImpl abstractObjectImpl;

        /**
         * Constructs a Builder for a new AbstractObject.
         *
         * @param iri IRI of the AbstractObject.
         */
        public Builder(final IRI iri) {
            abstractObjectImpl = new AbstractObjectImpl(iri);
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            abstractObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * Returns an instance of AbstractObject created from the properties set on this builder.
         *
         * @return The built AbstractObject.
         * @throws HqdmException If the AbstractObject is missing any mandatory properties.
         */
        public AbstractObject build() throws HqdmException {
            if (abstractObjectImpl.hasValue(MEMBER__OF)
                    && abstractObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            return abstractObjectImpl;
        }
    }
}
