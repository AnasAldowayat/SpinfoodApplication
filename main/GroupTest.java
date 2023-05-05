package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains JUnit tests for the {@link Group} class.
 */
public class GroupTest {

    /**
     * Tests if the {@link Group#getPair1()} method returns the expected value.
     */
    @Test
    public void testGetPair1() {
        // Create three pairs of participants and a group with those pairs
        Pair pair1 = new Pair(new Participant("1", "Max Mustermann", FoodPreference.VEGAN, 25, Sex.male,
                KitchenStatus.yes, 5.0, 52.520008, 13.404954), new Participant("2", "Maria Musterfrau",
                FoodPreference.NONE, 23, Sex.female, KitchenStatus.no, 4.8, 52.520008, 13.404954));
        Pair pair2 = new Pair(new Participant("3", "John Doe", FoodPreference.NONE, 30, Sex.male,
                KitchenStatus.yes, 4.5, 52.520008, 13.404954), new Participant("4", "Jane Doe",
                FoodPreference.VEGAN, 27, Sex.female, KitchenStatus.no, 3.7, 52.520008, 13.404954));
        Pair pair3 = new Pair(new Participant("5", "Peter Parker", FoodPreference.MEAT, 22, Sex.male,
                KitchenStatus.yes, 4.2, 52.520008, 13.404954), new Participant("6", "Mary Jane",
                FoodPreference.NONE, 21, Sex.female, KitchenStatus.no, 4.1, 52.520008, 13.404954));
        Group group = new Group(pair1, pair2, pair3);

        // Check if the first pair returned by getPair1() is the same as the first pair that was created
        assertEquals(pair1, group.getPair1());
    }

    /**
     * Tests if the {@link Group#setPair1(Pair)} method sets the first pair correctly.
     */
    @Test
    void setPair1Test() {
        // Create three pairs of participants and a group with those pairs
        Pair pair1 = new Pair(new Participant("1", "Max Mustermann", FoodPreference.VEGAN, 25, Sex.male, KitchenStatus.yes, 5.0, 52.520008, 13.404954), new Participant("2", "Maria Mustermann", FoodPreference.NONE, 23, Sex.female, KitchenStatus.no, 0.0, 52.520008, 13.404954));
        Pair pair2 = new Pair(new Participant("3", "Michael Müller", FoodPreference.NONE, 29, Sex.male, KitchenStatus.yes, 3.0, 52.520008, 13.404954), new Participant("4", "Anna Müller", FoodPreference.VEGAN, 27, Sex.female, KitchenStatus.yes, 2.0, 52.520008, 13.404954));
        Pair pair3 = new Pair(new Participant("5", "John Doe", FoodPreference.VEGAN, 33, Sex.male, KitchenStatus.yes, 4.5, 52.520008, 13.404954), new Participant("6", "Jane Doe", FoodPreference.VEGAN, 31, Sex.female, KitchenStatus.yes, 4.0, 52.520008, 13.404954));
        Group group = new Group(pair1, pair2, pair3);
        // Create a new pair and set it as the first pair of the group using setPair1()
        Pair newPair1 = new Pair(new Participant("7", "Peter Pan", FoodPreference.VEGAN, 22, Sex.male, KitchenStatus.yes, 4.0, 52.520008, 13.404954), new Participant("8", "Wendy Darling", FoodPreference.VEGAN, 21, Sex.female, KitchenStatus.no, 0.0, 52.520008, 13.404954));
        group.setPair1(newPair1);

        // Check if the first pair of the group is now equal to the new pair
        assertEquals(newPair1, group.getPair1());

        // Print some information to the console for debugging purposes
        System.out.println("Pair1 has been changed to: " + newPair1);
        System.out.println("Pair1 is now: " + group.getPair1());
        System.out.println("Pair2 is: " + group.getPair2());
        System.out.println("Pair3 is: " + group.getPair3());
    }
}
