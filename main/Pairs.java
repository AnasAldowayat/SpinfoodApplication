package main;

import java.util.List;

/**
 * The Pairs class represents a pairing of participants.
 */
public class Pairs {

    // Field for the list of paired participants
    private List<Pair> pairedParticipants;

    // Field for the list of participants that could not be paired
    private static List<Participant> successorParticipants;

    /**
     * Constructor for the Pairs class that takes in two parameters.
     *
     * @param pairedParticipants      a list of pairs of participants
     * @param successorParticipants   a list of participants that could not be paired
     */
    public Pairs(List<Pair> pairedParticipants, List<Participant> successorParticipants) {
        this.pairedParticipants = pairedParticipants;
        this.successorParticipants = successorParticipants;
    }

    /**
     * Getter method for the list of paired participants.
     *
     * @return  the list of paired participants
     */
    public List<Pair> getPairedParticipants() {
        return pairedParticipants;
    }

    /**
     * Setter method for the list of paired participants.
     *
     * @param pairedParticipants  the new list of paired participants
     */
    public void setPairedParticipants(List<Pair> pairedParticipants) {
        this.pairedParticipants = pairedParticipants;
    }

    /**
     * Getter method for the list of successor participants.
     *
     * @return  the list of successor participants
     */
    public static List<Participant> getSuccessorParticipants() {
        return successorParticipants;
    }

    /**
     * Setter method for the list of successor participants.
     *
     * @param successorParticipants    the new list of successor participants
     */
    public void setSuccessorParticipants(List<Participant> successorParticipants) {
        this.successorParticipants = successorParticipants;
    }

    /**
     * Adds a paired participant to the list of paired participants.
     *
     * @param pair  the paired participant to add
     */
    public void addPairedParticipants(Pair pair) {
        pairedParticipants.add(pair);
    }

    /**
     * Adds a successor participant to the list of successor participants.
     *
     * @param participant   the successor participant to add
     */
    public void addSuccessorParticipant(Participant participant) {
        successorParticipants.add(participant);
    }

    /**
     * Checks if there are any successor participants.
     *
     * @return  true if there are successor participants, false otherwise
     */
    public boolean hasSuccessorParticipants() {
        return !successorParticipants.isEmpty();
    }
}
