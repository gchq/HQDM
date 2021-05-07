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
     *
     * @param iri
     */
    public KindOfRelationshipWithSignatureImpl(final IRI iri) {
        super(KindOfRelationshipWithSignatureImpl.class, iri, KIND_OF_RELATIONSHIP_WITH_SIGNATURE);
    }

    /**
     * Builder for KindOfRelationshipWithSignatureImpl.
     */
    public static class Builder {
        /** */
        private final KindOfRelationshipWithSignatureImpl kindOfRelationshipWithSignatureImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            kindOfRelationshipWithSignatureImpl = new KindOfRelationshipWithSignatureImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            kindOfRelationshipWithSignatureImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            kindOfRelationshipWithSignatureImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            kindOfRelationshipWithSignatureImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         * The roles that must be filled by members of a kind_of_relationship_with_signature.
         *
         * @param clazz
         * @return
         */
        public final Builder roles_M(final Class clazz) {
            kindOfRelationshipWithSignatureImpl.addValue(ROLES, clazz.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
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
