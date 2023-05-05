package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains JUnit tests for the AgeRange enum.
 */
public class AgeRangeTest {

    /**
     * Tests that the values() method returns all enum values in the correct order.
     */
    @Test
    void values() {
        AgeRange[] expected = {
                AgeRange.UNDER_18,
                AgeRange.BETWEEN_18_AND_25,
                AgeRange.BETWEEN_26_AND_35,
                AgeRange.BETWEEN_36_AND_45,
                AgeRange.BETWEEN_46_AND_55,
                AgeRange.ABOVE_55
        };
        AgeRange[] actual = AgeRange.values();
        assertArrayEquals(expected, actual);
    }

    /**
     * Tests that the valueOf() method returns the correct enum value for a given string.
     * Also tests that an IllegalArgumentException is thrown for an invalid string.
     */
    @Test
    void valueOf() {
        assertEquals(AgeRange.UNDER_18, AgeRange.valueOf("UNDER_18"));
        assertEquals(AgeRange.BETWEEN_18_AND_25, AgeRange.valueOf("BETWEEN_18_AND_25"));
        assertEquals(AgeRange.BETWEEN_26_AND_35, AgeRange.valueOf("BETWEEN_26_AND_35"));
        assertEquals(AgeRange.BETWEEN_36_AND_45, AgeRange.valueOf("BETWEEN_36_AND_45"));
        assertEquals(AgeRange.BETWEEN_46_AND_55, AgeRange.valueOf("BETWEEN_46_AND_55"));
        assertEquals(AgeRange.ABOVE_55, AgeRange.valueOf("ABOVE_55"));

        // Test that an IllegalArgumentException is thrown for an invalid string
        assertThrows(IllegalArgumentException.class, () -> AgeRange.valueOf("INVALID_AGE_RANGE"));
    }
}
