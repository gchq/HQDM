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

import static uk.gov.gchq.hqdm.iri.HQDM.COMPONENT_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_COMPONENT_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_ORGANIZATION;
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
import uk.gov.gchq.hqdm.model.KindOfOrganization;
import uk.gov.gchq.hqdm.model.KindOfOrganizationComponent;
import uk.gov.gchq.hqdm.model.KindOfSystemComponent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfOrganization.
 */
public class KindOfOrganizationImpl extends HqdmObject implements KindOfOrganization {
    /**
     *
     * @param iri
     */
    public KindOfOrganizationImpl(final IRI iri) {
        super(KindOfOrganizationImpl.class, iri, KIND_OF_ORGANIZATION);
    }

    /**
     * Builder for KindOfOrganizationImpl.
     */
    public static class Builder {
        /** */
        private final KindOfOrganizationImpl kindOfOrganizationImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            kindOfOrganizationImpl = new KindOfOrganizationImpl(iri);
        }

        /**
         *
         * @param kindOfOrganizationComponent
         * @return
         */
        public final Builder component_By_Class_M(
                final KindOfOrganizationComponent kindOfOrganizationComponent) {
            kindOfOrganizationImpl.addValue(COMPONENT_BY_CLASS,
                    kindOfOrganizationComponent.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            kindOfOrganizationImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param kindOfSystemComponent
         * @return
         */
        public final Builder has_Component_By_Class_M(
                final KindOfSystemComponent kindOfSystemComponent) {
            kindOfOrganizationImpl.addValue(HAS_COMPONENT_BY_CLASS, kindOfSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            kindOfOrganizationImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            kindOfOrganizationImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            kindOfOrganizationImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            kindOfOrganizationImpl.addValue(MEMBER_OF_,
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
            kindOfOrganizationImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public KindOfOrganization build() throws HqdmException {
            if (!kindOfOrganizationImpl.hasValue(COMPONENT_BY_CLASS)) {
                throw new HqdmException("Property Not Set: component_by_class");
            }
            if (!kindOfOrganizationImpl.hasValue(HAS_COMPONENT_BY_CLASS)) {
                throw new HqdmException("Property Not Set: has_component_by_class");
            }
            if (kindOfOrganizationImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfOrganizationImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (kindOfOrganizationImpl.hasValue(MEMBER__OF)
                    && kindOfOrganizationImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfOrganizationImpl.hasValue(MEMBER_OF)
                    && kindOfOrganizationImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (kindOfOrganizationImpl.hasValue(MEMBER_OF_)
                    && kindOfOrganizationImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (kindOfOrganizationImpl.hasValue(PART__OF_BY_CLASS)
                    && kindOfOrganizationImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return kindOfOrganizationImpl;
        }
    }
}
