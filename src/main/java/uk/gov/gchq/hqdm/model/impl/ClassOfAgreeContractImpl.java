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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_AGREE_CONTRACT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfAgreeContract;
import uk.gov.gchq.hqdm.model.ClassOfAgreementExecution;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfContractProcess;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfAgreeContract.
 */
public class ClassOfAgreeContractImpl extends HqdmObject implements ClassOfAgreeContract {
    /**
     *
     * @param iri
     */
    public ClassOfAgreeContractImpl(final IRI iri) {
        super(ClassOfAgreeContractImpl.class, iri, CLASS_OF_AGREE_CONTRACT);
    }

    /**
     * Builder for ClassOfAgreeContractImpl.
     */
    public static class Builder {
        /** */
        private final ClassOfAgreeContractImpl classOfAgreeContractImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            classOfAgreeContractImpl = new ClassOfAgreeContractImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfAgreeContractImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfAgreeContractImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            classOfAgreeContractImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfAgreeContractImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            classOfAgreeContractImpl.addValue(MEMBER_OF_,
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
            classOfAgreeContractImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of_by_class relationship type where a member_of the class_of_agree_contract may be
         * a part_of a member_of one or more {@link ClassOfContractProcess}.
         *
         * @param classOfContractProcess
         * @return
         */
        public final Builder part_Of_By_Class(
                final ClassOfContractProcess classOfContractProcess) {
            classOfAgreeContractImpl.addValue(PART_OF_BY_CLASS, classOfContractProcess.getIri());
            return this;
        }

        /**
         *
         * @param classOfAgreementExecution
         * @return
         */
        public final Builder part_Of_By_Class_(
                final ClassOfAgreementExecution classOfAgreementExecution) {
            classOfAgreeContractImpl.addValue(PART_OF_BY_CLASS_,
                    classOfAgreementExecution.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ClassOfAgreeContract build() throws HqdmException {
            if (classOfAgreeContractImpl.hasValue(HAS_SUPERCLASS)
                    && classOfAgreeContractImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfAgreeContractImpl.hasValue(MEMBER__OF)
                    && classOfAgreeContractImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfAgreeContractImpl.hasValue(MEMBER_OF)
                    && classOfAgreeContractImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (classOfAgreeContractImpl.hasValue(MEMBER_OF_)
                    && classOfAgreeContractImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (classOfAgreeContractImpl.hasValue(PART__OF_BY_CLASS)
                    && classOfAgreeContractImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (classOfAgreeContractImpl.hasValue(PART_OF_BY_CLASS)
                    && classOfAgreeContractImpl.value(PART_OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class");
            }
            if (classOfAgreeContractImpl.hasValue(PART_OF_BY_CLASS_)
                    && classOfAgreeContractImpl.value(PART_OF_BY_CLASS_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class_");
            }
            return classOfAgreeContractImpl;
        }
    }
}
