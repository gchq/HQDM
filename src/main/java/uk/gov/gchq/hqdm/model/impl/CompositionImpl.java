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

import static uk.gov.gchq.hqdm.iri.HQDM.COMPOSITION;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.PART;
import static uk.gov.gchq.hqdm.iri.HQDM.WHOLE;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.Composition;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Composition.
 */
public class CompositionImpl extends HqdmObject implements Composition {
    /**
     *
     * @param iri
     */
    public CompositionImpl(final IRI iri) {
        super(CompositionImpl.class, iri, COMPOSITION);
    }

    /**
     * Builder for CompositionImpl.
     */
    public static class Builder {
        /** */
        private final CompositionImpl compositionImpl;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            compositionImpl = new CompositionImpl(iri);
        }

        /**
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            compositionImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @param classOfRelationship
         * @return
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            compositionImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder part_M(final SpatioTemporalExtent spatioTemporalExtent) {
            compositionImpl.addValue(PART, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @param spatioTemporalExtent
         * @return
         */
        public final Builder whole_M(final SpatioTemporalExtent spatioTemporalExtent) {
            compositionImpl.addValue(WHOLE, spatioTemporalExtent.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Composition build() throws HqdmException {
            if (compositionImpl.hasValue(MEMBER__OF)
                    && compositionImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (compositionImpl.hasValue(MEMBER_OF)
                    && compositionImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            if (!compositionImpl.hasValue(PART)) {
                throw new HqdmException("Property Not Set: part");
            }
            if (!compositionImpl.hasValue(WHOLE)) {
                throw new HqdmException("Property Not Set: whole");
            }
            return compositionImpl;
        }
    }
}
