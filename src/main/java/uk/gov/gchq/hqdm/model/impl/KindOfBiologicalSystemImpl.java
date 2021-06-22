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
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_BIOLOGICAL_SYSTEM;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.NATURAL_ROLE_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.KindOfBiologicalSystem;
import uk.gov.gchq.hqdm.model.KindOfBiologicalSystemComponent;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfBiologicalSystem.
 */
public class KindOfBiologicalSystemImpl extends HqdmObject implements KindOfBiologicalSystem {
    /**
     * Constructs a new KindOfBiologicalSystem.
     *
     * @param iri IRI of the KindOfBiologicalSystem.
     */
    public KindOfBiologicalSystemImpl(final IRI iri) {
        super(KindOfBiologicalSystemImpl.class, iri, KIND_OF_BIOLOGICAL_SYSTEM);
    }

    /**
     * Builder for constructing instances of KindOfBiologicalSystem.
     */
    public static class Builder {

        private final KindOfBiologicalSystemImpl kindOfBiologicalSystemImpl;

        /**
         * Constructs a Builder for a new KindOfBiologicalSystem.
         *
         * @param iri IRI of the KindOfBiologicalSystem.
         */
        public Builder(final IRI iri) {
            kindOfBiologicalSystemImpl = new KindOfBiologicalSystemImpl(iri);
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
            kindOfBiologicalSystemImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A has_component_by_class relationship type where each
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a {@link KindOfBiologicalSystem} has a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link KindOfBiologicalSystemComponent} as a component.
         *
         * @param kindOfBiologicalSystemComponent The KindOfBiologicalSystemComponent.
         * @return This builder.
         */
        public final Builder has_Component_By_Class_M(
                final KindOfBiologicalSystemComponent kindOfBiologicalSystemComponent) {
            kindOfBiologicalSystemImpl.addValue(HAS_COMPONENT_BY_CLASS,
                    kindOfBiologicalSystemComponent.getIri());
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
            kindOfBiologicalSystemImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
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
            kindOfBiologicalSystemImpl.addValue(MEMBER__OF, clazz.getIri());
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
            kindOfBiologicalSystemImpl.addValue(MEMBER_OF, classOfClass.getIri());
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
            kindOfBiologicalSystemImpl.addValue(MEMBER_OF_,
                    classOfClassOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where each {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link KindOfBiologicalSystem} naturally participates in the {@link Role}.
         *
         * @param role The Role.
         * @return This builder.
         */
        public final Builder natural_Role_By_Class_M(final Role role) {
            kindOfBiologicalSystemImpl.addValue(NATURAL_ROLE_BY_CLASS, role.getIri());
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
            kindOfBiologicalSystemImpl.addValue(PART__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * Returns an instance of KindOfBiologicalSystem created from the properties set on this
         * builder.
         *
         * @return The built KindOfBiologicalSystem.
         * @throws HqdmException If the KindOfBiologicalSystem is missing any mandatory properties.
         */
        public KindOfBiologicalSystem build() throws HqdmException {
            if (!kindOfBiologicalSystemImpl.hasValue(HAS_COMPONENT_BY_CLASS)) {
                throw new HqdmException("Property Not Set: has_component_by_class");
            }
            if (kindOfBiologicalSystemImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfBiologicalSystemImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (kindOfBiologicalSystemImpl.hasValue(MEMBER__OF)
                    && kindOfBiologicalSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfBiologicalSystemImpl.hasValue(MEMBER_OF)
                    && kindOfBiologicalSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (kindOfBiologicalSystemImpl.hasValue(MEMBER_OF_)
                    && kindOfBiologicalSystemImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (!kindOfBiologicalSystemImpl.hasValue(NATURAL_ROLE_BY_CLASS)) {
                throw new HqdmException("Property Not Set: natural_role_by_class");
            }
            if (kindOfBiologicalSystemImpl.hasValue(PART__OF_BY_CLASS)
                    && kindOfBiologicalSystemImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            return kindOfBiologicalSystemImpl;
        }
    }
}
