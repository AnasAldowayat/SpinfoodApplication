/**

 This class contains JUnit tests for the Algorithm class.
 */
package main;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {




    @Test
    void createPairs() throws IOException {

        String filename = "C:/Users/anasf/OneDrive/Desktop/praktikum UNI/SP23_Gruppe2AldowayaFahammMokadamBadawi/SoftwarePraktikum/teilnehmerliste.csv";
        Pairs pairs = Spinfood.readData(filename);

        List<Participant> participants = pairs.getSuccessorParticipants();;

        Participant p1 = new Participant ("1345", "anas ", FoodPreference.NONE, 25, Sex.male,
                KitchenStatus.no, 1.5, 10.0, 20.0);
        Participant p2 = new Participant ("1345234", "nebal", FoodPreference.MEAT, 25, Sex.male,
                KitchenStatus.yes, 1.5, 10.0, 20.0);
        Participant p3 = new Participant ("2341", "abo teisierr", FoodPreference.VEGAN, 25, Sex.female,
                KitchenStatus.no, 1.5, 10.0, 20.0);
        Participant p4 = new Participant ("13455", "faham", FoodPreference.MEAT, 25, Sex.female,
                KitchenStatus.no, 1.5, 10.0, 20.0);
        Participant p5 = new Participant ("14435", "mo ", FoodPreference.NONE, 25, Sex.male,
                KitchenStatus.no, 1.5, 10.0, 20.0);
        Participant p6 = new Participant ("14564", "mokadam ", FoodPreference.VEGGIE, 25, Sex.male,
                KitchenStatus.yes, 1.5, 10.0, 20.0);
        Participant p7 = new Participant ("1457", "soso ", FoodPreference.NONE, 25, Sex.female,
                KitchenStatus.yes, 1.5, 10.0, 20.0);
        Participant p8 = new Participant ("174567456", " Doe", FoodPreference.NONE, 25, Sex.male,
                KitchenStatus.no, 1.5, 10.0, 20.0);
        Participant p9= new Participant ("4567451", " amal", FoodPreference.MEAT, 25, Sex.male,
                KitchenStatus.yes, 1.5, 10.0, 20.0);

        Participant p10= new Participant ("4445451", " abo ras", FoodPreference.VEGGIE, 25, Sex.male,
                KitchenStatus.no, 1.5, 10.0, 20.0);



        List<Participant> participants1 = new ArrayList<>();
        participants1.add(p1);
        participants1.add(p2);
        participants1.add(p6);
        participants1.add(p7);
        participants1.add(p8);
        participants1.add(p9);
        participants1.add(p3);
        participants1.add(p4);
        participants1.add(p5);
        participants1.add(p10);


        // Call the createPairs method and get the result
        Pairs newPairs = Algorithm.createPairs(participants1);
       // assertEquals(69, pairs.getPairedParticipants().size());
        //assertEquals(42, pairs.getSuccessorParticipants().size());
        // Assert that the result is not null
        assertNotNull(pairs);
        // Assert that the list of paired participants in the result contains pairs
        assertFalse(pairs.getPairedParticipants().isEmpty());
        // Assert that the list of unpaired participants in the result contains participants
        //deutsch: Assert, dass die Liste der ungepaarten Teilnehmer im Ergebnis Teilnehmer enthält
        assertFalse(pairs.getSuccessorParticipants().isEmpty());

        System.out.println("--------------------------------------------------");
        System.out.println("Paired Participants");
       for (Pair pair : newPairs.getPairedParticipants()) {
            System.out.println(pair.getParticipant1().getName() + " - " + pair.getParticipant2().getName());

        }
        System.out.println( "--------------------------------------------------");
        System.out.println("Unpaired Participants");
        System.out.println("--------------------------------------------------");
        for (Participant participant : newPairs.getSuccessorParticipants()) {
            System.out.println(participant.getName());
        }

    }
}