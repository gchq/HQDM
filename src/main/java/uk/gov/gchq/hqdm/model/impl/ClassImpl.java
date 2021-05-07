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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Class.
 */
public class ClassImpl extends HqdmObject implements Class {
    /**
     *
     * @param iri
     */
    public ClassImpl(final IRI iri) {
        super(ClassImpl.class, iri, CLASS);
    }

    /**
     * Builder for ClassImpl.
     */
    public static class Builder {
        /** */
        private final ClassImpl classImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            classImpl = new ClassImpl(iri);
        }

        /**
         * A relationship type where each member_of the {@link Class} is a member_of the superclass.
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            classImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            classImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a class may be a member_of one or more
         * {@link ClassOfClass}.
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Class build() throws HqdmException {
            if (classImpl.hasValue(HAS_SUPERCLASS)
                    && classImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classImpl.hasValue(MEMBER__OF)
                    && classImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classImpl.hasValue(MEMBER_OF)
                    && classImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return classImpl;
        }
    }
}
