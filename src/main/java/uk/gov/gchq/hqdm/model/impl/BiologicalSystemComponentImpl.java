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
import static uk.gov.gchq.hqdm.iri.HQDM.BIOLOGICAL_SYSTEM_COMPONENT;
import static uk.gov.gchq.hqdm.iri.HQDM.COMPONENT_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.BiologicalObject;
import uk.gov.gchq.hqdm.model.BiologicalSystem;
import uk.gov.gchq.hqdm.model.BiologicalSystemComponent;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfBiologicalSystemComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfBiologicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of BiologicalSystemComponent.
 */
public class BiologicalSystemComponentImpl extends HqdmObject
        implements BiologicalSystemComponent {
    /**
     *
     * @param iri
     */
    public BiologicalSystemComponentImpl(final IRI iri) {
        super(BiologicalSystemComponentImpl.class, iri, BIOLOGICAL_SYSTEM_COMPONENT);
    }

    /**
     * Builder for BiologicalSystemComponentImpl.
     */
    public static class Builder {
        /** */
        private final BiologicalSystemComponentImpl biologicalSystemComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            biologicalSystemComponentImpl = new BiologicalSystemComponentImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemComponentImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            biologicalSystemComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A component_of relationship type where a biological_system_component is a component_of
         * exactly one {@link BiologicalSystem}.
         *
         * @param biologicalSystem
         * @return
         */
        public final Builder component_Of_M(final BiologicalSystem biologicalSystem) {
            biologicalSystemComponentImpl.addValue(COMPONENT_OF, biologicalSystem.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemComponentImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            biologicalSystemComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            biologicalSystemComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a biological_system_component may be a member_of one
         * or more {@link ClassOfBiologicalSystemComponent}.
         *
         * @param classOfBiologicalSystemComponent
         * @return
         */
        public final Builder member_Of(
                final ClassOfBiologicalSystemComponent classOfBiologicalSystemComponent) {
            biologicalSystemComponentImpl.addValue(MEMBER_OF,
                    classOfBiologicalSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @param kindOfBiologicalObject
         * @return
         */
        public final Builder member_Of_Kind(final KindOfBiologicalObject kindOfBiologicalObject) {
            biologicalSystemComponentImpl.addValue(MEMBER_OF_KIND, kindOfBiologicalObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemComponentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            biologicalSystemComponentImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemComponentImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param biologicalObject
         * @return
         */
        public final Builder temporal_Part_Of(final BiologicalObject biologicalObject) {
            biologicalSystemComponentImpl.addValue(TEMPORAL_PART_OF, biologicalObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public BiologicalSystemComponent build() throws HqdmException {
            if (biologicalSystemComponentImpl.hasValue(AGGREGATED_INTO)
                    && biologicalSystemComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (biologicalSystemComponentImpl.hasValue(BEGINNING)
                    && biologicalSystemComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!biologicalSystemComponentImpl.hasValue(COMPONENT_OF)) {
                throw new HqdmException("Property Not Set: component_of");
            }
            if (biologicalSystemComponentImpl.hasValue(ENDING)
                    && biologicalSystemComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (biologicalSystemComponentImpl.hasValue(MEMBER__OF)
                    && biologicalSystemComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (biologicalSystemComponentImpl.hasValue(MEMBER_OF)
                    && biologicalSystemComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (biologicalSystemComponentImpl.hasValue(MEMBER_OF_KIND)
                    && biologicalSystemComponentImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (biologicalSystemComponentImpl.hasValue(PART__OF)
                    && biologicalSystemComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!biologicalSystemComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (biologicalSystemComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && biologicalSystemComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (biologicalSystemComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && biologicalSystemComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return biologicalSystemComponentImpl;
        }
    }
}
