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
import static uk.gov.gchq.hqdm.iri.HQDM.PART;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_COMPOSITION;
import static uk.gov.gchq.hqdm.iri.HQDM.WHOLE;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.TemporalComposition;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of TemporalComposition.
 */
public class TemporalCompositionImpl extends HqdmObject implements TemporalComposition {
    /**
     * Constructs a new TemporalComposition.
     *
     * @param iri IRI of the TemporalComposition.
     */
    public TemporalCompositionImpl(final IRI iri) {
        super(TemporalCompositionImpl.class, iri, TEMPORAL_COMPOSITION);
    }

    /**
     * Builder for constructing instances of TemporalComposition.
     */
    public static class Builder {

        private final TemporalCompositionImpl temporalCompositionImpl;

        /**
         * Constructs a Builder for a new TemporalComposition.
         *
         * @param iri IRI of the TemporalComposition.
         */
        public Builder(final IRI iri) {
            temporalCompositionImpl = new TemporalCompositionImpl(iri);
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            temporalCompositionImpl.addValue(MEMBER__OF, clazz.getIri());
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
            temporalCompositionImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * A relationship type where an {@link uk.gov.gchq.hqdm.model.Aggregation} has exactly one
         * {@link SpatioTemporalExtent} as the part.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder part_M(final SpatioTemporalExtent spatioTemporalExtent) {
            temporalCompositionImpl.addValue(PART, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where an {@link uk.gov.gchq.hqdm.model.Aggregation} has exactly one
         * {@link SpatioTemporalExtent} as the whole.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder whole_M(final SpatioTemporalExtent spatioTemporalExtent) {
            temporalCompositionImpl.addValue(WHOLE, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * Returns an instance of TemporalComposition created from the properties set on this
         * builder.
         *
         * @return The built TemporalComposition.
         * @throws HqdmException If the TemporalComposition is missing any mandatory properties.
         */
        public TemporalComposition build() throws HqdmException {
            if (temporalCompositionImpl.hasValue(MEMBER__OF)
                    && temporalCompositionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (temporalCompositionImpl.hasValue(MEMBER_OF)
                    && temporalCompositionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!temporalCompositionImpl.hasValue(PART)) {
                throw new HqdmException("Property Not Set: part");
            }
            if (!temporalCompositionImpl.hasValue(WHOLE)) {
                throw new HqdmException("Property Not Set: whole");
            }
            return temporalCompositionImpl;
        }
    }
}
