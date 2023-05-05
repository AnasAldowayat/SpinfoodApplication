package main;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SexTest {

    @Test
    public void testSexEnum() {
        // Test the "female" value
        Sex sex = Sex.female;
        assertEquals("female", sex.toString());

        // Test the "male" value
        sex = Sex.male;
        assertEquals("male", sex.toString());

        // Test the "other" value
        sex = Sex.other;
        assertEquals("other", sex.toString());
    }
}
