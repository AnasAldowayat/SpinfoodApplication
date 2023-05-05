package main;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private double kitchenStory;
    private double longitude;
    private double latitude;
    private List<Participant> participants = new ArrayList<>();

    /**
     * Default constructor for a kitchen.
     */
    public Kitchen() {
    }

    /**
     * Constructor for a kitchen with a specified kitchen story.
     *
     * @param kitchenStory The kitchen story to set.
     */
    public Kitchen(double kitchenStory) {
        this.kitchenStory = kitchenStory;
    }

    /**
     * Constructor for a kitchen with a specified kitchen story, longitude and latitude.
     *
     * @param kitchenStory The kitchen story to set.
     * @param longitude    The longitude to set.
     * @param latitude     The latitude to set.
     */
    public Kitchen(double kitchenStory, double longitude, double latitude) {
        this.kitchenStory = kitchenStory;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Returns the kitchen story of the kitchen.
     *
     * @return The kitchen story of the kitchen.
     */
    public double getKitchenStory() {
        return kitchenStory;
    }

    /**
     * Sets the kitchen story of the kitchen.
     *
     * @param kitchenStory The kitchen story to set.
     */
    public void setKitchenStory(double kitchenStory) {
        this.kitchenStory = kitchenStory;
    }

    /**
     * Returns the longitude of the kitchen.
     *
     * @return The longitude of the kitchen.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude of the kitchen.
     *
     * @param longitude The longitude to set.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Returns the latitude of the kitchen.
     *
     * @return The latitude of the kitchen.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude of the kitchen.
     *
     * @param latitude The latitude to set.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Adds a participant to the kitchen.
     *
     * @param participant The participant to add.
     */
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }


    public void setCoordinates(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Returns the list of participants in the kitchen.
     *
     * @return The list of participants in the kitchen.
     */
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * Returns the distance in kilometers to another kitchen.
     *
     * @param otherKitchen The other kitchen to calculate the distance to.
     * @return The distance in kilometers to the other kitchen.
     */
    public double distanceTo(Kitchen otherKitchen) {
        double dLat = Math.toRadians(otherKitchen.latitude - this.latitude);
        double dLng = Math.toRadians(otherKitchen.longitude - this.longitude);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(this.latitude))
                * Math.cos(Math.toRadians(otherKitchen.latitude)) * Math.sin(dLng / 2) * Math.sin(dLng / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double dist = 6371 * c;
        return dist;
    }
}
