package org.app.util;

import java.util.UUID;

public class IdGenerator {
    public static String generateRandomId() {
        return UUID.randomUUID().toString();
    }
}
