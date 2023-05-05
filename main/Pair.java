package main;

/**

 Represents a pair of participants that will be attending a dinner together.
 */
public class Pair {
    private Participant participant1;
    private Participant participant2;
    private Dishes dishes;

    /**

     Creates a new Pair object with two given participants and no specific dish preference.
     @param participant1 the first participant
     @param participant2 the second participant
     */
    public Pair(Participant participant1, Participant participant2) {
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.dishes = dishes;
    }
    /**
     Returns the first participant of this pair.
     @return the first participant of this pair
     */
    public Participant getParticipant1() {
        return participant1;
    }
    /**
     Sets the first participant of this pair.
     @param participant1 the new first participant
     */
    public void setParticipant1(Participant participant1) {
        this.participant1 = participant1;
    }
    /**
     Returns the second participant of this pair.
     @return the second participant of this pair
     */
    public Participant getParticipant2() {
        return participant2;
    }
    /**
     Sets the second participant of this pair.
     @param participant2 the new second participant
     */
    public void setParticipant2(Participant participant2) {
        this.participant2 = participant2;
    }
    /**
     Returns the preferred dish type of this pair.
     @return the preferred dish type of this pair
     */
    public Dishes getDishes() {
        return dishes;
    }
    /**
     Sets the preferred dish type of this pair.
     @param dishes the new preferred dish type
     */
    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }
    /**
     Calculates and returns the absolute age difference between the two participants in this pair.
     @return the absolute age difference between the two participants in this pair
     */
    public int getAgeDiff() {
        return Math.abs(participant1.getAge() - participant2.getAge());
    }
    /**
     Returns a string representation of this Pair object.
     @return a string representation of this Pair object
     */
    @Override
    public String toString() {
        return "Pair{" +
                "p1=" + participant1 +
                ", p2=" + participant2 +
                ", dishes=" + dishes +
                '}';
    }

    /**
     Calculates and returns the main food preference for this pair, based on the food preferences of the two participants.

     @return the main food preference for this pair
     */
    public FoodPreference calculateMainFoodPreference() {
        FoodPreference pref1 = participant1.getFoodPreference();
        FoodPreference pref2 = participant2.getFoodPreference();

        if (pref1 == pref2) {
            return pref1;
        } else {
            int pref1Index = pref1.ordinal();
            int pref2Index = pref2.ordinal();
            int avgIndex = (pref1Index + pref2Index) / 2;
            return FoodPreference.values()[avgIndex];
        }
    }

}