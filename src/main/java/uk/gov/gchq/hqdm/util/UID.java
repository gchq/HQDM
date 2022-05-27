package uk.gov.gchq.hqdm.util;

import java.util.UUID;

/**
 * Class to generate unique IDs.
 *
 * */
public class UID {
    /**
     * Create a new random UUID to assign to an object.
     *
     * @return A Random UUID.
     */
    public static String uid() {
        return UUID.randomUUID().toString();
    }


}
