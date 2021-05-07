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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_IN_PLACE_BIOLOGICAL_COMPONENT;
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
import uk.gov.gchq.hqdm.model.ClassOfInPlaceBiologicalComponent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfInPlaceBiologicalComponent.
 */
public class ClassOfInPlaceBiologicalComponentImpl extends HqdmObject
        implements ClassOfInPlaceBiologicalComponent {
    /**
     *
     * @param iri
     */
    public ClassOfInPlaceBiologicalComponentImpl(final IRI iri) {
        super(ClassOfInPlaceBiologicalComponentImpl.class, iri,
                CLASS_OF_IN_PLACE_BIOLOGICAL_COMPONENT);
    }

    /**
     * Builder for ClassOfInPlaceBiologicalComponentImpl.
     */
    public static class Builder {
        /** */
        private final ClassOfInPlaceBiologicalComponentImpl classOfInPlaceBiologicalComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            classOfInPlaceBiologicalComponentImpl = new ClassOfInPlaceBiologicalComponentImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfInPlaceBiologicalComponentImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfInPlaceBiologicalComponentImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            classOfInPlaceBiologicalComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfInPlaceBiologicalComponentImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            classOfInPlaceBiologicalComponentImpl.addValue(MEMBER_OF_,
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
            classOfInPlaceBiologicalComponentImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ClassOfInPlaceBiologicalComponent build() throws HqdmException {
            if (classOfInPlaceBiologicalComponentImpl.hasValue(HAS_SUPERCLASS)
                    && classOfInPlaceBiologicalComponentImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfInPlaceBiologicalComponentImpl.hasValue(MEMBER__OF)
                    && classOfInPlaceBiologicalComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfInPlaceBiologicalComponentImpl.hasValue(MEMBER_OF)
                    && classOfInPlaceBiologicalComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (classOfInPlaceBiologicalComponentImpl.hasValue(MEMBER_OF_)
                    && classOfInPlaceBiologicalComponentImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (classOfInPlaceBiologicalComponentImpl.hasValue(PART__OF_BY_CLASS)
                    && classOfInPlaceBiologicalComponentImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return classOfInPlaceBiologicalComponentImpl;
        }
    }
}
