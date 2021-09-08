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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_PHYSICAL_QUANTITY;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalQuantity;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfPhysicalQuantity.
 */
public class ClassOfPhysicalQuantityImpl extends HqdmObject implements ClassOfPhysicalQuantity {
    /**
     * Constructs a new ClassOfPhysicalQuantity.
     *
     * @param iri IRI of the ClassOfPhysicalQuantity.
     */
    public ClassOfPhysicalQuantityImpl(final IRI iri) {
        super(ClassOfPhysicalQuantityImpl.class, iri, CLASS_OF_PHYSICAL_QUANTITY);
    }

    /**
     * Builder for constructing instances of ClassOfPhysicalQuantity.
     */
    public static class Builder {

        private final ClassOfPhysicalQuantityImpl classOfPhysicalQuantityImpl;

        /**
         * Constructs a Builder for a new ClassOfPhysicalQuantity.
         *
         * @param iri IRI of the ClassOfPhysicalQuantity.
         */
        public Builder(final IRI iri) {
            classOfPhysicalQuantityImpl = new ClassOfPhysicalQuantityImpl(iri);
        }

        /**
         * A relationship type where each {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link Class} is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the superclass.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfPhysicalQuantityImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
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
            classOfPhysicalQuantityImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a {@link Class} may
         * be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more {@link ClassOfClass}.
         *
         * @param classOfClass The ClassOfClass.
         * @return This builder.
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfPhysicalQuantityImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         * Returns an instance of ClassOfPhysicalQuantity created from the properties set on this
         * builder.
         *
         * @return The built ClassOfPhysicalQuantity.
         * @throws HqdmException If the ClassOfPhysicalQuantity is missing any mandatory properties.
         */
        public ClassOfPhysicalQuantity build() throws HqdmException {
            if (classOfPhysicalQuantityImpl.hasValue(HAS_SUPERCLASS)
                    && classOfPhysicalQuantityImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfPhysicalQuantityImpl.hasValue(MEMBER__OF)
                    && classOfPhysicalQuantityImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfPhysicalQuantityImpl.hasValue(MEMBER_OF)
                    && classOfPhysicalQuantityImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return classOfPhysicalQuantityImpl;
        }
    }
}
