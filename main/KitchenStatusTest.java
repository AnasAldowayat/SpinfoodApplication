package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This class contains JUnit tests for the {@link KitchenStatus} enum.
 */
public class KitchenStatusTest {

    /**
     * Tests if the {@link KitchenStatus#yes} value returns the expected name.
     */
    @Test
    public void testYes() {
        KitchenStatus status = KitchenStatus.yes;
        Assertions.assertEquals("yes", status.name());
    }

    /**
     * Tests if the {@link KitchenStatus#no} value returns the expected name.
     */
    @Test
    public void testNo() {
        KitchenStatus status = KitchenStatus.no;
        Assertions.assertEquals("no", status.name());
    }

    /**
     * Tests if the {@link KitchenStatus#maybe} value returns the expected name.
     */
    @Test
    public void testMaybe() {
        KitchenStatus status = KitchenStatus.maybe;
        Assertions.assertEquals("maybe", status.name());
    }
}
