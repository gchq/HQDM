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
import static uk.gov.gchq.hqdm.iri.HQDM.PHYSICAL_PROPERTY_RANGE;
import static uk.gov.gchq.hqdm.iri.HQDM.RANGES_OVER;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.PhysicalProperty;
import uk.gov.gchq.hqdm.model.PhysicalPropertyRange;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of PhysicalPropertyRange.
 */
public class PhysicalPropertyRangeImpl extends HqdmObject implements PhysicalPropertyRange {
    /**
     *
     * @param iri
     */
    public PhysicalPropertyRangeImpl(final IRI iri) {
        super(PhysicalPropertyRangeImpl.class, iri, PHYSICAL_PROPERTY_RANGE);
    }

    /**
     * Builder for PhysicalPropertyRangeImpl.
     */
    public static class Builder {
        /** */
        private final PhysicalPropertyRangeImpl physicalPropertyRangeImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            physicalPropertyRangeImpl = new PhysicalPropertyRangeImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            physicalPropertyRangeImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            physicalPropertyRangeImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            physicalPropertyRangeImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            physicalPropertyRangeImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            physicalPropertyRangeImpl.addValue(MEMBER_OF_,
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
            physicalPropertyRangeImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A supertype_of relationship type where the members of each {@link PhysicalProperty} in
         * the physical_property_range are members of the physical_property_range.
         *
         * @param physicalProperty
         * @return
         */
        public final Builder ranges_Over_M(final PhysicalProperty physicalProperty) {
            physicalPropertyRangeImpl.addValue(RANGES_OVER, physicalProperty.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public PhysicalPropertyRange build() throws HqdmException {
            if (physicalPropertyRangeImpl.hasValue(HAS_SUPERCLASS)
                    && physicalPropertyRangeImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (physicalPropertyRangeImpl.hasValue(MEMBER__OF)
                    && physicalPropertyRangeImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (physicalPropertyRangeImpl.hasValue(MEMBER_OF)
                    && physicalPropertyRangeImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (physicalPropertyRangeImpl.hasValue(MEMBER_OF_)
                    && physicalPropertyRangeImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (physicalPropertyRangeImpl.hasValue(PART__OF_BY_CLASS)
                    && physicalPropertyRangeImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (!physicalPropertyRangeImpl.hasValue(RANGES_OVER)) {
                throw new HqdmException("Property Not Set: ranges_over");
            }
            return physicalPropertyRangeImpl;
        }
    }
}
