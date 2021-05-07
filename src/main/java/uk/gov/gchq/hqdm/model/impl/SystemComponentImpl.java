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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.SYSTEM_COMPONENT;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfSystemComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfPhysicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.System;
import uk.gov.gchq.hqdm.model.SystemComponent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of SystemComponent.
 */
public class SystemComponentImpl extends HqdmObject implements SystemComponent {
    /**
     *
     * @param iri
     */
    public SystemComponentImpl(final IRI iri) {
        super(SystemComponentImpl.class, iri, SYSTEM_COMPONENT);
    }

    /**
     * Builder for SystemComponentImpl.
     */
    public static class Builder {
        /** */
        private final SystemComponentImpl systemComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            systemComponentImpl = new SystemComponentImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            systemComponentImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            systemComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A part_of relationship type where each system_component is part_of exactly one
         * {@link System}.
         *
         * @param system
         * @return
         */
        public final Builder component_Of_M(final System system) {
            systemComponentImpl.addValue(COMPONENT_OF, system.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            systemComponentImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            systemComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            systemComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a system_component may be a member_of one or more
         * {@link ClassOfSystemComponent}.
         *
         * @param classOfSystemComponent
         * @return
         */
        public final Builder member_Of(final ClassOfSystemComponent classOfSystemComponent) {
            systemComponentImpl.addValue(MEMBER_OF, classOfSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @param kindOfPhysicalObject
         * @return
         */
        public final Builder member_Of_Kind(final KindOfPhysicalObject kindOfPhysicalObject) {
            systemComponentImpl.addValue(MEMBER_OF_KIND, kindOfPhysicalObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            systemComponentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            systemComponentImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            systemComponentImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            systemComponentImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public SystemComponent build() throws HqdmException {
            if (systemComponentImpl.hasValue(AGGREGATED_INTO)
                    && systemComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (systemComponentImpl.hasValue(BEGINNING)
                    && systemComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!systemComponentImpl.hasValue(COMPONENT_OF)) {
                throw new HqdmException("Property Not Set: component_of");
            }
            if (systemComponentImpl.hasValue(ENDING)
                    && systemComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (systemComponentImpl.hasValue(MEMBER__OF)
                    && systemComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (systemComponentImpl.hasValue(MEMBER_OF)
                    && systemComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (systemComponentImpl.hasValue(MEMBER_OF_KIND)
                    && systemComponentImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (systemComponentImpl.hasValue(PART__OF)
                    && systemComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!systemComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (systemComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && systemComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (systemComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && systemComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return systemComponentImpl;
        }
    }
}
