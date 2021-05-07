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
import static uk.gov.gchq.hqdm.iri.HQDM.INTERSECTION_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.REQUIREMENT_SPECIFICATION;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfState;
import uk.gov.gchq.hqdm.model.RequirementSpecification;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of RequirementSpecification.
 */
public class RequirementSpecificationImpl extends HqdmObject implements RequirementSpecification {
    /**
     *
     * @param iri
     */
    public RequirementSpecificationImpl(final IRI iri) {
        super(RequirementSpecificationImpl.class, iri, REQUIREMENT_SPECIFICATION);
    }

    /**
     * Builder for RequirementSpecificationImpl.
     */
    public static class Builder {
        /** */
        private final RequirementSpecificationImpl requirementSpecificationImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            requirementSpecificationImpl = new RequirementSpecificationImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            requirementSpecificationImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            requirementSpecificationImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         * A subtype_of relationship type where each requirement_specification is the
         * intersection_of one or more {@link ClassOfState}.
         *
         * @param classOfState
         * @return
         */
        public final Builder intersection_Of_M(final ClassOfState classOfState) {
            requirementSpecificationImpl.addValue(INTERSECTION_OF, classOfState.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            requirementSpecificationImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            requirementSpecificationImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            requirementSpecificationImpl.addValue(MEMBER_OF_,
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
            requirementSpecificationImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public RequirementSpecification build() throws HqdmException {
            if (requirementSpecificationImpl.hasValue(HAS_SUPERCLASS)
                    && requirementSpecificationImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (!requirementSpecificationImpl.hasValue(INTERSECTION_OF)) {
                throw new HqdmException("Property Not Set: intersection_of");
            }
            if (requirementSpecificationImpl.hasValue(MEMBER__OF)
                    && requirementSpecificationImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (requirementSpecificationImpl.hasValue(MEMBER_OF)
                    && requirementSpecificationImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (requirementSpecificationImpl.hasValue(MEMBER_OF_)
                    && requirementSpecificationImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (requirementSpecificationImpl.hasValue(PART__OF_BY_CLASS)
                    && requirementSpecificationImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return requirementSpecificationImpl;
        }
    }
}
