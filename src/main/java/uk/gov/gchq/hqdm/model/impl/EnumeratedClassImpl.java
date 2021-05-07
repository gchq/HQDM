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

import static uk.gov.gchq.hqdm.iri.HQDM.ENUMERATED_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.EnumeratedClass;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of EnumeratedClass.
 */
public class EnumeratedClassImpl extends HqdmObject implements EnumeratedClass {
    /**
     *
     * @param iri
     */
    public EnumeratedClassImpl(final IRI iri) {
        super(EnumeratedClassImpl.class, iri, ENUMERATED_CLASS);
    }

    /**
     * Builder for EnumeratedClassImpl.
     */
    public static class Builder {
        /** */
        private final EnumeratedClassImpl enumeratedClassImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            enumeratedClassImpl = new EnumeratedClassImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            enumeratedClassImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            enumeratedClassImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            enumeratedClassImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public EnumeratedClass build() throws HqdmException {
            if (enumeratedClassImpl.hasValue(HAS_SUPERCLASS)
                    && enumeratedClassImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (enumeratedClassImpl.hasValue(MEMBER__OF)
                    && enumeratedClassImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (enumeratedClassImpl.hasValue(MEMBER_OF)
                    && enumeratedClassImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return enumeratedClassImpl;
        }
    }
}
