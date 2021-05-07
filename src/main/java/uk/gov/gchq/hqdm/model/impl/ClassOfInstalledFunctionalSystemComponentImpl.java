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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASS_OF_INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT;
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
import uk.gov.gchq.hqdm.model.ClassOfInstalledFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfInstalledFunctionalSystemComponent.
 */
public class ClassOfInstalledFunctionalSystemComponentImpl extends HqdmObject
        implements ClassOfInstalledFunctionalSystemComponent {
    /**
     *
     * @param iri
     */
    public ClassOfInstalledFunctionalSystemComponentImpl(final IRI iri) {
        super(ClassOfInstalledFunctionalSystemComponentImpl.class, iri,
                CLASS_OF_INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT);
    }

    /**
     * Builder for ClassOfInstalledFunctionalSystemComponentImpl.
     */
    public static class Builder {
        /** */
        @SuppressWarnings("LineLength")
        private final ClassOfInstalledFunctionalSystemComponentImpl classOfInstalledFunctionalSystemComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            classOfInstalledFunctionalSystemComponentImpl =
                    new ClassOfInstalledFunctionalSystemComponentImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            classOfInstalledFunctionalSystemComponentImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            classOfInstalledFunctionalSystemComponentImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            classOfInstalledFunctionalSystemComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            classOfInstalledFunctionalSystemComponentImpl.addValue(MEMBER_OF,
                    classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            classOfInstalledFunctionalSystemComponentImpl.addValue(MEMBER_OF_,
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
            classOfInstalledFunctionalSystemComponentImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ClassOfInstalledFunctionalSystemComponent build() throws HqdmException {
            if (classOfInstalledFunctionalSystemComponentImpl.hasValue(HAS_SUPERCLASS)
                    && classOfInstalledFunctionalSystemComponentImpl
                            .value(HAS_SUPERCLASS)
                            .isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (classOfInstalledFunctionalSystemComponentImpl.hasValue(MEMBER__OF)
                    && classOfInstalledFunctionalSystemComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classOfInstalledFunctionalSystemComponentImpl.hasValue(MEMBER_OF)
                    && classOfInstalledFunctionalSystemComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (classOfInstalledFunctionalSystemComponentImpl.hasValue(MEMBER_OF_)
                    && classOfInstalledFunctionalSystemComponentImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (classOfInstalledFunctionalSystemComponentImpl.hasValue(PART__OF_BY_CLASS)
                    && classOfInstalledFunctionalSystemComponentImpl
                            .value(PART__OF_BY_CLASS)
                            .isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return classOfInstalledFunctionalSystemComponentImpl;
        }
    }
}
