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

import static uk.gov.gchq.hqdm.iri.HQDM.PARTICIPANT;

import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of Participant.
 */
public class ParticipantImpl extends HqdmObject implements Participant {
    /**
     * Constructs a new Participant.
     *
     * @param iri IRI of the Participant.
     */
    public ParticipantImpl(final IRI iri) {
        super(ParticipantImpl.class, iri, PARTICIPANT);
    }

}
