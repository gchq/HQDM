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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_BY_CLASS_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.ROLE;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.KindOfAssociation;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Role.
 */
public class RoleImpl extends HqdmObject implements Role {
    /**
     *
     * @param iri
     */
    public RoleImpl(final IRI iri) {
        super(RoleImpl.class, iri, ROLE);
    }

    /**
     * Builder for RoleImpl.
     */
    public static class Builder {
        /** */
        private final RoleImpl roleImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            roleImpl = new RoleImpl(iri);
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder consists__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            roleImpl.addValue(CONSISTS__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            roleImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            roleImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            roleImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         *
         * @param classOfClassOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of_(
                final ClassOfClassOfSpatioTemporalExtent classOfClassOfSpatioTemporalExtent) {
            roleImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder part__Of_By_Class(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            roleImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of_by_class where a member_of a role is a participant in a member_of a
         * {@link KindOfActivity}.
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder part_Of_By_Class(final KindOfActivity kindOfActivity) {
            roleImpl.addValue(PART_OF_BY_CLASS, kindOfActivity.getIri());
            return this;
        }

        /**
         * A part_of_by_class where a member_of a role is a part_of a member_of the class.
         *
         * @param kindOfAssociation
         * @return
         */
        public final Builder part_Of_By_Class_(final KindOfAssociation kindOfAssociation) {
            roleImpl.addValue(PART_OF_BY_CLASS_, kindOfAssociation.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Role build() throws HqdmException {
            if (roleImpl.hasValue(HAS_SUPERCLASS)
                    && roleImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (roleImpl.hasValue(MEMBER__OF)
                    && roleImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (roleImpl.hasValue(MEMBER_OF)
                    && roleImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (roleImpl.hasValue(MEMBER_OF_)
                    && roleImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (roleImpl.hasValue(PART__OF_BY_CLASS)
                    && roleImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (roleImpl.hasValue(PART_OF_BY_CLASS)
                    && roleImpl.value(PART_OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class");
            }
            if (roleImpl.hasValue(PART_OF_BY_CLASS_)
                    && roleImpl.value(PART_OF_BY_CLASS_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_by_class_");
            }
            return roleImpl;
        }
    }
}
