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

import static uk.gov.gchq.hqdm.iri.HQDM.HAS_SUPERCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_RELATIONSHIP_WITH_SIGNATURE;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ROLES;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.KindOfRelationshipWithSignature;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfRelationshipWithSignature.
 */
public class KindOfRelationshipWithSignatureImpl extends HqdmObject
        implements KindOfRelationshipWithSignature {
    /**
     * Constructs a new KindOfRelationshipWithSignature.
     *
     * @param iri IRI of the KindOfRelationshipWithSignature.
     */
    public KindOfRelationshipWithSignatureImpl(final IRI iri) {
        super(KindOfRelationshipWithSignatureImpl.class, iri, KIND_OF_RELATIONSHIP_WITH_SIGNATURE);
    }

    /**
     * Builder for constructing instances of KindOfRelationshipWithSignature.
     */
    public static class Builder {

        private final KindOfRelationshipWithSignatureImpl kindOfRelationshipWithSignatureImpl;

        /**
         * Constructs a Builder for a new KindOfRelationshipWithSignature.
         *
         * @param iri IRI of the KindOfRelationshipWithSignature.
         */
        public Builder(final IRI iri) {
            kindOfRelationshipWithSignatureImpl = new KindOfRelationshipWithSignatureImpl(iri);
        }

        /**
         * A relationship type where each {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the
         * {@link Class} is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} the superclass.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder has_Superclass(final Class clazz) {
            kindOfRelationshipWithSignatureImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
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
            kindOfRelationshipWithSignatureImpl.addValue(MEMBER__OF, clazz.getIri());
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
            kindOfRelationshipWithSignatureImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         * The roles that must be filled by members of a {@link KindOfRelationshipWithSignature}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder roles_M(final Class clazz) {
            kindOfRelationshipWithSignatureImpl.addValue(ROLES, clazz.getIri());
            return this;
        }

        /**
         * Returns an instance of KindOfRelationshipWithSignature created from the properties set on
         * this builder.
         *
         * @return The built KindOfRelationshipWithSignature.
         * @throws HqdmException If the KindOfRelationshipWithSignature is missing any mandatory
         *         properties.
         */
        public KindOfRelationshipWithSignature build() throws HqdmException {
            if (kindOfRelationshipWithSignatureImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfRelationshipWithSignatureImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (kindOfRelationshipWithSignatureImpl.hasValue(MEMBER__OF)
                    && kindOfRelationshipWithSignatureImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfRelationshipWithSignatureImpl.hasValue(MEMBER_OF)
                    && kindOfRelationshipWithSignatureImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!kindOfRelationshipWithSignatureImpl.hasValue(ROLES)) {
                throw new HqdmException("Property Not Set: roles");
            }
            return kindOfRelationshipWithSignatureImpl;
        }
    }
}
