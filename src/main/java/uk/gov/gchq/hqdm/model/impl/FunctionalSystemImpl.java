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
import static uk.gov.gchq.hqdm.iri.HQDM.FUNCTIONAL_SYSTEM;
import static uk.gov.gchq.hqdm.iri.HQDM.INTENDED_ROLE;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfFunctionalSystem;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.FunctionalSystem;
import uk.gov.gchq.hqdm.model.KindOfFunctionalSystem;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.System;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of FunctionalSystem.
 */
public class FunctionalSystemImpl extends HqdmObject implements FunctionalSystem {
    /**
     *
     * @param iri
     */
    public FunctionalSystemImpl(final IRI iri) {
        super(FunctionalSystemImpl.class, iri, FUNCTIONAL_SYSTEM);
    }

    /**
     * Builder for FunctionalSystemImpl.
     */
    public static class Builder {
        /** */
        private final FunctionalSystemImpl functionalSystemImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            functionalSystemImpl = new FunctionalSystemImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            functionalSystemImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            functionalSystemImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param role
         * @return
         */
        public final Builder intended_Role_M(final Role role) {
            functionalSystemImpl.addValue(INTENDED_ROLE, role.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            functionalSystemImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a functional_system may be a member_of one or more
         * {@link ClassOfFunctionalSystem}.
         *
         * @param classOfFunctionalSystem
         * @return
         */
        public final Builder member_Of(final ClassOfFunctionalSystem classOfFunctionalSystem) {
            functionalSystemImpl.addValue(MEMBER_OF, classOfFunctionalSystem.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where a functional_system may be a member_of one or
         * more {@link KindOfFunctionalSystem}.
         *
         * @param kindOfFunctionalSystem
         * @return
         */
        public final Builder member_Of_Kind(final KindOfFunctionalSystem kindOfFunctionalSystem) {
            functionalSystemImpl.addValue(MEMBER_OF_KIND, kindOfFunctionalSystem.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            functionalSystemImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param system
         * @return
         */
        public final Builder temporal_Part_Of(final System system) {
            functionalSystemImpl.addValue(TEMPORAL_PART_OF, system.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public FunctionalSystem build() throws HqdmException {
            if (functionalSystemImpl.hasValue(AGGREGATED_INTO)
                    && functionalSystemImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (functionalSystemImpl.hasValue(BEGINNING)
                    && functionalSystemImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (functionalSystemImpl.hasValue(ENDING)
                    && functionalSystemImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (!functionalSystemImpl.hasValue(INTENDED_ROLE)) {
                throw new HqdmException("Property Not Set: intended_role");
            }
            if (functionalSystemImpl.hasValue(MEMBER__OF)
                    && functionalSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (functionalSystemImpl.hasValue(MEMBER_OF)
                    && functionalSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (functionalSystemImpl.hasValue(MEMBER_OF_KIND)
                    && functionalSystemImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (functionalSystemImpl.hasValue(PART__OF)
                    && functionalSystemImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!functionalSystemImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (functionalSystemImpl.hasValue(TEMPORAL__PART_OF)
                    && functionalSystemImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (functionalSystemImpl.hasValue(TEMPORAL_PART_OF)
                    && functionalSystemImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return functionalSystemImpl;
        }
    }
}
