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
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_COMPONENT_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_SYSTEM;
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
import uk.gov.gchq.hqdm.model.KindOfSystem;
import uk.gov.gchq.hqdm.model.KindOfSystemComponent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfSystem.
 */
public class KindOfSystemImpl extends HqdmObject implements KindOfSystem {
    /**
     *
     * @param iri
     */
    public KindOfSystemImpl(final IRI iri) {
        super(KindOfSystemImpl.class, iri, KIND_OF_SYSTEM);
    }

    /**
     * Builder for KindOfSystemImpl.
     */
    public static class Builder {
        /** */
        private final KindOfSystemImpl kindOfSystemImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            kindOfSystemImpl = new KindOfSystemImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            kindOfSystemImpl.addValue(CONSISTS__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A consists_of_by_class relationship type where each member_of a kind_of_system has a
         * member_of one or more {@link KindOfSystemComponent} as a component.
         *
         * @param kindOfSystemComponent
         * @return
         */
        public final Builder has_Component_By_Class_M(
                final KindOfSystemComponent kindOfSystemComponent) {
            kindOfSystemImpl.addValue(HAS_COMPONENT_BY_CLASS, kindOfSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            kindOfSystemImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            kindOfSystemImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            kindOfSystemImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            kindOfSystemImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            kindOfSystemImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public KindOfSystem build() throws HqdmException {
            if (!kindOfSystemImpl.hasValue(HAS_COMPONENT_BY_CLASS)) {
                throw new HqdmException("Property Not Set: has_component_by_class");
            }
            if (kindOfSystemImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfSystemImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (kindOfSystemImpl.hasValue(MEMBER__OF)
                    && kindOfSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfSystemImpl.hasValue(MEMBER_OF)
                    && kindOfSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (kindOfSystemImpl.hasValue(MEMBER_OF_)
                    && kindOfSystemImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (kindOfSystemImpl.hasValue(PART__OF_BY_CLASS)
                    && kindOfSystemImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return kindOfSystemImpl;
        }
    }
}
