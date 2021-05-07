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
import static uk.gov.gchq.hqdm.iri.HQDM.INTENDED_ROLE;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.SALES_PRODUCT_INSTANCE;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSalesProductInstance;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfOrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SalesProductInstance;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of SalesProductInstance.
 */
public class SalesProductInstanceImpl extends HqdmObject implements SalesProductInstance {
    /**
     *
     * @param iri
     */
    public SalesProductInstanceImpl(final IRI iri) {
        super(SalesProductInstanceImpl.class, iri, SALES_PRODUCT_INSTANCE);
    }

    /**
     * Builder for SalesProductInstanceImpl.
     */
    public static class Builder {
        /** */
        private final SalesProductInstanceImpl salesProductInstanceImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            salesProductInstanceImpl = new SalesProductInstanceImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            salesProductInstanceImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            salesProductInstanceImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            salesProductInstanceImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            salesProductInstanceImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param role
         * @return
         */
        public final Builder intended_Role_M(final Role role) {
            salesProductInstanceImpl.addValue(INTENDED_ROLE, role.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            salesProductInstanceImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a sales_product_instance may be a member_of one or
         * more {@link ClassOfSalesProductInstance}.
         *
         * @param classOfSalesProductInstance
         * @return
         */
        public final Builder member_Of(
                final ClassOfSalesProductInstance classOfSalesProductInstance) {
            salesProductInstanceImpl.addValue(MEMBER_OF, classOfSalesProductInstance.getIri());
            return this;
        }

        /**
         *
         * @param kindOfOrdinaryFunctionalObject
         * @return
         */
        public final Builder member_Of_Kind(
                final KindOfOrdinaryFunctionalObject kindOfOrdinaryFunctionalObject) {
            salesProductInstanceImpl.addValue(MEMBER_OF_KIND,
                    kindOfOrdinaryFunctionalObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            salesProductInstanceImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            salesProductInstanceImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            salesProductInstanceImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param salesProductInstance
         * @return
         */
        public final Builder temporal_Part_Of(final SalesProductInstance salesProductInstance) {
            salesProductInstanceImpl.addValue(TEMPORAL_PART_OF, salesProductInstance.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public SalesProductInstance build() throws HqdmException {
            if (salesProductInstanceImpl.hasValue(AGGREGATED_INTO)
                    && salesProductInstanceImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (salesProductInstanceImpl.hasValue(BEGINNING)
                    && salesProductInstanceImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (salesProductInstanceImpl.hasValue(ENDING)
                    && salesProductInstanceImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (!salesProductInstanceImpl.hasValue(INTENDED_ROLE)) {
                throw new HqdmException("Property Not Set: intended_role");
            }
            if (salesProductInstanceImpl.hasValue(MEMBER__OF)
                    && salesProductInstanceImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (salesProductInstanceImpl.hasValue(MEMBER_OF)
                    && salesProductInstanceImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (salesProductInstanceImpl.hasValue(MEMBER_OF_KIND)
                    && salesProductInstanceImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (salesProductInstanceImpl.hasValue(PART__OF)
                    && salesProductInstanceImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!salesProductInstanceImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (salesProductInstanceImpl.hasValue(TEMPORAL__PART_OF)
                    && salesProductInstanceImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (salesProductInstanceImpl.hasValue(TEMPORAL_PART_OF)
                    && salesProductInstanceImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return salesProductInstanceImpl;
        }
    }
}
