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

import static uk.gov.gchq.hqdm.iri.HQDM.CONSISTS_OF_IN_MEMBERS;
import static uk.gov.gchq.hqdm.iri.HQDM.IDENTIFICATION_OF_PHYSICAL_QUANTITY;
import static uk.gov.gchq.hqdm.iri.HQDM.REPRESENTED;
import static uk.gov.gchq.hqdm.iri.HQDM.USES;
import static uk.gov.gchq.hqdm.iri.HQDM.VALUE_;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.IdentificationOfPhysicalQuantity;
import uk.gov.gchq.hqdm.model.PhysicalQuantity;
import uk.gov.gchq.hqdm.model.RecognizingLanguageCommunity;
import uk.gov.gchq.hqdm.model.Scale;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of IdentificationOfPhysicalQuantity.
 */
public class IdentificationOfPhysicalQuantityImpl extends HqdmObject
        implements IdentificationOfPhysicalQuantity {
    /**
     *
     * @param iri
     */
    public IdentificationOfPhysicalQuantityImpl(final IRI iri) {
        super(IdentificationOfPhysicalQuantityImpl.class, iri, IDENTIFICATION_OF_PHYSICAL_QUANTITY);
    }

    /**
     * Builder for IdentificationOfPhysicalQuantityImpl.
     */
    public static class Builder {
        /** */
        private final IdentificationOfPhysicalQuantityImpl identificationOfPhysicalQuantityImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            identificationOfPhysicalQuantityImpl = new IdentificationOfPhysicalQuantityImpl(iri);
        }

        /**
         * A relationship type where an identification_of_physical_quantity consists of exactly one
         * REAL as its value.
         *
         * @param value
         * @return
         */
        public final Builder value__M(final double value) {
            identificationOfPhysicalQuantityImpl.addRealValue(VALUE_, value);
            return this;
        }

        /**
         *
         * @param recognizingLanguageCommunity
         * @return
         */
        public final Builder consists_Of_In_Members_M(
                final RecognizingLanguageCommunity recognizingLanguageCommunity) {
            identificationOfPhysicalQuantityImpl.addValue(CONSISTS_OF_IN_MEMBERS,
                    recognizingLanguageCommunity.getIri());
            return this;
        }

        /**
         * A relationship type where a member_of an identification_of_physical_quantity represents
         * exactly one {@link PhysicalQuantity}.
         *
         * @param physicalQuantity
         * @return
         */
        public final Builder represented_M(final PhysicalQuantity physicalQuantity) {
            identificationOfPhysicalQuantityImpl.addValue(REPRESENTED, physicalQuantity.getIri());
            return this;
        }

        /**
         * A relationship type where an identification_of_physical_quantity uses exactly one
         * {@link Scale}.
         *
         * @param scale
         * @return
         */
        public final Builder uses_M(final Scale scale) {
            identificationOfPhysicalQuantityImpl.addValue(USES, scale.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public IdentificationOfPhysicalQuantity build() throws HqdmException {
            if (!identificationOfPhysicalQuantityImpl.hasValue(VALUE_)) {
                throw new HqdmException("Property Not Set: value_");
            }
            if (!identificationOfPhysicalQuantityImpl.hasValue(CONSISTS_OF_IN_MEMBERS)) {
                throw new HqdmException("Property Not Set: consists_of_in_members");
            }
            if (!identificationOfPhysicalQuantityImpl.hasValue(REPRESENTED)) {
                throw new HqdmException("Property Not Set: represented");
            }
            if (!identificationOfPhysicalQuantityImpl.hasValue(USES)) {
                throw new HqdmException("Property Not Set: uses");
            }
            return identificationOfPhysicalQuantityImpl;
        }
    }
}
