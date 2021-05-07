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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_CONTRACT_EXECUTION;
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
import uk.gov.gchq.hqdm.model.ClassOfAgreementExecution;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfContractExecution;
import uk.gov.gchq.hqdm.model.ClassOfContractProcess;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfContractExecution.
 */
public class ClassOfContractExecutionImpl extends HqdmObject implements ClassOfContractExecution {
    /**
     *
     * @param iri
     */
    public ClassOfContractExecutionImpl(final IRI iri) {
        super(ClassOfContractExecutionImpl.class, iri, CLASS_OF_CONTRACT_EXECUTION);
    }

    /**
     * Builder for ClassOfContractExecutionImpl.
     */
    public static class Builder {
        /** */
        private final ClassOfContractExecutionImpl classOfContractExecutionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            classOfContractExecutionImpl = new ClassOfContractExecutionImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfContractExecutionImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfContractExecutionImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            classOfContractExecutionImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfContractExecutionImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            classOfContractExecutionImpl.addValue(MEMBER_OF_,
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
            classOfContractExecutionImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of_by_class relationship type where a member_of the class_of_contract_execution
         * may be a part_of a member_of the {@link ClassOfContractProcess}.
         *
         * @param classOfContractProcess
         * @return
         */
        public final Builder part_Of_By_Class(
                final ClassOfContractProcess classOfContractProcess) {
            classOfContractExecutionImpl.addValue(PART_OF_BY_CLASS,
                    classOfContractProcess.getIri());
            return this;
        }

        /**
         *
         * @param classOfAgreementExecution
         * @return
         */
        public final Builder part_Of_By_Class_(
                final ClassOfAgreementExecution classOfAgreementExecution) {
            classOfContractExecutionImpl.addValue(PART_OF_BY_CLASS_,
                    classOfAgreementExecution.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ClassOfContractExecution build() throws HqdmException {
            if (classOfContractExecutionImpl.hasValue(HAS_SUPERCLASS)
                    && classOfContractExecutionImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfContractExecutionImpl.hasValue(MEMBER__OF)
                    && classOfContractExecutionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfContractExecutionImpl.hasValue(MEMBER_OF)
                    && classOfContractExecutionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (classOfContractExecutionImpl.hasValue(MEMBER_OF_)
                    && classOfContractExecutionImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (classOfContractExecutionImpl.hasValue(PART__OF_BY_CLASS)
                    && classOfContractExecutionImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (classOfContractExecutionImpl.hasValue(PART_OF_BY_CLASS)
                    && classOfContractExecutionImpl.value(PART_OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class");
            }
            if (classOfContractExecutionImpl.hasValue(PART_OF_BY_CLASS_)
                    && classOfContractExecutionImpl.value(PART_OF_BY_CLASS_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class_");
            }
            return classOfContractExecutionImpl;
        }
    }
}
