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
import static uk.gov.gchq.hqdm.iri.HQDM.IN_PLACE_BIOLOGICAL_COMPONENT;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.BiologicalSystemComponent;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfInPlaceBiologicalComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.InPlaceBiologicalComponent;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of InPlaceBiologicalComponent.
 */
public class InPlaceBiologicalComponentImpl extends HqdmObject
        implements InPlaceBiologicalComponent {
    /**
     *
     * @param iri
     */
    public InPlaceBiologicalComponentImpl(final IRI iri) {
        super(InPlaceBiologicalComponentImpl.class, iri, IN_PLACE_BIOLOGICAL_COMPONENT);
    }

    /**
     * Builder for InPlaceBiologicalComponentImpl.
     */
    public static class Builder {
        /** */
        private final InPlaceBiologicalComponentImpl inPlaceBiologicalComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            inPlaceBiologicalComponentImpl = new InPlaceBiologicalComponentImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            inPlaceBiologicalComponentImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            inPlaceBiologicalComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            inPlaceBiologicalComponentImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            inPlaceBiologicalComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            inPlaceBiologicalComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an in_place_biological_component may be a member_of
         * one or more {@link ClassOfInPlaceBiologicalComponent}.
         *
         * @param classOfInPlaceBiologicalComponent
         * @return
         */
        public final Builder member_Of(
                final ClassOfInPlaceBiologicalComponent classOfInPlaceBiologicalComponent) {
            inPlaceBiologicalComponentImpl.addValue(MEMBER_OF,
                    classOfInPlaceBiologicalComponent.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            inPlaceBiologicalComponentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            inPlaceBiologicalComponentImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            inPlaceBiologicalComponentImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param biologicalSystemComponent
         * @return
         */
        public final Builder temporal_Part_Of(
                final BiologicalSystemComponent biologicalSystemComponent) {
            inPlaceBiologicalComponentImpl.addValue(TEMPORAL_PART_OF,
                    biologicalSystemComponent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public InPlaceBiologicalComponent build() throws HqdmException {
            if (inPlaceBiologicalComponentImpl.hasValue(AGGREGATED_INTO)
                    && inPlaceBiologicalComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (inPlaceBiologicalComponentImpl.hasValue(BEGINNING)
                    && inPlaceBiologicalComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (inPlaceBiologicalComponentImpl.hasValue(ENDING)
                    && inPlaceBiologicalComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (inPlaceBiologicalComponentImpl.hasValue(MEMBER__OF)
                    && inPlaceBiologicalComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (inPlaceBiologicalComponentImpl.hasValue(MEMBER_OF)
                    && inPlaceBiologicalComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (inPlaceBiologicalComponentImpl.hasValue(PART__OF)
                    && inPlaceBiologicalComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!inPlaceBiologicalComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (inPlaceBiologicalComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && inPlaceBiologicalComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (inPlaceBiologicalComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && inPlaceBiologicalComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return inPlaceBiologicalComponentImpl;
        }
    }
}
