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

import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.RELATIONSHIP;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.Relationship;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Relationship.
 */
public class RelationshipImpl extends HqdmObject implements Relationship {
    /**
     * Constructs a new Relationship.
     *
     * @param iri IRI of the Relationship.
     */
    public RelationshipImpl(final IRI iri) {
        super(RelationshipImpl.class, iri, RELATIONSHIP);
    }

    /**
     * Builder for constructing instances of Relationship.
     */
    public static class Builder {

        private final RelationshipImpl relationshipImpl;

        /**
         * Constructs a Builder for a new Relationship.
         *
         * @param iri IRI of the Relationship.
         */
        public Builder(final IRI iri) {
            relationshipImpl = new RelationshipImpl(iri);
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            relationshipImpl.addValue(MEMBER__OF, clazz.getIri());
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
            relationshipImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * Returns an instance of Relationship created from the properties set on this builder.
         *
         * @return The built Relationship.
         * @throws HqdmException If the Relationship is missing any mandatory properties.
         */
        public Relationship build() throws HqdmException {
            if (relationshipImpl.hasValue(MEMBER__OF)
                    && relationshipImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (relationshipImpl.hasValue(MEMBER_OF)
                    && relationshipImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return relationshipImpl;
        }
    }
}
