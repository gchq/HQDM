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

import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_PHYSICAL_QUANTITY;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.KindOfPhysicalQuantity;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfPhysicalQuantity.
 */
public class KindOfPhysicalQuantityImpl extends HqdmObject implements KindOfPhysicalQuantity {
    /**
     *
     * @param iri
     */
    public KindOfPhysicalQuantityImpl(final IRI iri) {
        super(KindOfPhysicalQuantityImpl.class, iri, KIND_OF_PHYSICAL_QUANTITY);
    }

    /**
     * Builder for KindOfPhysicalQuantityImpl.
     */
    public static class Builder {
        /** */
        private final KindOfPhysicalQuantityImpl kindOfPhysicalQuantityImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            kindOfPhysicalQuantityImpl = new KindOfPhysicalQuantityImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            kindOfPhysicalQuantityImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            kindOfPhysicalQuantityImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            kindOfPhysicalQuantityImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public KindOfPhysicalQuantity build() throws HqdmException {
            if (kindOfPhysicalQuantityImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfPhysicalQuantityImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (kindOfPhysicalQuantityImpl.hasValue(MEMBER__OF)
                    && kindOfPhysicalQuantityImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfPhysicalQuantityImpl.hasValue(MEMBER_OF)
                    && kindOfPhysicalQuantityImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return kindOfPhysicalQuantityImpl;
        }
    }
}
