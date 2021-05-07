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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfPossibleWorld;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfIndividual;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of PossibleWorld.
 */
public class PossibleWorldImpl extends HqdmObject implements PossibleWorld {
    /**
     *
     * @param iri
     */
    public PossibleWorldImpl(final IRI iri) {
        super(PossibleWorldImpl.class, iri, POSSIBLE_WORLD);
    }

    /**
     * Builder for PossibleWorldImpl.
     */
    public static class Builder {
        /** */
        private final PossibleWorldImpl possibleWorldImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            possibleWorldImpl = new PossibleWorldImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            possibleWorldImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            possibleWorldImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            possibleWorldImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            possibleWorldImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            possibleWorldImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a possible_world may be a member_of one or more
         * {@link ClassOfPossibleWorld}.
         *
         * @param classOfPossibleWorld
         * @return
         */
        public final Builder member_Of(final ClassOfPossibleWorld classOfPossibleWorld) {
            possibleWorldImpl.addValue(MEMBER_OF, classOfPossibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param kindOfIndividual
         * @return
         */
        public final Builder member_Of_Kind(final KindOfIndividual kindOfIndividual) {
            possibleWorldImpl.addValue(MEMBER_OF_KIND, kindOfIndividual.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            possibleWorldImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            possibleWorldImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            possibleWorldImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            possibleWorldImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder temporal_Part_Of_(final PossibleWorld possibleWorld) {
            possibleWorldImpl.addValue(TEMPORAL_PART_OF_, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public PossibleWorld build() throws HqdmException {
            if (possibleWorldImpl.hasValue(AGGREGATED_INTO)
                    && possibleWorldImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (possibleWorldImpl.hasValue(BEGINNING)
                    && possibleWorldImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (possibleWorldImpl.hasValue(ENDING)
                    && possibleWorldImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (possibleWorldImpl.hasValue(MEMBER__OF)
                    && possibleWorldImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (possibleWorldImpl.hasValue(MEMBER_OF)
                    && possibleWorldImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (possibleWorldImpl.hasValue(MEMBER_OF_KIND)
                    && possibleWorldImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (possibleWorldImpl.hasValue(PART__OF)
                    && possibleWorldImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!possibleWorldImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (possibleWorldImpl.hasValue(TEMPORAL__PART_OF)
                    && possibleWorldImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (possibleWorldImpl.hasValue(TEMPORAL_PART_OF)
                    && possibleWorldImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            if (possibleWorldImpl.hasValue(TEMPORAL_PART_OF_)
                    && possibleWorldImpl.value(TEMPORAL_PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of_");
            }
            return possibleWorldImpl;
        }
    }
}
