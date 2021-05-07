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
     *
     * @param iri
     */
    public ScaleImpl(final IRI iri) {
        super(ScaleImpl.class, iri, SCALE);
    }

    /**
     * Builder for ScaleImpl.
     */
    public static class Builder {
        /** */
        private final ScaleImpl scaleImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            scaleImpl = new ScaleImpl(iri);
        }

        /**
         * A scale has exactly one {@link KindOfPhysicalQuantity} as its domain.
         *
         * @param kindOfPhysicalQuantity
         * @return
         */
        public final Builder domain_M(final KindOfPhysicalQuantity kindOfPhysicalQuantity) {
            scaleImpl.addValue(DOMAIN, kindOfPhysicalQuantity.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            scaleImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfRelationship
         * @return
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            scaleImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * A scale may have at most one {@link UnitOfMeasure}.
         *
         * @param unitOfMeasure
         * @return
         */
        public final Builder unit(final UnitOfMeasure unitOfMeasure) {
            scaleImpl.addValue(UNIT, unitOfMeasure.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
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
