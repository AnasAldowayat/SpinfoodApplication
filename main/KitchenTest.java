package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test class for the Kitchen class.
 */
class KitchenTest {

    /**
     * Tests the getKitchenStory method of the Kitchen class.
     */
    @Test
    void testGetKitchenStory() {
        // Create a new Kitchen object with a specified number of stories
        Kitchen kitchen = new Kitchen(4.5);
        // Check if the getKitchenStory method returns the expected value
        Assertions.assertEquals(4.5, kitchen.getKitchenStory());
        // Print a message indicating that the test has passed
        System.out.println("Test testGetKitchenStory passed");
    }

    /**
     * Tests the setKitchenStory method of the Kitchen class.
     */
    @Test
    void testSetKitchenStory() {
        // Create a new Kitchen object
        Kitchen kitchen = new Kitchen();
        // Set the number of stories using the setKitchenStory method
        kitchen.setKitchenStory(3.2);
        // Check if the getKitchenStory method returns the expected value
        Assertions.assertEquals(3.2, kitchen.getKitchenStory());
        // Print a message indicating that the test has passed
        System.out.println("Test testSetKitchenStory passed");
    }

    /**
     * Tests the getLongitude method of the Kitchen class.
     */
    @Test
    void testGetLongitude() {
        // Create a new Kitchen object with specified longitude and latitude coordinates
        Kitchen kitchen = new Kitchen(4.5, 13.404954, 52.520008);
        // Check if the getLongitude method returns the expected value
        Assertions.assertEquals(13.404954, kitchen.getLongitude());
        // Print a message indicating that the test has passed
        System.out.println("Test testGetLongitude passed");
    }

    /**
     * Tests the setLongitude method of the Kitchen class.
     */
    @Test
    void testSetLongitude() {
        // Create a new Kitchen object
        Kitchen kitchen = new Kitchen();
        // Set the longitude coordinate using the setLongitude method
        kitchen.setLongitude(13.404954);
        // Check if the getLongitude method returns the expected value
        Assertions.assertEquals(13.404954, kitchen.getLongitude());
        // Print a message indicating that the test has passed
        System.out.println("Test testSetLongitude passed");
    }

    /**
     * Tests the getLatitude method of the Kitchen class.
     */
    @Test
    void testGetLatitude() {
        // Create a new Kitchen object with specified longitude and latitude coordinates
        Kitchen kitchen = new Kitchen(4.5, 13.404954, 52.520008);
        // Check if the getLatitude method returns the expected value
        Assertions.assertEquals(52.520008, kitchen.getLatitude());
        // Print a message indicating that the test has passed
        System.out.println("Test testGetLatitude passed");
    }

    /**
     * Tests the setLatitude method of the Kitchen class.
     */
    @Test
    void testSetLatitude() {
        // Create a new Kitchen object
        Kitchen kitchen = new Kitchen();
        // Set the latitude coordinate using the setLatitude method
        kitchen.setLatitude(52.520008);
        // Check if the getLatitude method returns the expected value
        Assertions.assertEquals(52.520008, kitchen.getLatitude());
        // Print a message indicating that the test has passed
        System.out.println("Test testSetLatitude passed");
    }

    /**
     * Tests the setCoordinates method of the Kitchen class.
     */
    @Test
    void testSetCoordinates() {
        // Create a new Kitchen object
        Kitchen kitchen = new Kitchen();
// Check if the initial longitude and latitude coordinates are correct
        Assertions.assertEquals(13.404954, kitchen.getLongitude());
        Assertions.assertEquals(52.520008, kitchen.getLatitude());
// Print a message indicating that the test has passed
        System.out.println("Test testSetCoordinates passed");
    }

}







