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

import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.SALES_PRODUCT_VERSION;
import static uk.gov.gchq.hqdm.iri.HQDM.SOLD_AS;
import static uk.gov.gchq.hqdm.iri.HQDM.SUCCESSOR;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.SalesProduct;
import uk.gov.gchq.hqdm.model.SalesProductVersion;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of SalesProductVersion.
 */
public class SalesProductVersionImpl extends HqdmObject implements SalesProductVersion {
    /**
     *
     * @param iri
     */
    public SalesProductVersionImpl(final IRI iri) {
        super(SalesProductVersionImpl.class, iri, SALES_PRODUCT_VERSION);
    }

    /**
     * Builder for SalesProductVersionImpl.
     */
    public static class Builder {
        /** */
        private final SalesProductVersionImpl salesProductVersionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            salesProductVersionImpl = new SalesProductVersionImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            salesProductVersionImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            salesProductVersionImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            salesProductVersionImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            salesProductVersionImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            salesProductVersionImpl.addValue(MEMBER_OF_,
                    classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            salesProductVersionImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A specialization where the sales_product_version may be sold as a {@link SalesProduct}.
         *
         * @param salesProduct
         * @return
         */
        public final Builder sold_As(final SalesProduct salesProduct) {
            salesProductVersionImpl.addValue(SOLD_AS, salesProduct.getIri());
            return this;
        }

        /**
         * A relationship type where a sales_product_version may have exactly one successor.
         *
         * @param salesProductVersion
         * @return
         */
        public final Builder successor(final SalesProductVersion salesProductVersion) {
            salesProductVersionImpl.addValue(SUCCESSOR, salesProductVersion.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public SalesProductVersion build() throws HqdmException {
            if (salesProductVersionImpl.hasValue(HAS_SUPERCLASS)
                    && salesProductVersionImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (salesProductVersionImpl.hasValue(MEMBER__OF)
                    && salesProductVersionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (salesProductVersionImpl.hasValue(MEMBER_OF)
                    && salesProductVersionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (salesProductVersionImpl.hasValue(MEMBER_OF_)
                    && salesProductVersionImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (salesProductVersionImpl.hasValue(PART__OF_BY_CLASS)
                    && salesProductVersionImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (salesProductVersionImpl.hasValue(SOLD_AS)
                    && salesProductVersionImpl.value(SOLD_AS).isEmpty()) {
                throw new HqdmException("Property Not Set: sold_as");
            }
            if (salesProductVersionImpl.hasValue(SUCCESSOR)
                    && salesProductVersionImpl.value(SUCCESSOR).isEmpty()) {
                throw new HqdmException("Property Not Set: successor");
            }
            return salesProductVersionImpl;
        }
    }
}
