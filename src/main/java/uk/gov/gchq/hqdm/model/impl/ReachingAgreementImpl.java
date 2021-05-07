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
import static uk.gov.gchq.hqdm.iri.HQDM.CAUSES;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.DETERMINES;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REACHING_AGREEMENT;
import static uk.gov.gchq.hqdm.iri.HQDM.REFERENCES;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Activity;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.AgreementProcess;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfReachingAgreement;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.ReachingAgreement;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ReachingAgreement.
 */
public class ReachingAgreementImpl extends HqdmObject implements ReachingAgreement {
    /**
     *
     * @param iri
     */
    public ReachingAgreementImpl(final IRI iri) {
        super(ReachingAgreementImpl.class, iri, REACHING_AGREEMENT);
    }

    /**
     * Builder for ReachingAgreementImpl.
     */
    public static class Builder {
        /** */
        private final ReachingAgreementImpl reachingAgreementImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            reachingAgreementImpl = new ReachingAgreementImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            reachingAgreementImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            reachingAgreementImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            reachingAgreementImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            reachingAgreementImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param activity
         * @return
         */
        public final Builder consists_Of(final Activity activity) {
            reachingAgreementImpl.addValue(CONSISTS_OF, activity.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            reachingAgreementImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            reachingAgreementImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            reachingAgreementImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            reachingAgreementImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a reaching_agreement may be a member_of one or more
         * {@link ClassOfReachingAgreement}.
         *
         * @param classOfReachingAgreement
         * @return
         */
        public final Builder member_Of(final ClassOfReachingAgreement classOfReachingAgreement) {
            reachingAgreementImpl.addValue(MEMBER_OF, classOfReachingAgreement.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            reachingAgreementImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            reachingAgreementImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a reaching_agreement is a part_of exactly one
         * {@link AgreementProcess}.
         *
         * @param agreementProcess
         * @return
         */
        public final Builder part_Of_M(final AgreementProcess agreementProcess) {
            reachingAgreementImpl.addValue(PART_OF, agreementProcess.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            reachingAgreementImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            reachingAgreementImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder references(final Thing thing) {
            reachingAgreementImpl.addValue(REFERENCES, thing.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            reachingAgreementImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            reachingAgreementImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ReachingAgreement build() throws HqdmException {
            if (reachingAgreementImpl.hasValue(AGGREGATED_INTO)
                    && reachingAgreementImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (reachingAgreementImpl.hasValue(BEGINNING)
                    && reachingAgreementImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!reachingAgreementImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (reachingAgreementImpl.hasValue(DETERMINES)
                    && reachingAgreementImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (reachingAgreementImpl.hasValue(ENDING)
                    && reachingAgreementImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (reachingAgreementImpl.hasValue(MEMBER__OF)
                    && reachingAgreementImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (reachingAgreementImpl.hasValue(MEMBER_OF)
                    && reachingAgreementImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!reachingAgreementImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (reachingAgreementImpl.hasValue(PART__OF)
                    && reachingAgreementImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!reachingAgreementImpl.hasValue(PART_OF)) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (reachingAgreementImpl.hasValue(PART_OF_)
                    && reachingAgreementImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!reachingAgreementImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (reachingAgreementImpl.hasValue(REFERENCES)
                    && reachingAgreementImpl.value(REFERENCES).isEmpty()) {
                throw new HqdmException("Property Not Set: references");
            }
            if (reachingAgreementImpl.hasValue(TEMPORAL__PART_OF)
                    && reachingAgreementImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (reachingAgreementImpl.hasValue(TEMPORAL_PART_OF)
                    && reachingAgreementImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return reachingAgreementImpl;
        }
    }
}
