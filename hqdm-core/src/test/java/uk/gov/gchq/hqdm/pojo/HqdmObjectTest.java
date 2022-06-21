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

package uk.gov.gchq.hqdm.pojo;

import static uk.gov.gchq.hqdm.iri.HQDM.ENTITY_NAME;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.iri.HQDM;
import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.PointInTime;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.impl.PointInTimeImpl;
import uk.gov.gchq.hqdm.model.impl.PossibleWorldImpl;
import uk.gov.gchq.hqdm.model.impl.SpatioTemporalExtentImpl;

public class HqdmObjectTest {
    private static final String BASE_URL = "http://example.com/text#";

    @Test
    public void testDateTimeFormattingForTriples() throws HqdmException {
        final PossibleWorld possibleWorld = new PossibleWorldImpl(new IRI(BASE_URL + "World"));
        final String beginDateTime = LocalDateTime.now().toString();
        final String endDate = LocalDate.now().toString();

        final PointInTime beginEvent = new PointInTimeImpl(new IRI(BASE_URL + "date_1"));

        beginEvent.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
        beginEvent.addStringValue(ENTITY_NAME, beginDateTime);

        final PointInTime endEvent = new PointInTimeImpl(new IRI(BASE_URL + "date_2"));

        endEvent.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());
        endEvent.addStringValue(ENTITY_NAME, endDate);

        final SpatioTemporalExtent object1 =
                new SpatioTemporalExtentImpl(new IRI(BASE_URL + "Object1"));

        object1.addValue(HQDM.BEGINNING, beginEvent.getIri());
        object1.addValue(HQDM.ENDING, endEvent.getIri());
        object1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getIri());

        Assert.assertTrue(beginEvent.toTriples()
                .contains("^^<http://www.w3.org/2001/XMLSchema#dateTime>"));
        Assert.assertTrue(endEvent.toTriples()
                .contains("^^<http://www.w3.org/2001/XMLSchema#date>"));
    }
}
