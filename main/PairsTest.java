package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * The PairsTest class tests the functionality of the Pairs class.
 */
public class PairsTest {

    /**
     * Tests the addPairedParticipants method of the Pairs class.
     */
    @Test
    void testAddPairedParticipants() {
        // Create two participants and a pair object
        Participant participant1 = new Participant("1", "John", FoodPreference.MEAT, 25, Sex.male, KitchenStatus.yes, 3.0, 13.404954, 52.520008);
        Participant participant2 = new Participant("2", "Jane", FoodPreference.VEGAN, 30, Sex.female, KitchenStatus.no, 5.0, 13.383606, 52.542505);
        Pair pair = new Pair(participant1, participant2);

        // Create lists for paired and successor participants
        List<Pair> pairedParticipants = new ArrayList<>();
        List<Participant> successorParticipants = new ArrayList<>();

        // Create a Pairs object and add a pair to the paired participants list
        Pairs pairs = new Pairs(pairedParticipants, successorParticipants);
        pairs.addPairedParticipants(pair);

        // Check that the paired participants list has a size of 2
        Assertions.assertEquals(2, pairs.getPairedParticipants().size());
    }

    /**
     * Tests the addSuccessorParticipant method of the Pairs class.
     */
    @Test
    void testAddSuccessorParticipant() {
        // Create a participant
        Participant participant = new Participant("1", "John", FoodPreference.MEAT, 25, Sex.male, KitchenStatus.yes, 3.0, 13.404954, 52.520008);

        // Create lists for paired and successor participants
        List<Pair> pairedParticipants = new ArrayList<>();
        List<Participant> successorParticipants = new ArrayList<>();

        // Create a Pairs object and add the participant to the successor participants list
        Pairs pairs = new Pairs(pairedParticipants, successorParticipants);
        pairs.addSuccessorParticipant(participant);

        // Check that the successor participants list has a size of 1
        Assertions.assertEquals(1, pairs.getSuccessorParticipants().size());
    }

    /**
     * Tests the hasSuccessorParticipants method of the Pairs class.
     */
    @Test
    void testHasSuccessorParticipants() {
        // Create lists for paired and successor participants
        List<Pair> pairedParticipants = new ArrayList<>();
        List<Participant> successorParticipants = new ArrayList<>();

        // Create a Pairs object and check that it does not have any successor participants
        Pairs pairs = new Pairs(pairedParticipants, successorParticipants);
        Assertions.assertFalse(pairs.hasSuccessorParticipants());

        // Add a participant to the successor participants list and check that the Pairs object has successor participants
        Participant participant = new Participant("1", "John", FoodPreference.MEAT, 25, Sex.male, KitchenStatus.yes, 3.0, 13.404954, 52.520008);
        pairs.addSuccessorParticipant(participant);
        Assertions.assertTrue(pairs.hasSuccessorParticipants());
    }
}
