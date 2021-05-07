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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_SPATIO_TEMPORAL_EXTENT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfSpatioTemporalExtent.
 */
public class ClassOfSpatioTemporalExtentImpl extends HqdmObject
        implements ClassOfSpatioTemporalExtent {
    /**
     *
     * @param iri
     */
    public ClassOfSpatioTemporalExtentImpl(final IRI iri) {
        super(ClassOfSpatioTemporalExtentImpl.class, iri, CLASS_OF_SPATIO_TEMPORAL_EXTENT);
    }

    /**
     * Builder for ClassOfSpatioTemporalExtentImpl.
     */
    public static class Builder {
        /** */
        private final ClassOfSpatioTemporalExtentImpl classOfSpatioTemporalExtentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            classOfSpatioTemporalExtentImpl = new ClassOfSpatioTemporalExtentImpl(iri);
        }

        /**
         * An inverse part__of_by_class relationship type where a member_of one
         * class_of_spatio_temporal_extent consists_of another member_of a
         * class_of_spatio_temporal_extent.
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfSpatioTemporalExtentImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfSpatioTemporalExtentImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            classOfSpatioTemporalExtentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfSpatioTemporalExtentImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a class_of_spatio_temporal_extent may be a member of
         * one or more {@link ClassOfClassOfSpatioTemporalExtent}.
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            classOfSpatioTemporalExtentImpl.addValue(MEMBER_OF_,
                    classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where a member_of a class_of_spatio_temporal_extent is part_of a
         * member_of some class_of_spatio_temporal_extent.
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfSpatioTemporalExtentImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ClassOfSpatioTemporalExtent build() throws HqdmException {
            if (classOfSpatioTemporalExtentImpl.hasValue(HAS_SUPERCLASS)
                    && classOfSpatioTemporalExtentImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfSpatioTemporalExtentImpl.hasValue(MEMBER__OF)
                    && classOfSpatioTemporalExtentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfSpatioTemporalExtentImpl.hasValue(MEMBER_OF)
                    && classOfSpatioTemporalExtentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (classOfSpatioTemporalExtentImpl.hasValue(MEMBER_OF_)
                    && classOfSpatioTemporalExtentImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (classOfSpatioTemporalExtentImpl.hasValue(PART__OF_BY_CLASS)
                    && classOfSpatioTemporalExtentImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return classOfSpatioTemporalExtentImpl;
        }
    }
}
