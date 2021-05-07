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
import static uk.gov.gchq.hqdm.iri.HQDM.ORGANIZATION_COMPONENT;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfOrganizationComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfOrganizationComponent;
import uk.gov.gchq.hqdm.model.Organization;
import uk.gov.gchq.hqdm.model.OrganizationComponent;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of OrganizationComponent.
 */
public class OrganizationComponentImpl extends HqdmObject implements OrganizationComponent {
    /**
     *
     * @param iri
     */
    public OrganizationComponentImpl(final IRI iri) {
        super(OrganizationComponentImpl.class, iri, ORGANIZATION_COMPONENT);
    }

    /**
     * Builder for OrganizationComponentImpl.
     */
    public static class Builder {
        /** */
        private final OrganizationComponentImpl organizationComponentImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            organizationComponentImpl = new OrganizationComponentImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationComponentImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            organizationComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A component_of relationship type where an organization_component is a replaceable
         * component of exactly one {@link Organization}.
         *
         * @param organization
         * @return
         */
        public final Builder component_Of_M(final Organization organization) {
            organizationComponentImpl.addValue(COMPONENT_OF, organization.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationComponentImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            organizationComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            organizationComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of_relationship type where an organization_component may be a member_of one or
         * more {@link ClassOfOrganizationComponent}.
         *
         * @param classOfOrganizationComponent
         * @return
         */
        public final Builder member_Of(
                final ClassOfOrganizationComponent classOfOrganizationComponent) {
            organizationComponentImpl.addValue(MEMBER_OF, classOfOrganizationComponent.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where an organization_component may be a member_of one
         * or more {@link KindOfOrganizationComponent}.
         *
         * @param kindOfOrganizationComponent
         * @return
         */
        public final Builder member_Of_Kind(
                final KindOfOrganizationComponent kindOfOrganizationComponent) {
            organizationComponentImpl.addValue(MEMBER_OF_KIND,
                    kindOfOrganizationComponent.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationComponentImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            organizationComponentImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationComponentImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param organizationComponent
         * @return
         */
        public final Builder temporal_Part_Of(final OrganizationComponent organizationComponent) {
            organizationComponentImpl.addValue(TEMPORAL_PART_OF, organizationComponent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public OrganizationComponent build() throws HqdmException {
            if (organizationComponentImpl.hasValue(AGGREGATED_INTO)
                    && organizationComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (organizationComponentImpl.hasValue(BEGINNING)
                    && organizationComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!organizationComponentImpl.hasValue(COMPONENT_OF)) {
                throw new HqdmException("Property Not Set: component_of");
            }
            if (organizationComponentImpl.hasValue(ENDING)
                    && organizationComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (organizationComponentImpl.hasValue(MEMBER__OF)
                    && organizationComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (organizationComponentImpl.hasValue(MEMBER_OF)
                    && organizationComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (organizationComponentImpl.hasValue(MEMBER_OF_KIND)
                    && organizationComponentImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (organizationComponentImpl.hasValue(PART__OF)
                    && organizationComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!organizationComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (organizationComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && organizationComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (organizationComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && organizationComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return organizationComponentImpl;
        }
    }
}
