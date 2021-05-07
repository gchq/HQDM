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
import static uk.gov.gchq.hqdm.iri.HQDM.PERIOD_OF_TIME;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfPeriodOfTime;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.PeriodOfTime;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of PeriodOfTime.
 */
public class PeriodOfTimeImpl extends HqdmObject implements PeriodOfTime {
    /**
     *
     * @param iri
     */
    public PeriodOfTimeImpl(final IRI iri) {
        super(PeriodOfTimeImpl.class, iri, PERIOD_OF_TIME);
    }

    /**
     * Builder for PeriodOfTimeImpl.
     */
    public static class Builder {
        /** */
        private final PeriodOfTimeImpl periodOfTimeImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            periodOfTimeImpl = new PeriodOfTimeImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            periodOfTimeImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            periodOfTimeImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            periodOfTimeImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            periodOfTimeImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            periodOfTimeImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a period_of_time may be a member_of one or more
         * {@link ClassOfPeriodOfTime}.
         *
         * @param classOfPeriodOfTime
         * @return
         */
        public final Builder member_Of(final ClassOfPeriodOfTime classOfPeriodOfTime) {
            periodOfTimeImpl.addValue(MEMBER_OF, classOfPeriodOfTime.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            periodOfTimeImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            periodOfTimeImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            periodOfTimeImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            periodOfTimeImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a period_of_time may be a temporal_part_of one
         * or more {@link PossibleWorld}.
         *
         * @param possibleWorld
         * @return
         */
        public final Builder temporal_Part_Of_(final PossibleWorld possibleWorld) {
            periodOfTimeImpl.addValue(TEMPORAL_PART_OF_, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public PeriodOfTime build() throws HqdmException {
            if (periodOfTimeImpl.hasValue(AGGREGATED_INTO)
                    && periodOfTimeImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (periodOfTimeImpl.hasValue(BEGINNING)
                    && periodOfTimeImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (periodOfTimeImpl.hasValue(ENDING)
                    && periodOfTimeImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (periodOfTimeImpl.hasValue(MEMBER__OF)
                    && periodOfTimeImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (periodOfTimeImpl.hasValue(MEMBER_OF)
                    && periodOfTimeImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (periodOfTimeImpl.hasValue(PART__OF)
                    && periodOfTimeImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!periodOfTimeImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (periodOfTimeImpl.hasValue(TEMPORAL__PART_OF)
                    && periodOfTimeImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (periodOfTimeImpl.hasValue(TEMPORAL_PART_OF)
                    && periodOfTimeImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            if (periodOfTimeImpl.hasValue(TEMPORAL_PART_OF_)
                    && periodOfTimeImpl.value(TEMPORAL_PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of_");
            }
            return periodOfTimeImpl;
        }
    }
}
