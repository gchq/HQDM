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
import static uk.gov.gchq.hqdm.iri.HQDM.ORGANIZATION;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfOrganization;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.KindOfOrganization;
import uk.gov.gchq.hqdm.model.Organization;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Organization.
 */
public class OrganizationImpl extends HqdmObject implements Organization {
    /**
     *
     * @param iri
     */
    public OrganizationImpl(final IRI iri) {
        super(OrganizationImpl.class, iri, ORGANIZATION);
    }

    /**
     * Builder for OrganizationImpl.
     */
    public static class Builder {
        /** */
        private final OrganizationImpl organizationImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            organizationImpl = new OrganizationImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            organizationImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            organizationImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            organizationImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an organization may be a member_of one or more
         * {@link ClassOfOrganization}.
         *
         * @param classOfOrganization
         * @return
         */
        public final Builder member_Of(final ClassOfOrganization classOfOrganization) {
            organizationImpl.addValue(MEMBER_OF, classOfOrganization.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an organization may be a member_of one or more
         * {@link KindOfOrganization}.
         *
         * @param kindOfOrganization
         * @return
         */
        public final Builder member_Of_Kind(final KindOfOrganization kindOfOrganization) {
            organizationImpl.addValue(MEMBER_OF_KIND, kindOfOrganization.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            organizationImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            organizationImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param organization
         * @return
         */
        public final Builder temporal_Part_Of(final Organization organization) {
            organizationImpl.addValue(TEMPORAL_PART_OF, organization.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Organization build() throws HqdmException {
            if (organizationImpl.hasValue(AGGREGATED_INTO)
                    && organizationImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (organizationImpl.hasValue(BEGINNING)
                    && organizationImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (organizationImpl.hasValue(ENDING)
                    && organizationImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (organizationImpl.hasValue(MEMBER__OF)
                    && organizationImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (organizationImpl.hasValue(MEMBER_OF)
                    && organizationImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (organizationImpl.hasValue(MEMBER_OF_KIND)
                    && organizationImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (organizationImpl.hasValue(PART__OF)
                    && organizationImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!organizationImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (organizationImpl.hasValue(TEMPORAL__PART_OF)
                    && organizationImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (organizationImpl.hasValue(TEMPORAL_PART_OF)
                    && organizationImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return organizationImpl;
        }
    }
}
