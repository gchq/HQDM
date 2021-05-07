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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_OFFERED;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSIDERATION_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.OFFEROR;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PERIOD_OFFERED;
import static uk.gov.gchq.hqdm.iri.HQDM.PRODUCT_OFFERING;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfAgreementExecution;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfReachingAgreement;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Party;
import uk.gov.gchq.hqdm.model.PeriodOfTime;
import uk.gov.gchq.hqdm.model.Price;
import uk.gov.gchq.hqdm.model.ProductOffering;
import uk.gov.gchq.hqdm.model.SalesProduct;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ProductOffering.
 */
public class ProductOfferingImpl extends HqdmObject implements ProductOffering {
    /**
     *
     * @param iri
     */
    public ProductOfferingImpl(final IRI iri) {
        super(ProductOfferingImpl.class, iri, PRODUCT_OFFERING);
    }

    /**
     * Builder for ProductOfferingImpl.
     */
    public static class Builder {
        /** */
        private final ProductOfferingImpl productOfferingImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            productOfferingImpl = new ProductOfferingImpl(iri);
        }

        /**
         * A class_of_offered relationship type where a member_of a {@link SalesProduct} is offered.
         *
         * @param salesProduct
         * @return
         */
        public final Builder class_Of_Offered_M(final SalesProduct salesProduct) {
            productOfferingImpl.addValue(CLASS_OF_OFFERED, salesProduct.getIri());
            return this;
        }

        /**
         *
         * @param price
         * @return
         */
        public final Builder consideration_By_Class_M(final Price price) {
            productOfferingImpl.addValue(CONSIDERATION_BY_CLASS, price.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            productOfferingImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            productOfferingImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            productOfferingImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            productOfferingImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            productOfferingImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param party
         * @return
         */
        public final Builder offeror_M(final Party party) {
            productOfferingImpl.addValue(OFFEROR, party.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            productOfferingImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param classOfReachingAgreement
         * @return
         */
        public final Builder part_Of_By_Class(
                final ClassOfReachingAgreement classOfReachingAgreement) {
            productOfferingImpl.addValue(PART_OF_BY_CLASS, classOfReachingAgreement.getIri());
            return this;
        }

        /**
         *
         * @param classOfAgreementExecution
         * @return
         */
        public final Builder part_Of_By_Class_(
                final ClassOfAgreementExecution classOfAgreementExecution) {
            productOfferingImpl.addValue(PART_OF_BY_CLASS_, classOfAgreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param periodOfTime
         * @return
         */
        public final Builder period_Offered_M(final PeriodOfTime periodOfTime) {
            productOfferingImpl.addValue(PERIOD_OFFERED, periodOfTime.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ProductOffering build() throws HqdmException {
            if (!productOfferingImpl.hasValue(CLASS_OF_OFFERED)) {
                throw new HqdmException("Property Not Set: class_of_offered");
            }
            if (!productOfferingImpl.hasValue(CONSIDERATION_BY_CLASS)) {
                throw new HqdmException("Property Not Set: consideration_by_class");
            }
            if (productOfferingImpl.hasValue(HAS_SUPERCLASS)
                    && productOfferingImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (productOfferingImpl.hasValue(MEMBER__OF)
                    && productOfferingImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (productOfferingImpl.hasValue(MEMBER_OF)
                    && productOfferingImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (productOfferingImpl.hasValue(MEMBER_OF_)
                    && productOfferingImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (!productOfferingImpl.hasValue(OFFEROR)) {
                throw new HqdmException("Property Not Set: offeror");
            }
            if (productOfferingImpl.hasValue(PART__OF_BY_CLASS)
                    && productOfferingImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (productOfferingImpl.hasValue(PART_OF_BY_CLASS)
                    && productOfferingImpl.value(PART_OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class");
            }
            if (productOfferingImpl.hasValue(PART_OF_BY_CLASS_)
                    && productOfferingImpl.value(PART_OF_BY_CLASS_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class_");
            }
            if (!productOfferingImpl.hasValue(PERIOD_OFFERED)) {
                throw new HqdmException("Property Not Set: period_offered");
            }
            return productOfferingImpl;
        }
    }
}
