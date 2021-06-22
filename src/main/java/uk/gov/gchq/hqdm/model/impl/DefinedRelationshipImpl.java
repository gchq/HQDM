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
     * Constructs a new DefinedRelationship.
     *
     * @param iri IRI of the DefinedRelationship.
     */
    public DefinedRelationshipImpl(final IRI iri) {
        super(DefinedRelationshipImpl.class, iri, DEFINED_RELATIONSHIP);
    }

    /**
     * Builder for constructing instances of DefinedRelationship.
     */
    public static class Builder {

        private final DefinedRelationshipImpl definedRelationshipImpl;

        /**
         * Constructs a Builder for a new DefinedRelationship.
         *
         * @param iri IRI of the DefinedRelationship.
         */
        public Builder(final IRI iri) {
            definedRelationshipImpl = new DefinedRelationshipImpl(iri);
        }

        /**
         * A meta-relationship type where the {@link Classification} of some
         * {@link uk.gov.gchq.hqdm.model.Thing} in a role is involved in a
         * {@link uk.gov.gchq.hqdm.model.Relationship}.
         *
         * @param classification The Classification.
         * @return This builder.
         */
        public final Builder involves_M(final Classification classification) {
            definedRelationshipImpl.addValue(INVOLVES, classification.getIri());
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
            definedRelationshipImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a relationship is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a {@link ClassOfRelationship}.
         *
         * @param classOfRelationship The ClassOfRelationship.
         * @return This builder.
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            definedRelationshipImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where each
         * {@link DefinedRelationship} is a {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} exactly one
         * {@link KindOfRelationshipWithSignature}.
         *
         * @param kindOfRelationshipWithSignature The KindOfRelationshipWithSignature.
         * @return This builder.
         */
        public final Builder member_Of_Kind_M(
                final KindOfRelationshipWithSignature kindOfRelationshipWithSignature) {
            definedRelationshipImpl.addValue(MEMBER_OF_KIND,
                    kindOfRelationshipWithSignature.getIri());
            return this;
        }

        /**
         * Returns an instance of DefinedRelationship created from the properties set on this
         * builder.
         *
         * @return The built DefinedRelationship.
         * @throws HqdmException If the DefinedRelationship is missing any mandatory properties.
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
