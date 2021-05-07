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

import static uk.gov.gchq.hqdm.iri.HQDM.AGGREGATED_INTO;
import static uk.gov.gchq.hqdm.iri.HQDM.BEGINNING;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.SPATIO_TEMPORAL_EXTENT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of SpatioTemporalExtent.
 */
public class SpatioTemporalExtentImpl extends HqdmObject implements SpatioTemporalExtent {
    /**
     *
     * @param iri
     */
    public SpatioTemporalExtentImpl(final IRI iri) {
        super(SpatioTemporalExtentImpl.class, iri, SPATIO_TEMPORAL_EXTENT);
    }

    /**
     * Builder for SpatioTemporalExtentImpl.
     */
    public static class Builder {
        /** */
        private final SpatioTemporalExtentImpl spatioTemporalExtentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            spatioTemporalExtentImpl = new SpatioTemporalExtentImpl(iri);
        }

        /**
         * A relationship type where a spatio_temporal_extent may be aggregated into one or more
         * others.
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            spatioTemporalExtentImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a spatio_temporal_extent has exactly one {@link Event}
         * that is its beginning.
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            spatioTemporalExtentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a spatio_temporal_extent may consist of one or more others.
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            spatioTemporalExtentImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a spatio_temporal_extent has exactly one {@link Event}
         * that is its ending.
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            spatioTemporalExtentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            spatioTemporalExtentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a spatio_temporal_extent is a member_of a
         * {@link ClassOfSpatioTemporalExtent}.
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            spatioTemporalExtentImpl.addValue(MEMBER_OF, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         * An aggregated_into relationship type where a spatio_temporal_extent may be part of
         * another and the whole has emergent properties and is more than just the sum of its parts.
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            spatioTemporalExtentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a spatio_temporal_extent may be part_of one or more
         * {@link PossibleWorld}.
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            spatioTemporalExtentImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a spatio_temporal_extent may be a temporal part of one
         * or more other spatio_temporal_extent.
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            spatioTemporalExtentImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public SpatioTemporalExtent build() throws HqdmException {
            if (spatioTemporalExtentImpl.hasValue(AGGREGATED_INTO)
                    && spatioTemporalExtentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (spatioTemporalExtentImpl.hasValue(BEGINNING)
                    && spatioTemporalExtentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (spatioTemporalExtentImpl.hasValue(ENDING)
                    && spatioTemporalExtentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (spatioTemporalExtentImpl.hasValue(MEMBER__OF)
                    && spatioTemporalExtentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (spatioTemporalExtentImpl.hasValue(MEMBER_OF)
                    && spatioTemporalExtentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (spatioTemporalExtentImpl.hasValue(PART__OF)
                    && spatioTemporalExtentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!spatioTemporalExtentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (spatioTemporalExtentImpl.hasValue(TEMPORAL__PART_OF)
                    && spatioTemporalExtentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            return spatioTemporalExtentImpl;
        }
    }
}
