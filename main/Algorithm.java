package main;
import java.util.*;

public class Algorithm {
    List<Pair> pairs;
    List<Group> groups;
    List<Kitchen> kitchens;
    List<Participant> participants;


    /**
     * Constructor for the Algorithm class.
     * Initializes the lists of pairs, groups, kitchens, and participants.
     *
     * @param participants The list of participants to be used in the algorithm.
     */
    public Algorithm(List<Participant> participants) {
        this.participants = participants;
        this.pairs = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.kitchens = new ArrayList<>();
    }

    /**
     * Runs the algorithm to assign pairs and groups to the participants.
     */
    public void run() {
        // Step 1: Create pairs
        createPairs(participants);

        // Step 2: Create groups
        //createGroups();
    }

    /**
     * Creates pairs of participants based on their food preferences and kitchen status.
     *
     * @param participants The list of participants to be paired.
     * @return A Pairs object containing the paired and unpaired participants.
     */
    public static Pairs createPairs(List<Participant> participants) {
        // Sort participants by food preference
        Collections.sort(participants, Comparator.comparing(Participant::getFoodPreference));
        // Initialize two lists, one for the paired participants and one for the unpaired participants
        List<Pair> pairs = new ArrayList<>();
        List<Participant> unpaired = new ArrayList<>();

        // Iterate over the sorted list of participants, taking one participant at a time
        for (int i = 0; i < participants.size(); i++) {
            Participant p1 = participants.get(i);
            boolean isPaired = false;
            // Compare the first participant with all the others
            for (int j = i + 1; j < participants.size(); j++) {
                Participant p2 = participants.get(j);
                // Check if both participants have a kitchen
                if (p1.getKitchen() == KitchenStatus.no && p2.getKitchen() == KitchenStatus.yes ||
                        p1.getKitchen() == KitchenStatus.yes && p2.getKitchen() == KitchenStatus.no) {
                    Map<Pair, FoodPreference> pairPreferenceMap = new HashMap<>();
                    // Assign main food preference
                    FoodPreference mainPreference;
                    if (p1.getFoodPreference() == p2.getFoodPreference()) {
                        mainPreference = p1.getFoodPreference();
                    } else if ((p1.getFoodPreference() == FoodPreference.MEAT || p1.getFoodPreference() == FoodPreference.NONE)
                            && (p2.getFoodPreference() == FoodPreference.MEAT || p2.getFoodPreference() == FoodPreference.NONE)) {
                        mainPreference = FoodPreference.MEAT;
                    } else if ((p1.getFoodPreference() == FoodPreference.MEAT || p1.getFoodPreference() == FoodPreference.NONE)
                            && (p2.getFoodPreference() == FoodPreference.VEGGIE )) {
                        mainPreference = p2.getFoodPreference();
                    }else if ((p1.getFoodPreference() == FoodPreference.MEAT || p1.getFoodPreference() == FoodPreference.NONE)
                            && ( p2.getFoodPreference() == FoodPreference.VEGAN)) {
                        mainPreference = p2.getFoodPreference();
                    } else if ((p1.getFoodPreference() == FoodPreference.VEGGIE || p1.getFoodPreference() == FoodPreference.VEGAN)
                            && (p2.getFoodPreference() == FoodPreference.MEAT || p2.getFoodPreference() == FoodPreference.NONE)) {
                        mainPreference = p1.getFoodPreference();
                    } else {
                        mainPreference = FoodPreference.VEGAN;
                    }
                    // Add the paired participants to the pairs list, along with their main food preference
                    pairs.add(new Pair(p1, p2));
                    pairPreferenceMap.put(new Pair(p1, p2), mainPreference);
                    //System.out.println(" main FoodPreference is "+pairPreferenceMap);
                    //pairs.add(new Pair(p1, p2, mainPreference));
                    // Remove the paired participants from the list of unpaired participants
                    participants.remove(p2);
                    isPaired = true;
                    break;
                }
            }
            // If the participant was not paired, add it to the unpaired list
            if (!isPaired) {
                unpaired.add(p1);
            }
        }
        // If there is an odd number of participants, add the last one to the unpaired list
        if (participants.size() % 2 != 0) {
            unpaired.add(participants.get(participants.size() - 1));
        }
        // Create and return a new Pairs object with the paired and unpaired lists
        return new Pairs(pairs, unpaired);
    }



    /**
     * Creates groups of participants based on their food preferences and kitchen status.
     */
    private void createGroups() {
        // Implement code to create groups
    }

    /**
     * Getter for the list of pairs.
     *
     * @return The list of pairs.
     */
    public List<Pair> getPairs() {
        return pairs;
    }

    /**
     * Getter for the list of groups.
     *
     * @return The list of groups.
     */
    public List<Group> getGroups() {
        return groups;
    }
}
