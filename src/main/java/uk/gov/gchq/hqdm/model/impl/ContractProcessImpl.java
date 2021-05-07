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
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_PARTICIPANT;
import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.CONTRACT_PROCESS;
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
import uk.gov.gchq.hqdm.model.AgreeContract;
import uk.gov.gchq.hqdm.model.AgreementExecution;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfContractProcess;
import uk.gov.gchq.hqdm.model.ContractExecution;
import uk.gov.gchq.hqdm.model.ContractProcess;
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
 * An implementation of ContractProcess.
 */
public class ContractProcessImpl extends HqdmObject implements ContractProcess {
    /**
     *
     * @param iri
     */
    public ContractProcessImpl(final IRI iri) {
        super(ContractProcessImpl.class, iri, CONTRACT_PROCESS);
    }

    /**
     * Builder for ContractProcessImpl.
     */
    public static class Builder {
        /** */
        private final ContractProcessImpl contractProcessImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            contractProcessImpl = new ContractProcessImpl(iri);
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder aggregated_Into(final SpatioTemporalExtent spatioTemporalExtent) {
            contractProcessImpl.addValue(AGGREGATED_INTO, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder beginning(final Event event) {
            contractProcessImpl.addValue(BEGINNING, event.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder causes_M(final Event event) {
            contractProcessImpl.addValue(CAUSES, event.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            contractProcessImpl.addValue(CONSISTS__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         * A consists_of relationship type where a contract_process consists_of exactly one
         * {@link AgreeContract}.
         *
         * @param agreeContract
         * @return
         */
        public final Builder consists_Of(final AgreeContract agreeContract) {
            contractProcessImpl.addValue(CONSISTS_OF, agreeContract.getIri());
            return this;
        }

        /**
         * A consists_of_ relationship type where a contract_process consists_of exactly one
         * {@link ContractExecution}.
         *
         * @param contractExecution
         * @return
         */
        public final Builder consists_Of_(final ContractExecution contractExecution) {
            contractProcessImpl.addValue(CONSISTS_OF_, contractExecution.getIri());
            return this;
        }

        /**
         *
         * @param participant
         * @return
         */
        public final Builder consists_Of_Participant(final Participant participant) {
            contractProcessImpl.addValue(CONSISTS_OF_PARTICIPANT, participant.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder determines(final Thing thing) {
            contractProcessImpl.addValue(DETERMINES, thing.getIri());
            return this;
        }

        /**
         *
         * @param event
         * @return
         */
        public final Builder ending(final Event event) {
            contractProcessImpl.addValue(ENDING, event.getIri());
            return this;
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            contractProcessImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A member_of relationship type where a contract process may be a member_of one or more
         * {@link ClassOfContractProcess}.
         *
         * @param classOfContractProcess
         * @return
         */
        public final Builder member_Of(final ClassOfContractProcess classOfContractProcess) {
            contractProcessImpl.addValue(MEMBER_OF, classOfContractProcess.getIri());
            return this;
        }

        /**
         *
         * @param kindOfActivity
         * @return
         */
        public final Builder member_Of_Kind_M(final KindOfActivity kindOfActivity) {
            contractProcessImpl.addValue(MEMBER_OF_KIND, kindOfActivity.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
            contractProcessImpl.addValue(PART__OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param reachingAgreement
         * @return
         */
        public final Builder part_Of(final ReachingAgreement reachingAgreement) {
            contractProcessImpl.addValue(PART_OF, reachingAgreement.getIri());
            return this;
        }

        /**
         *
         * @param agreementExecution
         * @return
         */
        public final Builder part_Of_(final AgreementExecution agreementExecution) {
            contractProcessImpl.addValue(PART_OF_, agreementExecution.getIri());
            return this;
        }

        /**
         *
         * @param possibleWorld
         * @return
         */
        public final Builder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
            contractProcessImpl.addValue(PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
            return this;
        }

        /**
         *
         * @param thing
         * @return
         */
        public final Builder references(final Thing thing) {
            contractProcessImpl.addValue(REFERENCES, thing.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder temporal__Part_Of(final SpatioTemporalExtent spatioTemporalExtent) {
            contractProcessImpl.addValue(TEMPORAL__PART_OF, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param individual
         * @return
         */
        public final Builder temporal_Part_Of(final Individual individual) {
            contractProcessImpl.addValue(TEMPORAL_PART_OF, individual.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public ContractProcess build() throws HqdmException {
            if (contractProcessImpl.hasValue(AGGREGATED_INTO)
                    && contractProcessImpl.value(AGGREGATED_INTO).isEmpty()) {
                throw new HqdmException("Property Not Set: aggregated_into");
            }
            if (contractProcessImpl.hasValue(BEGINNING)
                    && contractProcessImpl.value(BEGINNING).isEmpty()) {
                throw new HqdmException("Property Not Set: beginning");
            }
            if (!contractProcessImpl.hasValue(CAUSES)) {
                throw new HqdmException("Property Not Set: causes");
            }
            if (contractProcessImpl.hasValue(DETERMINES)
                    && contractProcessImpl.value(DETERMINES).isEmpty()) {
                throw new HqdmException("Property Not Set: determines");
            }
            if (contractProcessImpl.hasValue(ENDING)
                    && contractProcessImpl.value(ENDING).isEmpty()) {
                throw new HqdmException("Property Not Set: ending");
            }
            if (contractProcessImpl.hasValue(MEMBER__OF)
                    && contractProcessImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (contractProcessImpl.hasValue(MEMBER_OF)
                    && contractProcessImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!contractProcessImpl.hasValue(MEMBER_OF_KIND)) {
                throw new HqdmException("Property Not Set: member_of_kind");
            }
            if (contractProcessImpl.hasValue(PART__OF)
                    && contractProcessImpl.value(PART__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part__of");
            }
            if (contractProcessImpl.hasValue(PART_OF)
                    && contractProcessImpl.value(PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of");
            }
            if (contractProcessImpl.hasValue(PART_OF_)
                    && contractProcessImpl.value(PART_OF_).isEmpty()) {
                throw new HqdmException("Property Not Set: part_of_");
            }
            if (!contractProcessImpl.hasValue(PART_OF_POSSIBLE_WORLD)) {
                throw new HqdmException("Property Not Set: part_of_possible_world");
            }
            if (contractProcessImpl.hasValue(REFERENCES)
                    && contractProcessImpl.value(REFERENCES).isEmpty()) {
                throw new HqdmException("Property Not Set: references");
            }
            if (contractProcessImpl.hasValue(TEMPORAL__PART_OF)
                    && contractProcessImpl.value(TEMPORAL__PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal__part_of");
            }
            if (contractProcessImpl.hasValue(TEMPORAL_PART_OF)
                    && contractProcessImpl.value(TEMPORAL_PART_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: temporal_part_of");
            }
            return contractProcessImpl;
        }
    }
}
