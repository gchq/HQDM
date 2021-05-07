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
import static uk.gov.gchq.hqdm.iri.HQDM.PHYSICAL_PROPERTY;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalProperty;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.KindOfPhysicalProperty;
import uk.gov.gchq.hqdm.model.PhysicalProperty;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of PhysicalProperty.
 */
public class PhysicalPropertyImpl extends HqdmObject implements PhysicalProperty {
    /**
     *
     * @param iri
     */
    public PhysicalPropertyImpl(final IRI iri) {
        super(PhysicalPropertyImpl.class, iri, PHYSICAL_PROPERTY);
    }

    /**
     * Builder for PhysicalPropertyImpl.
     */
    public static class Builder {
        /** */
        private final PhysicalPropertyImpl physicalPropertyImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            physicalPropertyImpl = new PhysicalPropertyImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            physicalPropertyImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            physicalPropertyImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            physicalPropertyImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a physical_property may be a member_of one or more
         * {@link ClassOfPhysicalProperty}.
         *
         * @param classOfPhysicalProperty
         * @return
         */
        public final Builder member_Of(final ClassOfPhysicalProperty classOfPhysicalProperty) {
            physicalPropertyImpl.addValue(MEMBER_OF, classOfPhysicalProperty.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            physicalPropertyImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a physical_property is a member_of exactly one
         * {@link KindOfPhysicalProperty}.
         *
         * @param kindOfPhysicalProperty
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfPhysicalProperty kindOfPhysicalProperty) {
            physicalPropertyImpl.addValue(MEMBER_OF_KIND, kindOfPhysicalProperty.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            physicalPropertyImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public PhysicalProperty build() throws HqdmException {
            if (physicalPropertyImpl.hasValue(HAS_SUPERCLASS)
                    && physicalPropertyImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (physicalPropertyImpl.hasValue(MEMBER__OF)
                    && physicalPropertyImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (physicalPropertyImpl.hasValue(MEMBER_OF)
                    && physicalPropertyImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (physicalPropertyImpl.hasValue(MEMBER_OF_)
                    && physicalPropertyImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (!physicalPropertyImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (physicalPropertyImpl.hasValue(PART__OF_BY_CLASS)
                    && physicalPropertyImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return physicalPropertyImpl;
        }
    }
}
