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
import static uk.gov.gchq.hqdm.iri.HQDM.ORDINARY_FUNCTIONAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfOrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfOrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.OrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of OrdinaryFunctionalObject.
 */
public class OrdinaryFunctionalObjectImpl extends HqdmObject implements OrdinaryFunctionalObject {
    /**
     *
     * @param iri
     */
    public OrdinaryFunctionalObjectImpl(final IRI iri) {
        super(OrdinaryFunctionalObjectImpl.class, iri, ORDINARY_FUNCTIONAL_OBJECT);
    }

    /**
     * Builder for OrdinaryFunctionalObjectImpl.
     */
    public static class Builder {
        /** */
        private final OrdinaryFunctionalObjectImpl ordinaryFunctionalObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            ordinaryFunctionalObjectImpl = new OrdinaryFunctionalObjectImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryFunctionalObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            ordinaryFunctionalObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryFunctionalObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            ordinaryFunctionalObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param role
         * @return
         */
        public final Builder intended_Role_M(final Role role) {
            ordinaryFunctionalObjectImpl.addValue(INTENDED_ROLE, role.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            ordinaryFunctionalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an ordinary_functional_object may be a member_of one
         * or more {@link ClassOfOrdinaryFunctionalObject}.
         *
         * @param classOfOrdinaryFunctionalObject
         * @return
         */
        public final Builder member_Of(
                final ClassOfOrdinaryFunctionalObject classOfOrdinaryFunctionalObject) {
            ordinaryFunctionalObjectImpl.addValue(MEMBER_OF,
                    classOfOrdinaryFunctionalObject.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an ordinary_functional_object may be a member_of one
         * or more {@link KindOfOrdinaryFunctionalObject}.
         *
         * @param kindOfOrdinaryFunctionalObject
         * @return
         */
        public final Builder member_Of_Kind(
                final KindOfOrdinaryFunctionalObject kindOfOrdinaryFunctionalObject) {
            ordinaryFunctionalObjectImpl.addValue(MEMBER_OF_KIND,
                    kindOfOrdinaryFunctionalObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryFunctionalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            ordinaryFunctionalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryFunctionalObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            ordinaryFunctionalObjectImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public OrdinaryFunctionalObject build() throws HqdmException {
            if (ordinaryFunctionalObjectImpl.hasValue(AGGREGATED_INTO)
                    && ordinaryFunctionalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(BEGINNING)
                    && ordinaryFunctionalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(ENDING)
                    && ordinaryFunctionalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (!ordinaryFunctionalObjectImpl.hasValue(INTENDED_ROLE)) {
                throw new HqdmException("Property Not Set: intended_role");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(MEMBER__OF)
                    && ordinaryFunctionalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(MEMBER_OF)
                    && ordinaryFunctionalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(MEMBER_OF_KIND)
                    && ordinaryFunctionalObjectImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(PART__OF)
                    && ordinaryFunctionalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!ordinaryFunctionalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && ordinaryFunctionalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (ordinaryFunctionalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && ordinaryFunctionalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return ordinaryFunctionalObjectImpl;
        }
    }
}
