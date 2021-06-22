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

import static uk.gov.gchq.hqdm.iri.HQDM.CLASSIFICATION;
import static uk.gov.gchq.hqdm.iri.HQDM.CLASSIFIER;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.hqdm.iri.HQDM.MEMBER__OF;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.Classification;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Classification.
 */
public class ClassificationImpl extends HqdmObject implements Classification {
    /**
     * Constructs a new Classification.
     *
     * @param iri IRI of the Classification.
     */
    public ClassificationImpl(final IRI iri) {
        super(ClassificationImpl.class, iri, CLASSIFICATION);
    }

    /**
     * Builder for constructing instances of Classification.
     */
    public static class Builder {

        private final ClassificationImpl classificationImpl;

        /**
         * Constructs a Builder for a new Classification.
         *
         * @param iri IRI of the Classification.
         */
        public Builder(final IRI iri) {
            classificationImpl = new ClassificationImpl(iri);
        }

        /**
         * A relationship type where a {@link Classification} has exactly one classifier.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder classifier_M(final Class clazz) {
            classificationImpl.addValue(CLASSIFIER, clazz.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link Classification} has exactly one member.
         *
         * @param thing The Thing.
         * @return This builder.
         */
        public final Builder member_M(final Thing thing) {
            classificationImpl.addValue(MEMBER, thing.getIri());
            return this;
        }

        /**
         * A relationship type where a {@link Thing} may be a member of one or more {@link Class}.
         *
         * <p>
         * Note: This relationship is the same as the entity type {@link Classification}.
         * </p>
         * clazz.
         *
         * @param clazz The Class.
         * @return This builder.
         */
        public final Builder member__Of(final Class clazz) {
            classificationImpl.addValue(MEMBER__OF, clazz.getIri());
            return this;
        }

        /**
         * A {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} relationship type where a relationship is a
         * {@link uk.gov.gchq.hqdm.iri.HQDM#MEMBER_OF} a {@link ClassOfRelationship}.
         *
         * @param classOfRelationship The ClassOfRelationship.
         * @return This builder.
         */
        public final Builder member_Of(final ClassOfRelationship classOfRelationship) {
            classificationImpl.addValue(MEMBER_OF, classOfRelationship.getIri());
            return this;
        }

        /**
         * Returns an instance of Classification created from the properties set on this builder.
         *
         * @return The built Classification.
         * @throws HqdmException If the Classification is missing any mandatory properties.
         */
        public Classification build() throws HqdmException {
            if (!classificationImpl.hasValue(CLASSIFIER)) {
                throw new HqdmException("Property Not Set: classifier");
            }
            if (!classificationImpl.hasValue(MEMBER)) {
                throw new HqdmException("Property Not Set: member");
            }
            if (classificationImpl.hasValue(MEMBER__OF)
                    && classificationImpl.value(MEMBER__OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member__of");
            }
            if (classificationImpl.hasValue(MEMBER_OF)
                    && classificationImpl.value(MEMBER_OF).isEmpty()) {
                throw new HqdmException("Property Not Set: member_of");
            }
            return classificationImpl;
        }
    }
}
