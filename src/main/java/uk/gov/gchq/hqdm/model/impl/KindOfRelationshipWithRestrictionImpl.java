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
import static uk.gov.gchq.hqdm.iri.HQDM.KIND_OF_RELATIONSHIP_WITH_RESTRICTION;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REQUIRED_ROLE_PLAYER;
import static uk.gov.gchq.hqdm.iri.HQDM.ROLES;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.Classification;
import uk.gov.gchq.hqdm.model.KindOfRelationshipWithRestriction;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of KindOfRelationshipWithRestriction.
 */
public class KindOfRelationshipWithRestrictionImpl extends HqdmObject
        implements KindOfRelationshipWithRestriction {
    /**
     *
     * @param iri
     */
    public KindOfRelationshipWithRestrictionImpl(final IRI iri) {
        super(KindOfRelationshipWithRestrictionImpl.class, iri,
                KIND_OF_RELATIONSHIP_WITH_RESTRICTION);
    }

    /**
     * Builder for KindOfRelationshipWithRestrictionImpl.
     */
    public static class Builder {
        /** */
        private final KindOfRelationshipWithRestrictionImpl kindOfRelationshipWithRestrictionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            kindOfRelationshipWithRestrictionImpl = new KindOfRelationshipWithRestrictionImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder has_Superclass(final Class clazz) {
            kindOfRelationshipWithRestrictionImpl.addValue(HAS_SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            kindOfRelationshipWithRestrictionImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfClass
         * @return
         */
        public final Builder member_Of(final ClassOfClass classOfClass) {
            kindOfRelationshipWithRestrictionImpl.addValue(MEMBER_OF, classOfClass.getIri());
            return this;
        }

        /**
         * A relationship type where the {@link Classification} is of a required role player for the
         * members of a kind_of_relationship_with_restriction.
         *
         * @param classification
         * @return
         */
        public final Builder required_Role_Player_M(final Classification classification) {
            kindOfRelationshipWithRestrictionImpl.addValue(REQUIRED_ROLE_PLAYER,
                    classification.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder roles_M(final Class clazz) {
            kindOfRelationshipWithRestrictionImpl.addValue(ROLES, clazz.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public KindOfRelationshipWithRestriction build() throws HqdmException {
            if (kindOfRelationshipWithRestrictionImpl.hasValue(HAS_SUPERCLASS)
                    && kindOfRelationshipWithRestrictionImpl.value(HAS_SUPERCLASS).isEmpty()) {
                throw new HqdmException("Property Not Set: has_superclass");
            }
            if (kindOfRelationshipWithRestrictionImpl.hasValue(MEMBER__OF)
                    && kindOfRelationshipWithRestrictionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (kindOfRelationshipWithRestrictionImpl.hasValue(MEMBER_OF)
                    && kindOfRelationshipWithRestrictionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!kindOfRelationshipWithRestrictionImpl.hasValue(REQUIRED_ROLE_PLAYER)) {
                throw new HqdmException("Property Not Set: required_role_player");
            }
            if (!kindOfRelationshipWithRestrictionImpl.hasValue(ROLES)) {
                throw new HqdmException("Property Not Set: roles");
            }
            return kindOfRelationshipWithRestrictionImpl;
        }
    }
}
