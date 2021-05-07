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
import static uk.gov.gchq.hqdm.iri.HQDM.INTENDED_ROLE_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_FUNCTIONAL_OBJECT;
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
import uk.gov.gchq.hqdm.model.KindOfFunctionalObject;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfFunctionalObject.
 */
public class KindOfFunctionalObjectImpl extends HqdmObject implements KindOfFunctionalObject {
    /**
     *
     * @param iri
     */
    public KindOfFunctionalObjectImpl(final IRI iri) {
        super(KindOfFunctionalObjectImpl.class, iri, KIND_OF_FUNCTIONAL_OBJECT);
    }

    /**
     * Builder for KindOfFunctionalObjectImpl.
     */
    public static class Builder {
        /** */
        private final KindOfFunctionalObjectImpl kindOfFunctionalObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            kindOfFunctionalObjectImpl = new KindOfFunctionalObjectImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            kindOfFunctionalObjectImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            kindOfFunctionalObjectImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         * A relationship type where each member_of a kind_of_functional_object is intended to play
         * one or more {@link Role}.
         *
         * @param role
         * @return
         */
        public final Builder intended_Role_By_Class_M(final Role role) {
            kindOfFunctionalObjectImpl.addValue(INTENDED_ROLE_BY_CLASS, role.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            kindOfFunctionalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            kindOfFunctionalObjectImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            kindOfFunctionalObjectImpl.addValue(MEMBER_OF_,
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
            kindOfFunctionalObjectImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public KindOfFunctionalObject build() throws HqdmException {
            if (kindOfFunctionalObjectImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfFunctionalObjectImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (!kindOfFunctionalObjectImpl.hasValue(INTENDED_ROLE_BY_CLASS)) {
                throw new HqdmException("Property Not Set: intended_role_by_class");
            }
            if (kindOfFunctionalObjectImpl.hasValue(MEMBER__OF)
                    && kindOfFunctionalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfFunctionalObjectImpl.hasValue(MEMBER_OF)
                    && kindOfFunctionalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (kindOfFunctionalObjectImpl.hasValue(MEMBER_OF_)
                    && kindOfFunctionalObjectImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (kindOfFunctionalObjectImpl.hasValue(PART__OF_BY_CLASS)
                    && kindOfFunctionalObjectImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return kindOfFunctionalObjectImpl;
        }
    }
}
