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
import static uk.gov.gchq.hqdm.iri.HQDM.INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfInstalledFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.FunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.InstalledFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of InstalledFunctionalSystemComponent.
 */
public class InstalledFunctionalSystemComponentImpl extends HqdmObject
        implements InstalledFunctionalSystemComponent {
    /**
     * Constructs a new InstalledFunctionalSystemComponent.
     *
     * @param iri IRI of the InstalledFunctionalSystemComponent.
     */
    public InstalledFunctionalSystemComponentImpl(final IRI iri) {
        super(InstalledFunctionalSystemComponentImpl.class, iri,
                INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT);
    }

    /**
     * Builder for constructing instances of InstalledFunctionalSystemComponent.
     */
    public static class Builder {

        private final InstalledFunctionalSystemComponentImpl installedFunctionalSystemComponentImpl;

        /**
         * Constructs a Builder for a new InstalledFunctionalSystemComponent.
         *
         * @param iri IRI of the InstalledFunctionalSystemComponent.
         */
        public Builder(final IRI iri) {
            installedFunctionalSystemComponentImpl =
                    new InstalledFunctionalSystemComponentImpl(iri);
        }

        /**
         * A relationship type where a {@link SpatioTemporalExtent} may be aggregated into one or
         * more others.
         * <p>
         * Note: This has the same meaning as, but different representation to, the
         * {@link uk.gov.gchq.hqdm.model.Aggregation} entity type.
         * </p>
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            installedFunctionalSystemComponentImpl.addValue(AGGREGATED_INTO,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its beginning.
         *
         * @param event The Event.
         * @return This builder.
         */
        public final Builder beginning(final Event event) {
            installedFunctionalSystemComponentImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link SpatioTemporalExtent} may consist of one or more
         * others.
         *
         * <p>
         * Note: This is the inverse of {@link uk.gov.gchq.hqdm.iri.HQDM#PART__OF}.
         * </p>
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            installedFunctionalSystemComponentImpl.addValue(CONSISTS__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its ending.
         *
         * @param event The Event.
         * @return This builder.
         */
        public final Builder ending(final Event event) {
            installedFunctionalSystemComponentImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link uk.gov.gchq.hqdm.model.Thing} may be a member of one
         * or more {@link Class}.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            installedFunctionalSystemComponentImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where an
         * {@link InstalledFunctionalSystemComponent} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} one or more
         * {@link ClassOfInstalledFunctionalSystemComponent}.
         *
         * @param classOfInstalledFunctionalSystemComponent
         *        classOfInstalledFunctionalSystemComponent.
         * @return This builder.
         */
        @SuppressWarnings("LineLength")
        public final Builder member_Of(
                final ClassOfInstalledFunctionalSystemComponent classOfInstalledFunctionalSystemComponent) {
            installedFunctionalSystemComponentImpl.addValue(MEMBER_OF,
                    classOfInstalledFunctionalSystemComponent.getIri());
            return this;
        }

        /**
         * An {@link uk.gov.gchq.hqdm.iri.HQDM#AGGREGATED_INTO} relationship type where a
         * {@link SpatioTemporalExtent} may be part of another and the whole has emergent properties
         * and is more than just the sum of its parts.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            installedFunctionalSystemComponentImpl.addValue(PART__OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} may be {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} one or more
         * {@link PossibleWorld}.
         *
         * <p>
         * Note: The relationship is optional because a {@link PossibleWorld} is not
         * {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} any other {@link SpatioTemporalExtent}.
         * </p>
         *
         * @param possibleWorld The PossibleWorld.
         * @return This builder.
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            installedFunctionalSystemComponentImpl.addValue(PART_OF_POSSIBLE_WORLD,
                    possibleWorld.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#PART_OF} relationship type where a
         * {@link SpatioTemporalExtent} may be a temporal part of one or more other
         * {@link SpatioTemporalExtent}.
         *
         * @param spatioTemporalExtent The SpatioTemporalExtent.
         * @return This builder.
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            installedFunctionalSystemComponentImpl.addValue(TEMPORAL__PART_OF,
                    spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} relationship type where a
         * {@link uk.gov.gchq.hqdm.model.StateOfFunctionalSystemComponent} may be a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#TEMPORAL_PART_OF} one or more
         * {@link FunctionalSystemComponent}.
         *
         * @param functionalSystemComponent The FunctionalSystemComponent.
         * @return This builder.
         */
        public final Builder temporal_Part_Of(
                final FunctionalSystemComponent functionalSystemComponent) {
            installedFunctionalSystemComponentImpl.addValue(TEMPORAL_PART_OF,
                    functionalSystemComponent.getIri());
            return this;
        }

        /**
         * Returns an instance of InstalledFunctionalSystemComponent created from the properties set
         * on this builder.
         *
         * @return The built InstalledFunctionalSystemComponent.
         * @throws HqdmException If the InstalledFunctionalSystemComponent is missing any mandatory
         *         properties.
         */
        public InstalledFunctionalSystemComponent build() throws HqdmException {
            if (installedFunctionalSystemComponentImpl.hasValue(AGGREGATED_INTO)
                    && installedFunctionalSystemComponentImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (installedFunctionalSystemComponentImpl.hasValue(BEGINNING)
                    && installedFunctionalSystemComponentImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (installedFunctionalSystemComponentImpl.hasValue(ENDING)
                    && installedFunctionalSystemComponentImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (installedFunctionalSystemComponentImpl.hasValue(MEMBER__OF)
                    && installedFunctionalSystemComponentImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (installedFunctionalSystemComponentImpl.hasValue(MEMBER_OF)
                    && installedFunctionalSystemComponentImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (installedFunctionalSystemComponentImpl.hasValue(PART__OF)
                    && installedFunctionalSystemComponentImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!installedFunctionalSystemComponentImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (installedFunctionalSystemComponentImpl.hasValue(TEMPORAL__PART_OF)
                    && installedFunctionalSystemComponentImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (installedFunctionalSystemComponentImpl.hasValue(TEMPORAL_PART_OF)
                    && installedFunctionalSystemComponentImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return installedFunctionalSystemComponentImpl;
        }
    }
}
