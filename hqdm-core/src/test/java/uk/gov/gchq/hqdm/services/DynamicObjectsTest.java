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

package uk.gov.gchq.hqdm.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uk.gov.gchq.hqdm.model.Participant;
import uk.gov.gchq.hqdm.model.Party;
import uk.gov.gchq.hqdm.model.Person;

/**
 * Test creation of dynamic objects.
 */
public class DynamicObjectsTest {

    /**
     * Test that we can create an object with multiple interfaces.
     */
    @Test
    public void testCreate() {

        // Create the object with three interfaces.
        final Person p = DynamicObjects.create("id1", Person.class,
                new Class[] { Person.class, Participant.class, Party.class });

        // Verify that the object implements all three interfaces and has the right id.
        assertTrue(p instanceof Person);
        assertTrue(p instanceof Participant);
        assertTrue(p instanceof Party);
        assertEquals("id1", p.getId());
    }

    /**
     * Test that we can add an interface to an existing object.
     */
    @Test
    public void testAddInterface() {

        // Create the object with one interface.
        final Person p1 = SpatioTemporalExtentServices.createPerson("id1");

        // Verify that the object implements just the Person and Party interfaces.
        assertTrue(p1 instanceof Person);
        assertFalse(p1 instanceof Participant);
        assertTrue(p1 instanceof Party);
        assertEquals("id1", p1.getId());

        // Add two more interfaces to the object - this time return it as a Participant.
        final Participant p2 = DynamicObjects.implementInterfaces(p1, Participant.class,
                new Class[] { Person.class, Participant.class, Party.class });

        // Verify that the object implements all three interfaces and has the right id.
        assertTrue(p2 instanceof Person);
        assertTrue(p2 instanceof Participant);
        assertTrue(p2 instanceof Party);
        assertEquals("id1", p2.getId());
    }
}
