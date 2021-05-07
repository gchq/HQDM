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
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ORDINARY_PHYSICAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfOrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfOrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.OrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of OrdinaryPhysicalObject.
 */
public class OrdinaryPhysicalObjectImpl extends HqdmObject implements OrdinaryPhysicalObject {
    /**
     *
     * @param iri
     */
    public OrdinaryPhysicalObjectImpl(final IRI iri) {
        super(OrdinaryPhysicalObjectImpl.class, iri, ORDINARY_PHYSICAL_OBJECT);
    }

    /**
     * Builder for OrdinaryPhysicalObjectImpl.
     */
    public static class Builder {
        /** */
        private final OrdinaryPhysicalObjectImpl ordinaryPhysicalObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            ordinaryPhysicalObjectImpl = new OrdinaryPhysicalObjectImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryPhysicalObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            ordinaryPhysicalObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryPhysicalObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            ordinaryPhysicalObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            ordinaryPhysicalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an ordinary_physical_object may be a member_of one or
         * more {@link ClassOfOrdinaryPhysicalObject}.
         *
         * @param classOfOrdinaryPhysicalObject
         * @return
         */
        public final Builder member_Of(
                final ClassOfOrdinaryPhysicalObject classOfOrdinaryPhysicalObject) {
            ordinaryPhysicalObjectImpl.addValue(MEMBER_OF, classOfOrdinaryPhysicalObject.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where an ordinary_physical_object may be a member_of
         * one or more {@link KindOfOrdinaryPhysicalObject}.
         *
         * @param kindOfOrdinaryPhysicalObject
         * @return
         */
        public final Builder member_Of_Kind(
                final KindOfOrdinaryPhysicalObject kindOfOrdinaryPhysicalObject) {
            ordinaryPhysicalObjectImpl.addValue(MEMBER_OF_KIND,
                    kindOfOrdinaryPhysicalObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryPhysicalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            ordinaryPhysicalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            ordinaryPhysicalObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            ordinaryPhysicalObjectImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public OrdinaryPhysicalObject build() throws HqdmException {
            if (ordinaryPhysicalObjectImpl.hasValue(AGGREGATED_INTO)
                    && ordinaryPhysicalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(BEGINNING)
                    && ordinaryPhysicalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(ENDING)
                    && ordinaryPhysicalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(MEMBER__OF)
                    && ordinaryPhysicalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(MEMBER_OF)
                    && ordinaryPhysicalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(MEMBER_OF_KIND)
                    && ordinaryPhysicalObjectImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(PART__OF)
                    && ordinaryPhysicalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!ordinaryPhysicalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && ordinaryPhysicalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (ordinaryPhysicalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && ordinaryPhysicalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return ordinaryPhysicalObjectImpl;
        }
    }
}
