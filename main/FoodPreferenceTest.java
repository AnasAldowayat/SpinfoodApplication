
/**

 This class contains unit tests for the FoodPreference enum.
 */
package main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoodPreferenceTest {/**
 * Test the fromName() method of the FoodPreference enum.
 */
    /**
     * Test the fromName() method of the FoodPreference enum.
     */
    @Test
    void testFromName() {
        String name = "VEGAN";
        FoodPreference expectedFP = FoodPreference.VEGAN;
        FoodPreference actualFP = FoodPreference.fromName(name);
        Assertions.assertEquals(expectedFP, actualFP);
        System.out.println("Test testFromName passed");
    }
}