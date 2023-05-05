/**

 This class contains JUnit tests for the Dishes enum.
 */
package main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DishesTest {
    @Test
    void testEnumValues() {
        Dishes[] expectedValues = {Dishes.VORSPEISE, Dishes.HAUPTGANG, Dishes.DESSERT};
        Assertions.assertArrayEquals(expectedValues, Dishes.values());
        System.out.println("Test testEnumValues passed");
    }

    @Test
    void testToString() {
        Assertions.assertEquals("VORSPEISE", Dishes.VORSPEISE.toString());
        Assertions.assertEquals("HAUPTGANG", Dishes.HAUPTGANG.toString());
        Assertions.assertEquals("DESSERT", Dishes.DESSERT.toString());
        System.out.println("Test testToString passed");
    }

// Add more tests here
}
