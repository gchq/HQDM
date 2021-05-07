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
import static uk.gov.gchq.hqdm.iri.HQDM.STATE_OF_SALES_PRODUCT_INSTANCE;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSalesProductInstance;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SalesProductInstance;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.StateOfSalesProductInstance;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of StateOfSalesProductInstance.
 */
public class StateOfSalesProductInstanceImpl extends HqdmObject
        implements StateOfSalesProductInstance {
    /**
     *
     * @param iri
     */
    public StateOfSalesProductInstanceImpl(final IRI iri) {
        super(StateOfSalesProductInstanceImpl.class, iri, STATE_OF_SALES_PRODUCT_INSTANCE);
    }

    /**
     * Builder for StateOfSalesProductInstanceImpl.
     */
    public static class Builder {
        /** */
        private final StateOfSalesProductInstanceImpl stateOfSalesProductInstanceImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            stateOfSalesProductInstanceImpl = new StateOfSalesProductInstanceImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSalesProductInstanceImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            stateOfSalesProductInstanceImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSalesProductInstanceImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            stateOfSalesProductInstanceImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            stateOfSalesProductInstanceImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a state_of_sales_product_instance may be a member_of
         * one or more {@link ClassOfStateOfSalesProductInstance}.
         *
         * @param classOfStateOfSalesProductInstance
         * @return
         */
        public final Builder member_Of(
                final ClassOfStateOfSalesProductInstance classOfStateOfSalesProductInstance) {
            stateOfSalesProductInstanceImpl.addValue(MEMBER_OF,
                    classOfStateOfSalesProductInstance.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSalesProductInstanceImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            stateOfSalesProductInstanceImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            stateOfSalesProductInstanceImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A temporal_part_of relationship type where a state_of_sales_product_instance may be a
         * temporal_part_of one or more {@link SalesProductInstance}.
         *
         * @param salesProductInstance
         * @return
         */
        public final Builder temporal_Part_Of(final SalesProductInstance salesProductInstance) {
            stateOfSalesProductInstanceImpl.addValue(TEMPORAL_PART_OF,
                    salesProductInstance.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public StateOfSalesProductInstance build() throws HqdmException {
            if (stateOfSalesProductInstanceImpl.hasValue(AGGREGATED_INTO)
                    && stateOfSalesProductInstanceImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (stateOfSalesProductInstanceImpl.hasValue(BEGINNING)
                    && stateOfSalesProductInstanceImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (stateOfSalesProductInstanceImpl.hasValue(ENDING)
                    && stateOfSalesProductInstanceImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (stateOfSalesProductInstanceImpl.hasValue(MEMBER__OF)
                    && stateOfSalesProductInstanceImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (stateOfSalesProductInstanceImpl.hasValue(MEMBER_OF)
                    && stateOfSalesProductInstanceImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (stateOfSalesProductInstanceImpl.hasValue(PART__OF)
                    && stateOfSalesProductInstanceImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!stateOfSalesProductInstanceImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (stateOfSalesProductInstanceImpl.hasValue(TEMPORAL__PART_OF)
                    && stateOfSalesProductInstanceImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (stateOfSalesProductInstanceImpl.hasValue(TEMPORAL_PART_OF)
                    && stateOfSalesProductInstanceImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return stateOfSalesProductInstanceImpl;
        }
    }
}
