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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PHYSICAL_QUANTITY;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalQuantity;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.KindOfPhysicalQuantity;
import uk.gov.gchq.hqdm.model.PhysicalQuantity;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of PhysicalQuantity.
 */
public class PhysicalQuantityImpl extends HqdmObject implements PhysicalQuantity {
    /**
     *
     * @param iri
     */
    public PhysicalQuantityImpl(final IRI iri) {
        super(PhysicalQuantityImpl.class, iri, PHYSICAL_QUANTITY);
    }

    /**
     * Builder for PhysicalQuantityImpl.
     */
    public static class Builder {
        /** */
        private final PhysicalQuantityImpl physicalQuantityImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            physicalQuantityImpl = new PhysicalQuantityImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            physicalQuantityImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            physicalQuantityImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            physicalQuantityImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a physical_quantity may be a member_of one or more
         * {@link ClassOfPhysicalQuantity}.
         *
         * @param classOfPhysicalQuantity
         * @return
         */
        public final Builder member_Of(final ClassOfPhysicalQuantity classOfPhysicalQuantity) {
            physicalQuantityImpl.addValue(MEMBER_OF, classOfPhysicalQuantity.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            physicalQuantityImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a physical_quantity is a member_of exactly one
         * {@link KindOfPhysicalQuantity}.
         *
         * @param kindOfPhysicalQuantity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfPhysicalQuantity kindOfPhysicalQuantity) {
            physicalQuantityImpl.addValue(MEMBER_OF_KIND, kindOfPhysicalQuantity.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            physicalQuantityImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public PhysicalQuantity build() throws HqdmException {
            if (physicalQuantityImpl.hasValue(HAS_SUPERCLASS)
                    && physicalQuantityImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (physicalQuantityImpl.hasValue(MEMBER__OF)
                    && physicalQuantityImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (physicalQuantityImpl.hasValue(MEMBER_OF)
                    && physicalQuantityImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (physicalQuantityImpl.hasValue(MEMBER_OF_)
                    && physicalQuantityImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (!physicalQuantityImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (physicalQuantityImpl.hasValue(PART__OF_BY_CLASS)
                    && physicalQuantityImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return physicalQuantityImpl;
        }
    }
}
