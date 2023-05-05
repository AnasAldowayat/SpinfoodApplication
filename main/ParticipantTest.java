package main; /**
 * A class representing a unit test for the Participant class.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class ParticipantTest {

    /**
     * Test method for getting the participant's ID.
     */
    @Test
    public void testGetId() {
        Participant participant = new Participant("1", "John Doe", FoodPreference.VEGGIE, 25, Sex.male,
                KitchenStatus.yes, 1.5, 10.0, 20.0);
        assertEquals("1", participant.getId());
    }

    /**
     * Test method for getting the participant's age.
     */
    @Test
    public void testGetAge() {
        Participant participant = new Participant("1", "John Doe", FoodPreference.VEGGIE, 25, Sex.male,
                KitchenStatus.yes, 1.5, 10.0, 20.0);
        assertEquals(25, participant.getAge());
    }

    /**
     * Test method for calculating the participant's age range.
     */
    @Test
    public void testCalculateAgeRange() {
        Participant participant1 = new Participant("1", "John Doe", FoodPreference.VEGGIE, 16, Sex.male,
                KitchenStatus.yes, 1.5, 10.0, 20.0);
        assertEquals(AgeRange.UNDER_18, participant1.calculateAgeRange());

        Participant participant2 = new Participant("2", "Jane Doe", FoodPreference.NONE, 31, Sex.female,
                KitchenStatus.no, 1.5, 10.0, 20.0);
        assertEquals(AgeRange.BETWEEN_26_AND_35, participant2.calculateAgeRange());

        Participant participant3 = new Participant("3", "Jack Smith", FoodPreference.VEGAN, 60, Sex.male,
                KitchenStatus.yes, 1.5, 10.0, 20.0);
        assertEquals(AgeRange.ABOVE_55, participant3.calculateAgeRange());
    }

    // Additional test methods for other methods in the Participant class
}
