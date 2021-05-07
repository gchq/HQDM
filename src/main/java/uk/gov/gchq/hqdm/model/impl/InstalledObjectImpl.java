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
import static uk.gov.gchq.hqdm.iri.HQDM.INSTALLED_OBJECT;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfInstalledObject;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.InstalledObject;
import uk.gov.gchq.hqdm.model.OrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of InstalledObject.
 */
public class InstalledObjectImpl extends HqdmObject implements InstalledObject {
    /**
     *
     * @param iri
     */
    public InstalledObjectImpl(final IRI iri) {
        super(InstalledObjectImpl.class, iri, INSTALLED_OBJECT);
    }

    /**
     * Builder for InstalledObjectImpl.
     */
    public static class Builder {
        /** */
        private final InstalledObjectImpl installedObjectImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            installedObjectImpl = new InstalledObjectImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            installedObjectImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            installedObjectImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            installedObjectImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            installedObjectImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            installedObjectImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where an installed_object may be a member_of one or more
         * {@link ClassOfInstalledObject}.
         *
         * @param classOfInstalledObject
         * @return
         */
        public final Builder member_Of(final ClassOfInstalledObject classOfInstalledObject) {
            installedObjectImpl.addValue(MEMBER_OF, classOfInstalledObject.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            installedObjectImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            installedObjectImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            installedObjectImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param ordinaryPhysicalObject
         * @return
         */
        public final Builder temporal_Part_Of(final OrdinaryPhysicalObject ordinaryPhysicalObject) {
            installedObjectImpl.addValue(TEMPORAL_PART_OF, ordinaryPhysicalObject.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public InstalledObject build() throws HqdmException {
            if (installedObjectImpl.hasValue(AGGREGATED_INTO)
                    && installedObjectImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (installedObjectImpl.hasValue(BEGINNING)
                    && installedObjectImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (installedObjectImpl.hasValue(ENDING)
                    && installedObjectImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (installedObjectImpl.hasValue(MEMBER__OF)
                    && installedObjectImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (installedObjectImpl.hasValue(MEMBER_OF)
                    && installedObjectImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (installedObjectImpl.hasValue(PART__OF)
                    && installedObjectImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!installedObjectImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (installedObjectImpl.hasValue(TEMPORAL__PART_OF)
                    && installedObjectImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (installedObjectImpl.hasValue(TEMPORAL_PART_OF)
                    && installedObjectImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return installedObjectImpl;
        }
    }
}
