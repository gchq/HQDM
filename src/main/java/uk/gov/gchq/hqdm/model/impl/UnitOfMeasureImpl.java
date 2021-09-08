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
import static uk.gov.gchq.hqdm.iri.HQDM.UNIT_OF_MEASURE;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.UnitOfMeasure;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of UnitOfMeasure.
 */
public class UnitOfMeasureImpl extends HqdmObject implements UnitOfMeasure {
    /**
     * Constructs a new UnitOfMeasure.
     *
     * @param iri IRI of the UnitOfMeasure.
     */
    public UnitOfMeasureImpl(final IRI iri) {
        super(UnitOfMeasureImpl.class, iri, UNIT_OF_MEASURE);
    }

    /**
     * Builder for constructing instances of UnitOfMeasure.
     */
    public static class Builder {

        private final UnitOfMeasureImpl unitOfMeasureImpl;

        /**
         * Constructs a Builder for a new UnitOfMeasure.
         *
         * @param iri IRI of the UnitOfMeasure.
         */
        public Builder(final IRI iri) {
            unitOfMeasureImpl = new UnitOfMeasureImpl(iri);
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            unitOfMeasureImpl.addValue(MEMBER__OF, clazz.getIri());
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
            unitOfMeasureImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * Returns an instance of UnitOfMeasure created from the properties set on this builder.
         *
         * @return The built UnitOfMeasure.
         * @throws HqdmException If the UnitOfMeasure is missing any mandatory properties.
         */
        public UnitOfMeasure build() throws HqdmException {
            if (unitOfMeasureImpl.hasValue(MEMBER__OF)
                    && unitOfMeasureImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (unitOfMeasureImpl.hasValue(MEMBER_OF)
                    && unitOfMeasureImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return unitOfMeasureImpl;
        }
    }
}
