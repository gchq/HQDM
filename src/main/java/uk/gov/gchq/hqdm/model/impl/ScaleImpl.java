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

import static uk.gov.gchq.hqdm.iri.HQDM.DOMAIN;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.SCALE;
import static uk.gov.gchq.hqdm.iri.HQDM.UNIT;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.KindOfPhysicalQuantity;
import uk.gov.gchq.hqdm.model.Scale;
import uk.gov.gchq.hqdm.model.UnitOfMeasure;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Scale.
 */
public class ScaleImpl extends HqdmObject implements Scale {
    /**
     * Constructs a new Scale.
     *
     * @param iri IRI of the Scale.
     */
    public ScaleImpl(final IRI iri) {
        super(ScaleImpl.class, iri, SCALE);
    }

    /**
     * Builder for constructing instances of Scale.
     */
    public static class Builder {

        private final ScaleImpl scaleImpl;

        /**
         * Constructs a Builder for a new Scale.
         *
         * @param iri IRI of the Scale.
         */
        public Builder(final IRI iri) {
            scaleImpl = new ScaleImpl(iri);
        }

        /**
         * A {@link Scale} has exactly one {@link KindOfPhysicalQuantity} as its domain.
         *
         * @param kindOfPhysicalQuantity The KindOfPhysicalQuantity.
         * @return This builder.
         */
        public final Builder domain_M(final KindOfPhysicalQuantity kindOfPhysicalQuantity) {
            scaleImpl.addValue(DOMAIN, kindOfPhysicalQuantity.getIri());
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
            scaleImpl.addValue(MEMBER__OF, clazz.getIri());
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
            scaleImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * A {@link Scale} may have at most one {@link UnitOfMeasure}.
         *
         * <p>
         * Note 1: A {@link UnitOfMeasure} may apply to more than one {@link Scale}.
         * </p>
         * <p>
         * Note 2: A {@link Scale} may not have a {@link UnitOfMeasure}. To have a
         * {@link UnitOfMeasure} the points on the {@link Scale} must be evenly placed so that
         * adding one means the same {@link uk.gov.gchq.hqdm.model.Thing}. This is not true for some
         * {@link Scale}s such as Rockwell Hardness where the points on the {@link Scale} are an
         * arbitrary distance apart. A {@link Scale} will also not have a {@link UnitOfMeasure} when
         * it is a dimensionless {@link Scale}.
         * </p>
         *
         * @param unitOfMeasure The UnitOfMeasure.
         * @return This builder.
         */
        public final Builder unit(final UnitOfMeasure unitOfMeasure) {
            scaleImpl.addValue(UNIT, unitOfMeasure.getIri());
            return this;
        }

        /**
         * Returns an instance of Scale created from the properties set on this builder.
         *
         * @return The built Scale.
         * @throws HqdmException If the Scale is missing any mandatory properties.
         */
        public Scale build() throws HqdmException {
            if (!scaleImpl.hasValue(DOMAIN)) {
                throw new HqdmException("Property Not Set: domain");
            }
            if (scaleImpl.hasValue(MEMBER__OF)
                    && scaleImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (scaleImpl.hasValue(MEMBER_OF)
                    && scaleImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (scaleImpl.hasValue(UNIT)
                    && scaleImpl.value(UNIT).isEmpty()) {
                throw new HqdmException("Property Not Set: unit");
            }
            return scaleImpl;
        }
    }
}
