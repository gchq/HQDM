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

import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.hqdm.iri.HQDM.THING;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Thing.
 */
public class ThingImpl extends HqdmObject implements Thing {
    public ThingImpl() {}

    /**
     *
     * @param iri
     */
    public ThingImpl(final IRI iri) {
        super(ThingImpl.class, iri, THING);
    }

    /**
     * Builder for ThingImpl.
     */
    public static class Builder {
        /** */
        private final ThingImpl thing;

        /**
         *
         * @param iri
         */
        public Builder(final IRI iri) {
            thing = new ThingImpl(iri);
        }

        /**
         * A relationship type where a thing may be a member of one or more {@link Class}.
         *
         * @param clazz
         * @return
         */
        public final Builder member__Of(final Class clazz) {
            thing.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         *
         * @return
         * @throws HqdmException
         */
        public Thing build() throws HqdmException {
            if (thing.hasValue(MEMBER__OF)
                    && thing.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            return thing;
        }
    }
}
