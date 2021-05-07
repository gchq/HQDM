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
import static uk.gov.gchq.hqdm.iri.HQDM.POSITION;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfPosition;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfPosition;
import uk.gov.gchq.hqdm.model.Organization;
import uk.gov.gchq.hqdm.model.OrganizationComponent;
import uk.gov.gchq.hqdm.model.Position;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Position.
 */
public class PositionImpl extends HqdmObject implements Position {
    /**
     *
     * @param iri
     */
    public PositionImpl(final IRI iri) {
        super(PositionImpl.class, iri, POSITION);
    }

    /**
     * Builder for PositionImpl.
     */
    public static class Builder {
        /** */
        private final PositionImpl positionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            positionImpl = new PositionImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            positionImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            positionImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param organization
         * @return
         */
        public final Builder component_Of_M(final Organization organization) {
            positionImpl.addValue(COMPONENT_OF, organization.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            positionImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            positionImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            positionImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a position may be a member_of one or more
         * {@link ClassOfPosition}.
         *
         * @param classOfPosition
         * @return
         */
        public final Builder member_Of(final ClassOfPosition classOfPosition) {
            positionImpl.addValue(MEMBER_OF, classOfPosition.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where a position may be a member_of one or more
         * {@link KindOfPosition}.
         *
         * @param kindOfPosition
         * @return
         */
        public final Builder member_Of_Kind(final KindOfPosition kindOfPosition) {
            positionImpl.addValue(MEMBER_OF_KIND, kindOfPosition.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            positionImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            positionImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            positionImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param organizationComponent
         * @return
         */
        public final Builder temporal_Part_Of(final OrganizationComponent organizationComponent) {
            positionImpl.addValue(TEMPORAL_PART_OF, organizationComponent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Position build() throws HqdmException {
            if (positionImpl.hasValue(AGGREGATED_INTO)
                    && positionImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (positionImpl.hasValue(BEGINNING)
                    && positionImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!positionImpl.hasValue(COMPONENT_OF)) {
                throw new HqdmException("Property Not Set: component_of");
            }
            if (positionImpl.hasValue(ENDING)
                    && positionImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (positionImpl.hasValue(MEMBER__OF)
                    && positionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (positionImpl.hasValue(MEMBER_OF)
                    && positionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (positionImpl.hasValue(MEMBER_OF_KIND)
                    && positionImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (positionImpl.hasValue(PART__OF)
                    && positionImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!positionImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (positionImpl.hasValue(TEMPORAL__PART_OF)
                    && positionImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (positionImpl.hasValue(TEMPORAL_PART_OF)
                    && positionImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return positionImpl;
        }
    }
}
