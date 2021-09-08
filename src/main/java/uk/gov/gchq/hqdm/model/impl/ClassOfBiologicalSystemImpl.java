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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_BIOLOGICAL_SYSTEM;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfBiologicalSystem;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfBiologicalSystem.
 */
public class ClassOfBiologicalSystemImpl extends HqdmObject implements ClassOfBiologicalSystem {
    /**
     * Constructs a new ClassOfBiologicalSystem.
     *
     * @param iri IRI of the ClassOfBiologicalSystem.
     */
    public ClassOfBiologicalSystemImpl(final IRI iri) {
        super(ClassOfBiologicalSystemImpl.class, iri, CLASS_OF_BIOLOGICAL_SYSTEM);
    }

    /**
     * Builder for constructing instances of ClassOfBiologicalSystem.
     */
    public static class Builder {

        private final ClassOfBiologicalSystemImpl classOfBiologicalSystemImpl;

        /**
         * Constructs a Builder for a new ClassOfBiologicalSystem.
         *
         * @param iri IRI of the ClassOfBiologicalSystem.
         */
        public Builder(final IRI iri) {
            classOfBiologicalSystemImpl = new ClassOfBiologicalSystemImpl(iri);
        }

        /**
         * An inverse {@link uk.gov.gchq.hqdm.iri.HQDM#PART__OF_BY_CLASS} relationship type where a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one {@link ClassOfSpatioTemporalExtent}
         * {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF} another
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a {@link ClassOfSpatioTemporalExtent}.
         *
         * @param classOfSpatioTemporalExtent The ClassOfSpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfBiologicalSystemImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where each {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link Class} is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the superclass.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfBiologicalSystemImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            classOfBiologicalSystemImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a {@link Class} may
         * be a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more {@link ClassOfClass}.
         *
         * @param classOfClass The ClassOfClass.
         * @return This builder.
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfBiologicalSystemImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a
         * {@link ClassOfSpatioTemporalExtent} may be a member of one or more
         * {@link ClassOfClassOfSpatioTemporalExtent}.
         *
         * @param classOfClassOfSpatioTemporalExtent The ClassOfClassOfSpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            classOfBiologicalSystemImpl.addValue(MEMBER_OF_,
                    classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a
         * {@link ClassOfSpatioTemporalExtent} is {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} some {@link ClassOfSpatioTemporalExtent}.
         *
         * @param classOfSpatioTemporalExtent The ClassOfSpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfBiologicalSystemImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * Returns an instance of ClassOfBiologicalSystem created from the properties set on this
         * builder.
         *
         * @return The built ClassOfBiologicalSystem.
         * @throws HqdmException If the ClassOfBiologicalSystem is missing any mandatory properties.
         */
        public ClassOfBiologicalSystem build() throws HqdmException {
            if (classOfBiologicalSystemImpl.hasValue(HAS_SUPERCLASS)
                    && classOfBiologicalSystemImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfBiologicalSystemImpl.hasValue(MEMBER__OF)
                    && classOfBiologicalSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfBiologicalSystemImpl.hasValue(MEMBER_OF)
                    && classOfBiologicalSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (classOfBiologicalSystemImpl.hasValue(MEMBER_OF_)
                    && classOfBiologicalSystemImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (classOfBiologicalSystemImpl.hasValue(PART__OF_BY_CLASS)
                    && classOfBiologicalSystemImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return classOfBiologicalSystemImpl;
        }
    }
}
