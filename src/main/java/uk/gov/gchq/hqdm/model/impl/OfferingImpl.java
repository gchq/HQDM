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
import static uk.gov.gchq.hqdm.iri.HQDM.OFFERING;
import static uk.gov.gchq.hqdm.iri.HQDM.OFFEROR;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PERIOD_OFFERED;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfAgreementExecution;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfIndividual;
import uk.gov.gchq.hqdm.model.ClassOfReachingAgreement;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Offering;
import uk.gov.gchq.hqdm.model.Party;
import uk.gov.gchq.hqdm.model.PeriodOfTime;
import uk.gov.gchq.hqdm.model.Price;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Offering.
 */
public class OfferingImpl extends HqdmObject implements Offering {
    /**
     *
     * @param iri
     */
    public OfferingImpl(final IRI iri) {
        super(OfferingImpl.class, iri, OFFERING);
    }

    /**
     * Builder for OfferingImpl.
     */
    public static class Builder {
        /** */
        private final OfferingImpl offeringImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            offeringImpl = new OfferingImpl(iri);
        }

        /**
         * A relationship type where an offering has exactly one {@link ClassOfIndividual} some
         * member_of which is offered.
         *
         * @param classOfIndividual
         * @return
         */
        public final Builder class_Of_Offered_M(final ClassOfIndividual classOfIndividual) {
            offeringImpl.addValue(CLASS_OF_OFFERED, classOfIndividual.getIri());
            return this;
        }

        /**
         * A relationship type where an offering has exactly one {@link Price} at which the offering
         * is made.
         *
         * @param price
         * @return
         */
        public final Builder consideration_By_Class_M(final Price price) {
            offeringImpl.addValue(CONSIDERATION_BY_CLASS, price.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            offeringImpl.addValue(CONSISTS__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            offeringImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            offeringImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            offeringImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            offeringImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where an offering has exactly one {@link Party} who makes the
         * offering.
         *
         * @param party
         * @return
         */
        public final Builder offeror_M(final Party party) {
            offeringImpl.addValue(OFFEROR, party.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            offeringImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param classOfReachingAgreement
         * @return
         */
        public final Builder part_Of_By_Class(
                final ClassOfReachingAgreement classOfReachingAgreement) {
            offeringImpl.addValue(PART_OF_BY_CLASS, classOfReachingAgreement.getIri());
            return this;
        }

        /**
         *
         * @param classOfAgreementExecution
         * @return
         */
        public final Builder part_Of_By_Class_(
                final ClassOfAgreementExecution classOfAgreementExecution) {
            offeringImpl.addValue(PART_OF_BY_CLASS_, classOfAgreementExecution.getIri());
            return this;
        }

        /**
         * A relationship that is exactly one {@link PeriodOfTime} for which the offering is valid.
         *
         * @param periodOfTime
         * @return
         */
        public final Builder period_Offered_M(final PeriodOfTime periodOfTime) {
            offeringImpl.addValue(PERIOD_OFFERED, periodOfTime.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Offering build() throws HqdmException {
            if (!offeringImpl.hasValue(CLASS_OF_OFFERED)) {
                throw new HqdmException("Property Not Set: class_of_offered");
            }
            if (!offeringImpl.hasValue(CONSIDERATION_BY_CLASS)) {
                throw new HqdmException("Property Not Set: consideration_by_class");
            }
            if (offeringImpl.hasValue(HAS_SUPERCLASS)
                    && offeringImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (offeringImpl.hasValue(MEMBER__OF)
                    && offeringImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (offeringImpl.hasValue(MEMBER_OF)
                    && offeringImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (offeringImpl.hasValue(MEMBER_OF_)
                    && offeringImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (!offeringImpl.hasValue(OFFEROR)) {
                throw new HqdmException("Property Not Set: offeror");
            }
            if (offeringImpl.hasValue(PART__OF_BY_CLASS)
                    && offeringImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (offeringImpl.hasValue(PART_OF_BY_CLASS)
                    && offeringImpl.value(PART_OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class");
            }
            if (offeringImpl.hasValue(PART_OF_BY_CLASS_)
                    && offeringImpl.value(PART_OF_BY_CLASS_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class_");
            }
            if (!offeringImpl.hasValue(PERIOD_OFFERED)) {
                throw new HqdmException("Property Not Set: period_offered");
            }
            return offeringImpl;
        }
    }
}
