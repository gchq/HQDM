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
import static uk.gov.gchq.hqdm.iri.HQDM.FUNCTIONAL_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.INTENDED_ROLE;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfFunctionalObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.FunctionalObject;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfFunctionalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of FunctionalObject.
 */
public class FunctionalObjectImpl extends HqdmObject implements FunctionalObject {
    /**
     *
     * @param iri
     */
    public FunctionalObjectImpl(final IRI iri) {
        super(FunctionalObjectImpl.class, iri, FUNCTIONAL_OBJECT);
    }

    /**
     * Builder for FunctionalObjectImpl.
     */
    public static class Builder {
        /** */
        private final FunctionalObjectImpl functionalObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            functionalObjectImpl = new FunctionalObjectImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            functionalObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            functionalObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a functional_object has one or more intended {@link Role}.
         *
         * @param role
         * @return
         */
        public final Builder intended_Role_M(final Role role) {
            functionalObjectImpl.addValue(INTENDED_ROLE, role.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            functionalObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a functional_object may be a member_of one or more
         * {@link ClassOfFunctionalObject}.
         *
         * @param classOfFunctionalObject
         * @return
         */
        public final Builder member_Of(final ClassOfFunctionalObject classOfFunctionalObject) {
            functionalObjectImpl.addValue(MEMBER_OF, classOfFunctionalObject.getIri());
            return this;
        }

        /**
         * A member_of_kind relationship type where a functional_object may be a member_of one or
         * more {@link KindOfFunctionalObject}.
         *
         * @param kindOfFunctionalObject
         * @return
         */
        public final Builder member_Of_Kind(final KindOfFunctionalObject kindOfFunctionalObject) {
            functionalObjectImpl.addValue(MEMBER_OF_KIND, kindOfFunctionalObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            functionalObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            functionalObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            functionalObjectImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public FunctionalObject build() throws HqdmException {
            if (functionalObjectImpl.hasValue(AGGREGATED_INTO)
                    && functionalObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (functionalObjectImpl.hasValue(BEGINNING)
                    && functionalObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (functionalObjectImpl.hasValue(ENDING)
                    && functionalObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (!functionalObjectImpl.hasValue(INTENDED_ROLE)) {
                throw new HqdmException("Property Not Set: intended_role");
            }
            if (functionalObjectImpl.hasValue(MEMBER__OF)
                    && functionalObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (functionalObjectImpl.hasValue(MEMBER_OF)
                    && functionalObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (functionalObjectImpl.hasValue(MEMBER_OF_KIND)
                    && functionalObjectImpl.value(MEMBER_OF_KIND).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (functionalObjectImpl.hasValue(PART__OF)
                    && functionalObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!functionalObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (functionalObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && functionalObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (functionalObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && functionalObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return functionalObjectImpl;
        }
    }
}
