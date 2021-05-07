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
import static uk.gov.gchq.hqdm.iri.HQDM.MEETS_SPECIFICATION;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.SALES_PRODUCT;
import static uk.gov.gchq.hqdm.iri.HQDM.SOLD_UNDER;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ProductBrand;
import uk.gov.gchq.hqdm.model.RequirementSpecification;
import uk.gov.gchq.hqdm.model.SalesProduct;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of SalesProduct.
 */
public class SalesProductImpl extends HqdmObject implements SalesProduct {
    /**
     *
     * @param iri
     */
    public SalesProductImpl(final IRI iri) {
        super(SalesProductImpl.class, iri, SALES_PRODUCT);
    }

    /**
     * Builder for SalesProductImpl.
     */
    public static class Builder {
        /** */
        private final SalesProductImpl salesProductImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            salesProductImpl = new SalesProductImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            salesProductImpl.addValue(CONSISTS__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            salesProductImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         * A subclass_of relationship type where when a sales_product meets_specification of a
         * {@link RequirementSpecification}, each member_of a sales_product is a member_of the
         * {@link RequirementSpecification}.
         *
         * @param requirementSpecification
         * @return
         */
        public final Builder meets_Specification(
                final RequirementSpecification requirementSpecification) {
            salesProductImpl.addValue(MEETS_SPECIFICATION, requirementSpecification.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            salesProductImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            salesProductImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            salesProductImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            salesProductImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A specialization where the sales_product is sold under a {@link ProductBrand}.
         *
         * @param productBrand
         * @return
         */
        public final Builder sold_Under(final ProductBrand productBrand) {
            salesProductImpl.addValue(SOLD_UNDER, productBrand.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public SalesProduct build() throws HqdmException {
            if (salesProductImpl.hasValue(HAS_SUPERCLASS)
                    && salesProductImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (salesProductImpl.hasValue(MEETS_SPECIFICATION)
                    && salesProductImpl.value(MEETS_SPECIFICATION).isEmpty()) {
                throw new HqdmException("Property Not Set: meets_specification");
            }
            if (salesProductImpl.hasValue(MEMBER__OF)
                    && salesProductImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (salesProductImpl.hasValue(MEMBER_OF)
                    && salesProductImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (salesProductImpl.hasValue(MEMBER_OF_)
                    && salesProductImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (salesProductImpl.hasValue(PART__OF_BY_CLASS)
                    && salesProductImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (salesProductImpl.hasValue(SOLD_UNDER)
                    && salesProductImpl.value(SOLD_UNDER).isEmpty()) {
                throw new HqdmException("Property Not Set: sold_under");
            }
            return salesProductImpl;
        }
    }
}
