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
import static uk.gov.gchq.hqdm.iri.HQDM.LOWER_BOUND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PHYSICAL_QUANTITY_RANGE;
import static uk.gov.gchq.hqdm.iri.HQDM.RANGES_OVER;
import static uk.gov.gchq.hqdm.iri.HQDM.UPPER_BOUND;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.PhysicalProperty;
import uk.gov.gchq.hqdm.model.PhysicalQuantity;
import uk.gov.gchq.hqdm.model.PhysicalQuantityRange;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of PhysicalQuantityRange.
 */
public class PhysicalQuantityRangeImpl extends HqdmObject implements PhysicalQuantityRange {
    /**
     *
     * @param iri
     */
    public PhysicalQuantityRangeImpl(final IRI iri) {
        super(PhysicalQuantityRangeImpl.class, iri, PHYSICAL_QUANTITY_RANGE);
    }

    /**
     * Builder for PhysicalQuantityRangeImpl.
     */
    public static class Builder {
        /** */
        private final PhysicalQuantityRangeImpl physicalQuantityRangeImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            physicalQuantityRangeImpl = new PhysicalQuantityRangeImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            physicalQuantityRangeImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            physicalQuantityRangeImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         * A supertype_of relationship type where each physical_quantity_range must have as
         * lower_bound exactly one {@link PhysicalQuantity}.
         *
         * @param physicalQuantity
         * @return
         */
        public final Builder lower_Bound_M(final PhysicalQuantity physicalQuantity) {
            physicalQuantityRangeImpl.addValue(LOWER_BOUND, physicalQuantity.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            physicalQuantityRangeImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            physicalQuantityRangeImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            physicalQuantityRangeImpl.addValue(MEMBER_OF_,
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
            physicalQuantityRangeImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param physicalProperty
         * @return
         */
        public final Builder ranges_Over_M(final PhysicalProperty physicalProperty) {
            physicalQuantityRangeImpl.addValue(RANGES_OVER, physicalProperty.getIri());
            return this;
        }

        /**
         * A supertype_of relationship type where each physical_quantity_range must have as
         * upper_bound exactly one {@link PhysicalQuantity}.
         *
         * @param physicalQuantity
         * @return
         */
        public final Builder upper_Bound_M(final PhysicalQuantity physicalQuantity) {
            physicalQuantityRangeImpl.addValue(UPPER_BOUND, physicalQuantity.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public PhysicalQuantityRange build() throws HqdmException {
            if (physicalQuantityRangeImpl.hasValue(HAS_SUPERCLASS)
                    && physicalQuantityRangeImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (!physicalQuantityRangeImpl.hasValue(LOWER_BOUND)) {
                throw new HqdmException("Property Not Set: lower_bound");
            }
            if (physicalQuantityRangeImpl.hasValue(MEMBER__OF)
                    && physicalQuantityRangeImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (physicalQuantityRangeImpl.hasValue(MEMBER_OF)
                    && physicalQuantityRangeImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (physicalQuantityRangeImpl.hasValue(MEMBER_OF_)
                    && physicalQuantityRangeImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (physicalQuantityRangeImpl.hasValue(PART__OF_BY_CLASS)
                    && physicalQuantityRangeImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (!physicalQuantityRangeImpl.hasValue(RANGES_OVER)) {
                throw new HqdmException("Property Not Set: ranges_over");
            }
            if (!physicalQuantityRangeImpl.hasValue(UPPER_BOUND)) {
                throw new HqdmException("Property Not Set: upper_bound");
            }
            return physicalQuantityRangeImpl;
        }
    }
}
