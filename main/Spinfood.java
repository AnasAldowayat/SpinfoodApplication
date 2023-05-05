package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import static main.Pairs.getSuccessorParticipants;


public class Spinfood {
    /**
     * The path of the CSV file that contains the participants' information.
     */
    private static final String CSV_FILE_PATH = "C:/Users/anasf/OneDrive/Desktop/praktikum UNI/SP23_Gruppe2AldowayaFahammMokadamBadawi/SoftwarePraktikum/teilnehmerliste.csv";

    /**
     * The maximum number of participants per group.
     */
    private static final int MAX_GROUP_SIZE = 20;

    private List<Participant> participants;
    private List<Pair> pairs;
    private List<Group> groups;
    private Kitchen[] kitchens;
    private Algorithm algorithm;

    /**
     * Constructor for the Spinfood class.
     * Initializes the lists of participants, pairs, and groups.
     * Creates three kitchens.
     * Initializes the algorithm.
     */
    public Spinfood() {
        participants = new ArrayList<>();
        pairs = new ArrayList<>();
        groups = new ArrayList<>();
        kitchens = new Kitchen[3];
        kitchens[0] = new Kitchen(1);
        kitchens[1] = new Kitchen(2);
        kitchens[2] = new Kitchen(3);

        algorithm = new Algorithm(participants);
    }

    /**
     * Reads the participants' data from a CSV file.
     *
     * @param filename The name of the CSV file.
     * @return A Pairs object containing the paired and unpaired participants.
     * @throws IOException if there is an error reading the file.
     */
    public static Pairs readData(String filename) throws IOException {
        List<Pair> pairedParticipants = new ArrayList<>();
        List<Participant> unpairedParticipants = new ArrayList<>();

        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");

            String id = parts[1];
            String name = parts[2];
            FoodPreference foodPreference = FoodPreference.fromName(parts[3]);
           // FoodPreference foodPreference = FoodPreference.valueOf(parts[3].toUpperCase());

            int age = Integer.parseInt(parts[4]);
            Sex sex = Sex.valueOf(parts[5]);
            KitchenStatus kitchen = KitchenStatus.valueOf(parts[6]);
            double kitchenStory = 0.0;
            double kitchenLongitude = 0.0;
            double kitchenLatitude = 0.0;

            if (kitchen == KitchenStatus.no) {

                // If the participant has no kitchen, set the kitchenStory, kitchenLongitude
                // and kitchenLatitude to 0.0
                kitchenStory = 0.0;  //KitchenStatus.valueOf(parts[7]).getKitchenStory()

                kitchenLongitude = 0.0;
                kitchenLatitude = 0.0;
                unpairedParticipants.add(new Participant(id, name, foodPreference, age, sex, kitchen, kitchenStory, kitchenLongitude, kitchenLatitude));
            } else {
                if (parts[7].equals("")) {
                    kitchenStory = 0.0;
                } else {
                    kitchenStory = Double.parseDouble(parts[7]);
                }
                kitchenLongitude = Double.parseDouble(parts[8]);
                kitchenLatitude = Double.parseDouble(parts[9]);
                Participant participant = new Participant(id, name, foodPreference, age, sex, kitchen, kitchenStory, kitchenLongitude, kitchenLatitude);
                if (parts.length == 14) {
                    String partnerId = parts[10];
                    String partnerName = parts[11];
                    double partnerAge = Double.parseDouble(parts[12]);
                    Sex partnerSex = Sex.valueOf(parts[13]);
                    Participant partner = new Participant(partnerId, partnerName, FoodPreference.NONE, (int) partnerAge, partnerSex, KitchenStatus.no, 0.0, 0.0, 0.0);
                    participant.setPartner(participant);
                    participant.setPaired(true);
                    partner.setPaired(true);
                    pairedParticipants.add(new Pair(participant, partner));
                } else {
                    unpairedParticipants.add(participant);
                }
            }
        }
        br.close();

        return new Pairs(pairedParticipants, unpairedParticipants);
    }

    /**
     * Runs the algorithm to assign pairs and groups to the participants.
     */
    public void assignPairsAndGroups() {
        algorithm.run();
        pairs = algorithm.getPairs();
        groups = algorithm.getGroups();
    }

    /**
     * Prints the results of the pairing and grouping.
     */
    public void printResults() {
        for (Pair pair : pairs) {
            System.out.println(pair);
        }

        System.out.println();

        for (Group group : groups) {
            System.out.println(group);
        }
    }

    /**
     * Main method for running the Spinfood program.
     *
     * @param args The command-line arguments.
     * @throws IOException if there is an error reading the file.
     */
    public static void main(String[] args) throws IOException {
        String filename = "C:/Users/anasf/OneDrive/Desktop/praktikum UNI/SP23_Gruppe2AldowayaFahammMokadamBadawi/SoftwarePraktikum/teilnehmerliste.csv";

        Spinfood spinfood = new Spinfood();
       // getSuccessorParticipants();
        //spinfood.participants = readData(filename).getSuccessorParticipants();
        //spinfood.algorithm = new Algorithm(spinfood.participants);
        spinfood.algorithm.run();
        //spinfood.assignPairsAndGroups();
        //spinfood.printResults();


    }
}