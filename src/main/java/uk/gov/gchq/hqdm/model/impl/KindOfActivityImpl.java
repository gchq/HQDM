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

import static uk.gov.gchq.hqdm.iri.HQDM.CAUSES_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.DETERMINES_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_ACTIVITY;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF_BY_CLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.REFERENCES_BY_CLASS;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfEvent;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfActivity.
 */
public class KindOfActivityImpl extends HqdmObject implements KindOfActivity {
    /**
     * Constructs a new KindOfActivity.
     *
     * @param iri IRI of the KindOfActivity.
     */
    public KindOfActivityImpl(final IRI iri) {
        super(KindOfActivityImpl.class, iri, KIND_OF_ACTIVITY);
    }

    /**
     * Builder for constructing instances of KindOfActivity.
     */
    public static class Builder {

        private final KindOfActivityImpl kindOfActivityImpl;

        /**
         * Constructs a Builder for a new KindOfActivity.
         *
         * @param iri IRI of the KindOfActivity.
         */
        public Builder(final IRI iri) {
            kindOfActivityImpl = new KindOfActivityImpl(iri);
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link KindOfActivity} causes a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link ClassOfEvent}.
         *
         * @param classOfEvent The ClassOfEvent.
         * @return This builder.
         */
        public final Builder causes_By_Class(final ClassOfEvent classOfEvent) {
            kindOfActivityImpl.addValue(CAUSES_BY_CLASS, classOfEvent.getIri());
            return this;
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
            kindOfActivityImpl.addValue(CONSISTS__OF_BY_CLASS,
                    classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#CONSISTS_OF_BY_CLASS} relationship type where a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a {@link KindOfActivity} has a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a {@link Role} as a
         * {@link uk.gov.gchq.hqdm.model.Participant}.
         *
         * @param role The Role.
         * @return This builder.
         */
        public final Builder consists_Of_By_Class(final Role role) {
            kindOfActivityImpl.addValue(CONSISTS_OF_BY_CLASS, role.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link KindOfActivity} determines a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder determines_By_Class(final Class clazz) {
            kindOfActivityImpl.addValue(DETERMINES_BY_CLASS, clazz.getIri());
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
            kindOfActivityImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
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
            kindOfActivityImpl.addValue(MEMBER__OF, clazz.getIri());
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
            kindOfActivityImpl.addValue(MEMBER_OF, classOfClass.getIri());
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
            kindOfActivityImpl.addValue(MEMBER_OF_, classOfClassOfSpatioTemporalExtent.getIri());
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
            kindOfActivityImpl.addValue(PART__OF_BY_CLASS, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link KindOfActivity} references a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder references_By_Class(final Class clazz) {
            kindOfActivityImpl.addValue(REFERENCES_BY_CLASS, clazz.getIri());
            return this;
        }

        /**
         * Returns an instance of KindOfActivity created from the properties set on this builder.
         *
         * @return The built KindOfActivity.
         * @throws HqdmException If the KindOfActivity is missing any mandatory properties.
         */
        public KindOfActivity build() throws HqdmException {
            if (kindOfActivityImpl.hasValue(CAUSES_BY_CLASS)
                    && kindOfActivityImpl.value(CAUSES_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: causes_by_class");
            }
            if (kindOfActivityImpl.hasValue(DETERMINES_BY_CLASS)
                    && kindOfActivityImpl.value(DETERMINES_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: determines_by_class");
            }
            if (kindOfActivityImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfActivityImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (kindOfActivityImpl.hasValue(MEMBER__OF)
                    && kindOfActivityImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfActivityImpl.hasValue(MEMBER_OF)
                    && kindOfActivityImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (kindOfActivityImpl.hasValue(MEMBER_OF_)
                    && kindOfActivityImpl.value(MEMBER_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_");
            }
            if (kindOfActivityImpl.hasValue(PART__OF_BY_CLASS)
                    && kindOfActivityImpl.value(PART__OF_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of_by_class");
            }
            if (kindOfActivityImpl.hasValue(REFERENCES_BY_CLASS)
                    && kindOfActivityImpl.value(REFERENCES_BY_CLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: references_by_class");
            }
            return kindOfActivityImpl;
        }
    }
}
