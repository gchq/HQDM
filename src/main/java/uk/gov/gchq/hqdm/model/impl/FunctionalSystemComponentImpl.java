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
import static uk.gov.gchq.hqdm.iri.HQDM.COMPONENT_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.FUNCTIONAL_SYSTEM_COMPONENT;
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
import uk.gov.gchq.hqdm.model.ClassOfFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.FunctionalSystem;
import uk.gov.gchq.hqdm.model.FunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of FunctionalSystemComponent.
 */
public class FunctionalSystemComponentImpl extends HqdmObject implements FunctionalSystemComponent {
    /**
     *
     * @param iri
     */
    public FunctionalSystemComponentImpl(final IRI iri) {
        super(FunctionalSystemComponentImpl.class, iri, FUNCTIONAL_SYSTEM_COMPONENT);
    }

    /**
     * Builder for FunctionalSystemComponentImpl.
     */
    public static class Builder {
        /** */
        private final FunctionalSystemComponentImpl functionalSystemComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            functionalSystemComponentImpl = new FunctionalSystemComponentImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemComponentImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            functionalSystemComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A component_of relationship type where each functional_system_component is a component of
         * exactly one {@link FunctionalSystem}.
         *
         * @param functionalSystem
         * @return
         */
        public final Builder component_Of_M(final FunctionalSystem functionalSystem) {
            functionalSystemComponentImpl.addValue(COMPONENT_OF, functionalSystem.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemComponentImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            functionalSystemComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param role
         * @return
         */
        public final Builder intended_Role_M(final Role role) {
            functionalSystemComponentImpl.addValue(INTENDED_ROLE, role.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            functionalSystemComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a functional_system_component may be a member_of one
         * or more {@link ClassOfFunctionalSystemComponent}.
         *
         * @param classOfFunctionalSystemComponent
         * @return
         */
        public final Builder member_Of(
                final ClassOfFunctionalSystemComponent classOfFunctionalSystemComponent) {
            functionalSystemComponentImpl.addValue(MEMBER_OF,
                    classOfFunctionalSystemComponent.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where a functional_system_component is a member_of at
         * least one {@link KindOfFunctionalSystemComponent}.
         *
         * @param kindOfFunctionalSystemComponent
         * @return
         */
        public final Builder member_Of_Kind_M(
                final KindOfFunctionalSystemComponent kindOfFunctionalSystemComponent) {
            functionalSystemComponentImpl.addValue(MEMBER_OF_KIND,
                    kindOfFunctionalSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemComponentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            functionalSystemComponentImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalSystemComponentImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            functionalSystemComponentImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public FunctionalSystemComponent build() throws HqdmException {
            if (functionalSystemComponentImpl.hasValue(AGGREGATED_INTO)
                    && functionalSystemComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (functionalSystemComponentImpl.hasValue(BEGINNING)
                    && functionalSystemComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!functionalSystemComponentImpl.hasValue(COMPONENT_OF)) {
                throw new HqdmException("Property Not Set: component_of");
            }
            if (functionalSystemComponentImpl.hasValue(ENDING)
                    && functionalSystemComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (!functionalSystemComponentImpl.hasValue(INTENDED_ROLE)) {
                throw new HqdmException("Property Not Set: intended_role");
            }
            if (functionalSystemComponentImpl.hasValue(MEMBER__OF)
                    && functionalSystemComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (functionalSystemComponentImpl.hasValue(MEMBER_OF)
                    && functionalSystemComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!functionalSystemComponentImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (functionalSystemComponentImpl.hasValue(PART__OF)
                    && functionalSystemComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!functionalSystemComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (functionalSystemComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && functionalSystemComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (functionalSystemComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && functionalSystemComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return functionalSystemComponentImpl;
        }
    }
}
