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

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import uk.gov.gchq.hqdm.exception.HqdmException;
import uk.gov.gchq.hqdm.model.PointInTime;
import uk.gov.gchq.hqdm.model.PossibleWorld;
import uk.gov.gchq.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.impl.PointInTimeImpl;
import uk.gov.gchq.hqdm.model.impl.PossibleWorldImpl;
import uk.gov.gchq.hqdm.model.impl.SpatioTemporalExtentImpl;

public class HqdmObjectTest {

    @Test
    public void testDateTimeFormattingForTriples() throws HqdmException {
        final PossibleWorld possibleWorld = new PossibleWorldImpl("World");
        final String beginDateTime = LocalDateTime.now().toString();
        final String endDate = LocalDate.now().toString();

        final PointInTime beginEvent = new PointInTimeImpl(beginDateTime);

        beginEvent.addValue("HQDM.PART_OF_POSSIBLE_WORLD", possibleWorld.getId());

        final PointInTime endEvent = new PointInTimeImpl(endDate);

        endEvent.addValue("HQDM.PART_OF_POSSIBLE_WORLD", possibleWorld.getId());

        final SpatioTemporalExtent object1 =
                new SpatioTemporalExtentImpl("Object1");

        object1.addValue("HQDM.BEGINNING", beginEvent.getId());
        object1.addValue("HQDM.ENDING", endEvent.getId());
        object1.addValue("HQDM.PART_OF_POSSIBLE_WORLD", possibleWorld.getId());

        Assert.assertEquals(beginDateTime, beginEvent.getId());
        Assert.assertEquals(endDate, endEvent.getId());
    }
}
