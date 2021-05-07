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

import static uk.gov.gchq.hqdm.iri.HQDM.AGGREGATION;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART;
import static uk.gov.gchq.hqdm.iri.HQDM.WHOLE;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Aggregation;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Aggregation.
 */
public class AggregationImpl extends HqdmObject implements Aggregation {
    /**
     *
     * @param iri
     */
    public AggregationImpl(final IRI iri) {
        super(AggregationImpl.class, iri, AGGREGATION);
    }

    /**
     * Builder for AggregationImpl.
     */
    public static class Builder {
        /** */
        private final AggregationImpl aggregationImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            aggregationImpl = new AggregationImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            aggregationImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfRelationship
         * @return
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            aggregationImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * A relationship type where an aggregation has exactly one {@link SpatioTemporalExtent} as
         * the part.
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part_M(final SpatioTemporalExtent spatioTemporalExtent) {
            aggregationImpl.addValue(PART, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A relationship type where an aggregation has exactly one {@link SpatioTemporalExtent} as
         * the whole.
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder whole_M(final SpatioTemporalExtent spatioTemporalExtent) {
            aggregationImpl.addValue(WHOLE, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Aggregation build() throws HqdmException {
            if (aggregationImpl.hasValue(MEMBER__OF)
                    && aggregationImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (aggregationImpl.hasValue(MEMBER_OF)
                    && aggregationImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!aggregationImpl.hasValue(PART)) {
                throw new HqdmException("Property Not Set: part");
            }
            if (!aggregationImpl.hasValue(WHOLE)) {
                throw new HqdmException("Property Not Set: whole");
            }
            return aggregationImpl;
        }
    }
}
