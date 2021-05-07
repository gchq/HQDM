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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_PHYSICAL_PROPERTY;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalProperty;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfPhysicalProperty.
 */
public class ClassOfPhysicalPropertyImpl extends HqdmObject implements ClassOfPhysicalProperty {
    /**
     *
     * @param iri
     */
    public ClassOfPhysicalPropertyImpl(final IRI iri) {
        super(ClassOfPhysicalPropertyImpl.class, iri, CLASS_OF_PHYSICAL_PROPERTY);
    }

    /**
     * Builder for ClassOfPhysicalPropertyImpl.
     */
    public static class Builder {
        /** */
        private final ClassOfPhysicalPropertyImpl classOfPhysicalPropertyImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            classOfPhysicalPropertyImpl = new ClassOfPhysicalPropertyImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfPhysicalPropertyImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            classOfPhysicalPropertyImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfPhysicalPropertyImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ClassOfPhysicalProperty build() throws HqdmException {
            if (classOfPhysicalPropertyImpl.hasValue(HAS_SUPERCLASS)
                    && classOfPhysicalPropertyImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfPhysicalPropertyImpl.hasValue(MEMBER__OF)
                    && classOfPhysicalPropertyImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfPhysicalPropertyImpl.hasValue(MEMBER_OF)
                    && classOfPhysicalPropertyImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return classOfPhysicalPropertyImpl;
        }
    }
}
