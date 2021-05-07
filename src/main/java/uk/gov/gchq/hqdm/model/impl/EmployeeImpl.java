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
import static uk.gov.gchq.hqdm.iri.HQDM.EMPLOYEE;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PARTICIPANT_IN;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfPerson;
import uk.gov.gchq.hqdm.model.Employee;
import uk.gov.gchq.hqdm.model.Employment;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Person;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Employee.
 */
public class EmployeeImpl extends HqdmObject implements Employee {
    /**
     *
     * @param iri
     */
    public EmployeeImpl(final IRI iri) {
        super(EmployeeImpl.class, iri, EMPLOYEE);
    }

    /**
     * Builder for EmployeeImpl.
     */
    public static class Builder {
        /** */
        private final EmployeeImpl employeeImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            employeeImpl = new EmployeeImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            employeeImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            employeeImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            employeeImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            employeeImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            employeeImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfStateOfPerson
         * @return
         */
        public final Builder member_Of(final ClassOfStateOfPerson classOfStateOfPerson) {
            employeeImpl.addValue(MEMBER_OF, classOfStateOfPerson.getIri());
            return this;
        }

        /**
         *
         * @param role
         * @return
         */
        public final Builder member_Of_Kind_M(final Role role) {
            employeeImpl.addValue(MEMBER_OF_KIND, role.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            employeeImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            employeeImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         * A participant_in relationship type where an employee is a participant_in exactly one
         * {@link Employment}.
         *
         * @param employment
         * @return
         */
        public final Builder participant_In_M(final Employment employment) {
            employeeImpl.addValue(PARTICIPANT_IN, employment.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            employeeImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param person
         * @return
         */
        public final Builder temporal_Part_Of(final Person person) {
            employeeImpl.addValue(TEMPORAL_PART_OF, person.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Employee build() throws HqdmException {
            if (employeeImpl.hasValue(AGGREGATED_INTO)
                    && employeeImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (employeeImpl.hasValue(BEGINNING)
                    && employeeImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (employeeImpl.hasValue(ENDING)
                    && employeeImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (employeeImpl.hasValue(MEMBER__OF)
                    && employeeImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (employeeImpl.hasValue(MEMBER_OF)
                    && employeeImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!employeeImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (employeeImpl.hasValue(PART__OF)
                    && employeeImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!employeeImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (!employeeImpl.hasValue(PARTICIPANT_IN)) {
                throw new HqdmException("Property Not Set: participant_in");
            }
            if (employeeImpl.hasValue(TEMPORAL__PART_OF)
                    && employeeImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (employeeImpl.hasValue(TEMPORAL_PART_OF)
                    && employeeImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return employeeImpl;
        }
    }
}
