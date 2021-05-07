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
import static uk.gov.gchq.hqdm.iri.HQDM.DEFINED_BY;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_PLAN;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REQUIREMENT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Plan;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Requirement;
import uk.gov.gchq.hqdm.model.RequirementSpecification;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Requirement.
 */
public class RequirementImpl extends HqdmObject implements Requirement {
    /**
     *
     * @param iri
     */
    public RequirementImpl(final IRI iri) {
        super(RequirementImpl.class, iri, REQUIREMENT);
    }

    /**
     * Builder for RequirementImpl.
     */
    public static class Builder {
        /** */
        private final RequirementImpl requirementImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            requirementImpl = new RequirementImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            requirementImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            requirementImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            requirementImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a requirement is defined_by exactly one
         * {@link RequirementSpecification}.
         *
         * @param requirementSpecification
         * @return
         */
        public final Builder defined_By_M(final RequirementSpecification requirementSpecification) {
            requirementImpl.addValue(DEFINED_BY, requirementSpecification.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            requirementImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            requirementImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfSpatioTemporalExtent
         * @return
         */
        public final Builder member_Of(
                final ClassOfSpatioTemporalExtent classOfSpatioTemporalExtent) {
            requirementImpl.addValue(MEMBER_OF, classOfSpatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            requirementImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a requirement must be part_of one or more {@link Plan}.
         *
         * @param plan
         * @return
         */
        public final Builder part_Of_Plan_M(final Plan plan) {
            requirementImpl.addValue(PART_OF_PLAN, plan.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            requirementImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            requirementImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Requirement build() throws HqdmException {
            if (requirementImpl.hasValue(AGGREGATED_INTO)
                    && requirementImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (requirementImpl.hasValue(BEGINNING)
                    && requirementImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!requirementImpl.hasValue(DEFINED_BY)) {
                throw new HqdmException("Property Not Set: defined_by");
            }
            if (requirementImpl.hasValue(ENDING)
                    && requirementImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (requirementImpl.hasValue(MEMBER__OF)
                    && requirementImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (requirementImpl.hasValue(MEMBER_OF)
                    && requirementImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (requirementImpl.hasValue(PART__OF)
                    && requirementImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!requirementImpl.hasValue(PART_OF_PLAN)) {
                throw new HqdmException("Property Not Set: part_of_plan");
            }
            if (!requirementImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (requirementImpl.hasValue(TEMPORAL__PART_OF)
                    && requirementImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            return requirementImpl;
        }
    }
}
