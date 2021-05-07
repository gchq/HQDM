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

import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.SPECIALIZATION;
import static uk.gov.gchq.hqdm.iri.HQDM.SUBCLASS;
import static uk.gov.gchq.hqdm.iri.HQDM.SUPERCLASS;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.Specialization;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Specialization.
 */
public class SpecializationImpl extends HqdmObject implements Specialization {
    /**
     *
     * @param iri
     */
    public SpecializationImpl(final IRI iri) {
        super(SpecializationImpl.class, iri, SPECIALIZATION);
    }

    /**
     * Builder for SpecializationImpl.
     */
    public static class Builder {
        /** */
        private final SpecializationImpl specializationImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            specializationImpl = new SpecializationImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            specializationImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfRelationship
         * @return
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            specializationImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * A relationship type where each specialization has exactly one {@link Class} as subclass.
         *
         * @param clazz
         * @return
         */
        public final Builder subclass_M(final Class clazz) {
            specializationImpl.addValue(SUBCLASS, clazz.getIri());
            return this;
        }

        /**
         * A relationship type where each specialization has exactly one {@link Class} as
         * superclass.
         *
         * @param clazz
         * @return
         */
        public final Builder superclass_M(final Class clazz) {
            specializationImpl.addValue(SUPERCLASS, clazz.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Specialization build() throws HqdmException {
            if (specializationImpl.hasValue(MEMBER__OF)
                    && specializationImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (specializationImpl.hasValue(MEMBER_OF)
                    && specializationImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!specializationImpl.hasValue(SUBCLASS)) {
                throw new HqdmException("Property Not Set: subclass");
            }
            if (!specializationImpl.hasValue(SUPERCLASS)) {
                throw new HqdmException("Property Not Set: superclass");
            }
            return specializationImpl;
        }
    }
}
