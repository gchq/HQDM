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
import static uk.gov.gchq.hqdm.iri.HQDM.BIOLOGICAL_SYSTEM;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.NATURAL_ROLE;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.BiologicalSystem;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfBiologicalSystem;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfBiologicalSystem;
import uk.gov.gchq.hqdm.model.OrdinaryBiologicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of BiologicalSystem.
 */
public class BiologicalSystemImpl extends HqdmObject implements BiologicalSystem {
    /**
     *
     * @param iri
     */
    public BiologicalSystemImpl(final IRI iri) {
        super(BiologicalSystemImpl.class, iri, BIOLOGICAL_SYSTEM);
    }

    /**
     * Builder for BiologicalSystemImpl.
     */
    public static class Builder {
        /** */
        private final BiologicalSystemImpl biologicalSystemImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            biologicalSystemImpl = new BiologicalSystemImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            biologicalSystemImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            biologicalSystemImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            biologicalSystemImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a biological_system may be a member_of one or more
         * {@link ClassOfBiologicalSystem}.
         *
         * @param classOfBiologicalSystem
         * @return
         */
        public final Builder member_Of(final ClassOfBiologicalSystem classOfBiologicalSystem) {
            biologicalSystemImpl.addValue(MEMBER_OF, classOfBiologicalSystem.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where a biological_system may be a member_of one or
         * more {@link KindOfBiologicalSystem}.
         *
         * @param kindOfBiologicalSystem
         * @return
         */
        public final Builder member_Of_Kind(final KindOfBiologicalSystem kindOfBiologicalSystem) {
            biologicalSystemImpl.addValue(MEMBER_OF_KIND, kindOfBiologicalSystem.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a biological_system has a natural {@link Role} that
         * it plays.
         *
         * @param role
         * @return
         */
        public final Builder natural_Role_M(final Role role) {
            biologicalSystemImpl.addValue(NATURAL_ROLE, role.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            biologicalSystemImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            biologicalSystemImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param ordinaryBiologicalObject
         * @return
         */
        public final Builder temporal_Part_Of(
                final OrdinaryBiologicalObject ordinaryBiologicalObject) {
            biologicalSystemImpl.addValue(TEMPORAL_PART_OF, ordinaryBiologicalObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public BiologicalSystem build() throws HqdmException {
            if (biologicalSystemImpl.hasValue(AGGREGATED_INTO)
                    && biologicalSystemImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (biologicalSystemImpl.hasValue(BEGINNING)
                    && biologicalSystemImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (biologicalSystemImpl.hasValue(ENDING)
                    && biologicalSystemImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (biologicalSystemImpl.hasValue(MEMBER__OF)
                    && biologicalSystemImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (biologicalSystemImpl.hasValue(MEMBER_OF)
                    && biologicalSystemImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (biologicalSystemImpl.hasValue(MEMBER_OF_KIND)
                    && biologicalSystemImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (!biologicalSystemImpl.hasValue(NATURAL_ROLE)) {
                throw new HqdmException("Property Not Set: natural_role");
            }
            if (biologicalSystemImpl.hasValue(PART__OF)
                    && biologicalSystemImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!biologicalSystemImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (biologicalSystemImpl.hasValue(TEMPORAL__PART_OF)
                    && biologicalSystemImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (biologicalSystemImpl.hasValue(TEMPORAL_PART_OF)
                    && biologicalSystemImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return biologicalSystemImpl;
        }
    }
}
