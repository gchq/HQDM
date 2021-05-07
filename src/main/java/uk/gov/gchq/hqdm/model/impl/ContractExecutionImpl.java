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
import static uk.gov.gchq.hqdm.iri.HQDM.CONTRACT_EXECUTION;
import static uk.gov.gchq.hqdm.iri.HQDM.DETERMINES;
import static uk.gov.gchq.hqdm.iri.HQDM.ENDING;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF_KIND;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.hqdm.iri.HQDM.PART__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.REFERENCES;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Activity;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfContractExecution;
import uk.gov.gchq.hqdm.model.ContractExecution;
import uk.gov.gchq.hqdm.model.ContractProcess;
import uk.gov.gchq.hqdm.model.Event;
import uk.gov.gchq.hqdm.model.Individual;
import uk.gov.gchq.hqdm.model.KindOfActivity;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of ContractExecution.
 */
public class ContractExecutionImpl extends HqdmObject implements ContractExecution {
    /**
     *
     * @param iri
     */
    public ContractExecutionImpl(final IRI iri) {
        super(ContractExecutionImpl.class, iri, CONTRACT_EXECUTION);
    }

    /**
     * Builder for ContractExecutionImpl.
     */
    public static class Builder {
        /** */
        private final ContractExecutionImpl contractExecutionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            contractExecutionImpl = new ContractExecutionImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            contractExecutionImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            contractExecutionImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            contractExecutionImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            contractExecutionImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param activity
         * @return
         */
        public final Builder consists_Of(final Activity activity) {
            contractExecutionImpl.addValue(CONSISTS_OF, activity.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            contractExecutionImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            contractExecutionImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            contractExecutionImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            contractExecutionImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a contract_execution may be a member_of one or more
         * {@link ClassOfContractExecution}.
         *
         * @param classOfContractExecution
         * @return
         */
        public final Builder member_Of(final ClassOfContractExecution classOfContractExecution) {
            contractExecutionImpl.addValue(MEMBER_OF, classOfContractExecution.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            contractExecutionImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            contractExecutionImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A part_of relationship type where a contract_execution is part_of exactly one
         * {@link ContractProcess}.
         *
         * @param contractProcess
         * @return
         */
        public final Builder part_Of_M(final ContractProcess contractProcess) {
            contractExecutionImpl.addValue(PART_OF, contractProcess.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            contractExecutionImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            contractExecutionImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder references(final Thing thing) {
            contractExecutionImpl.addValue(REFERENCES, thing.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            contractExecutionImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            contractExecutionImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ContractExecution build() throws HqdmException {
            if (contractExecutionImpl.hasValue(AGGREGATED_INTO)
                    && contractExecutionImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (contractExecutionImpl.hasValue(BEGINNING)
                    && contractExecutionImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!contractExecutionImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (contractExecutionImpl.hasValue(DETERMINES)
                    && contractExecutionImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (contractExecutionImpl.hasValue(ENDING)
                    && contractExecutionImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (contractExecutionImpl.hasValue(MEMBER__OF)
                    && contractExecutionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (contractExecutionImpl.hasValue(MEMBER_OF)
                    && contractExecutionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!contractExecutionImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (contractExecutionImpl.hasValue(PART__OF)
                    && contractExecutionImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (!contractExecutionImpl.hasValue(PART_OF)) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (contractExecutionImpl.hasValue(PART_OF_)
                    && contractExecutionImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!contractExecutionImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (contractExecutionImpl.hasValue(REFERENCES)
                    && contractExecutionImpl.value(REFERENCES).isEmpty()) {
                throw new HqdmException("Property Not Set: references");
            }
            if (contractExecutionImpl.hasValue(TEMPORAL__PART_OF)
                    && contractExecutionImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (contractExecutionImpl.hasValue(TEMPORAL_PART_OF)
                    && contractExecutionImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return contractExecutionImpl;
        }
    }
}
