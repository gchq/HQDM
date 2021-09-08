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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_CLASS_OF_SPATIO_TEMPORAL_EXTENT;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfClassOfSpatioTemporalExtent.
 */
public class ClassOfClassOfSpatioTemporalExtentImpl extends HqdmObject
        implements ClassOfClassOfSpatioTemporalExtent {
    /**
     * Constructs a new ClassOfClassOfSpatioTemporalExtent.
     *
     * @param iri IRI of the ClassOfClassOfSpatioTemporalExtent.
     */
    public ClassOfClassOfSpatioTemporalExtentImpl(final IRI iri) {
        super(ClassOfClassOfSpatioTemporalExtentImpl.class, iri,
                CLASS_OF_CLASS_OF_SPATIO_TEMPORAL_EXTENT);
    }

    /**
     * Builder for constructing instances of ClassOfClassOfSpatioTemporalExtent.
     */
    public static class Builder {

        private final ClassOfClassOfSpatioTemporalExtentImpl classOfClassOfSpatioTemporalExtentImpl;

        /**
         * Constructs a Builder for a new ClassOfClassOfSpatioTemporalExtent.
         *
         * @param iri IRI of the ClassOfClassOfSpatioTemporalExtent.
         */
        public Builder(final IRI iri) {
            classOfClassOfSpatioTemporalExtentImpl =
                    new ClassOfClassOfSpatioTemporalExtentImpl(iri);
        }

        /**
         * A relationship type where each {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link Class} is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the superclass.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfClassOfSpatioTemporalExtentImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
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
            classOfClassOfSpatioTemporalExtentImpl.addValue(MEMBER__OF, clazz.getIri());
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
            classOfClassOfSpatioTemporalExtentImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         * Returns an instance of ClassOfClassOfSpatioTemporalExtent created from the properties set
         * on this builder.
         *
         * @return The built ClassOfClassOfSpatioTemporalExtent.
         * @throws HqdmException If the ClassOfClassOfSpatioTemporalExtent is missing any mandatory
         *         properties.
         */
        public ClassOfClassOfSpatioTemporalExtent build() throws HqdmException {
            if (classOfClassOfSpatioTemporalExtentImpl.hasValue(HAS_SUPERCLASS)
                    && classOfClassOfSpatioTemporalExtentImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfClassOfSpatioTemporalExtentImpl.hasValue(MEMBER__OF)
                    && classOfClassOfSpatioTemporalExtentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfClassOfSpatioTemporalExtentImpl.hasValue(MEMBER_OF)
                    && classOfClassOfSpatioTemporalExtentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return classOfClassOfSpatioTemporalExtentImpl;
        }
    }
}
