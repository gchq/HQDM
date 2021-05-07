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

import static uk.gov.gchq.hqdm.iri.HQDM.DEFINED_RELATIONSHIP;
import static uk.gov.gchq.hqdm.iri.HQDM.INVOLVES;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.Classification;
import uk.gov.gchq.hqdm.model.DefinedRelationship;
import uk.gov.gchq.hqdm.model.KindOfRelationshipWithSignature;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of DefinedRelationship.
 */
public class DefinedRelationshipImpl extends HqdmObject implements DefinedRelationship {
    /**
     *
     * @param iri
     */
    public DefinedRelationshipImpl(final IRI iri) {
        super(DefinedRelationshipImpl.class, iri, DEFINED_RELATIONSHIP);
    }

    /**
     * Builder for DefinedRelationshipImpl.
     */
    public static class Builder {
        /** */
        private final DefinedRelationshipImpl definedRelationshipImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            definedRelationshipImpl = new DefinedRelationshipImpl(iri);
        }

        /**
         * A meta-relationship type where the {@link Classification} of some thing in a role is
         * involved in a relationship.
         *
         * @param classification
         * @return
         */
        public final Builder involves_M(final Classification classification) {
            definedRelationshipImpl.addValue(INVOLVES, classification.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            definedRelationshipImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfRelationship
         * @return
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            definedRelationshipImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * A member_of relationship type where each defined_relationship is a member_of exactly one
         * {@link KindOfRelationshipWithSignature}.
         *
         * @param kindOfRelationshipWithSignature
         * @return
         */
        public final Builder member_Of_Kind_M(
                final KindOfRelationshipWithSignature kindOfRelationshipWithSignature) {
            definedRelationshipImpl.addValue(MEMBER_OF_KIND,
                    kindOfRelationshipWithSignature.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public DefinedRelationship build() throws HqdmException {
            if (!definedRelationshipImpl.hasValue(INVOLVES)) {
                throw new HqdmException("Property Not Set: involves");
            }
            if (definedRelationshipImpl.hasValue(MEMBER__OF)
                    && definedRelationshipImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (definedRelationshipImpl.hasValue(MEMBER_OF)
                    && definedRelationshipImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!definedRelationshipImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            return definedRelationshipImpl;
        }
    }
}
