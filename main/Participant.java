package main;

import main.AgeRange;

/**
 * The Participant class represents a single participant.
 */
public class Participant {

    // Fields for participant information
    private String id;
    private String name;
    private FoodPreference foodPreference;
    private int age;
    private Sex sex;
    private KitchenStatus kitchen;
    private String kitchenStory;
    private double kitchenLongitude;
    private double kitchenLatitude;
    private Participant partner;
    private boolean isPaired;
    private int count_wg;
    private AgeRange ageRange;

    /**
     * Constructor for the Participant class that takes in several parameters.
     *
     * @param id                the participant's ID
     * @param name              the participant's name
     * @param foodPreference    the participant's food preference
     * @param age               the participant's age
     * @param sex               the participant's sex
     * @param kitchen           the participant's kitchen status
     * @param kitchenStory      the participant's kitchen story
     * @param kitchenLongitude  the participant's kitchen longitude
     * @param kitchenLatitude   the participant's kitchen latitude
     */
    public Participant(String id, String name, FoodPreference foodPreference, int age, Sex sex, KitchenStatus kitchen,
                       double kitchenStory, double kitchenLongitude, double kitchenLatitude) {
        this.id = id;
        this.name = name;
        this.foodPreference = foodPreference;
        this.age = age;
        this.sex = sex;
        this.kitchen = kitchen;
        this.kitchenStory = String.valueOf(kitchenStory);
        this.kitchenLongitude = kitchenLongitude;
        this.kitchenLatitude = kitchenLatitude;
        this.count_wg = 0;
        this.ageRange = calculateAgeRange();
    }

    // Getter and setter methods for participant information fields

    /**
     * Getter method for the participant's ID.
     *
     * @return  the participant's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Getter method for the participant's name.
     *
     * @return  the participant's name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for the participant's food preference.
     *
     * @return  the participant's food preference
     */
    public FoodPreference getFoodPreference() {
        return foodPreference;
    }

    /**
     * Getter method for the participant's age.
     *
     * @return  the participant's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter method for the participant's sex.
     *
     * @return  the participant's sex
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Getter method for the participant's kitchen status.
     *
     * @return  the participant's kitchen status
     */
    public KitchenStatus getKitchen() {
        return kitchen;
    }

    /**
     * Getter method for the participant's kitchen story.
     *
     * @return  the participant's kitchen story
     */
    public String getKitchenStory() {
        return kitchenStory;
    }

    /**
     * Getter method for the participant's kitchen longitude.
     *
     * @return  the participant's kitchen longitude
     */
    public double getKitchenLongitude() {
        return kitchenLongitude;
    }

    /**
     * Getter method for the participant's kitchen latitude.
     *
     * @return  the participant's kitchen latitude
     */
    public double getKitchenLatitude() {
        return kitchenLatitude;
    }
    /**
     * Getter method for the participant's partner.
     *
     * @return the participant's partner
     */
    public Participant getPartner() {
        return partner;
    }
    /**
     * Setter method for the participant's partner.
     *
     * @param partner   the participant's partner
     */
    public void setPartner(Participant partner) {
        this.partner = partner;
    }

    /**
     * Getter method for the participant's paired status.
     *
     * @return  true if the participant is paired, false otherwise
     */
    public boolean isPaired() {
        return isPaired;
    }

    /**
     * Setter method for the participant's paired status.
     *
     * @param isPaired  true if the participant is paired, false otherwise
     */
    public void setPaired(boolean isPaired) {
        this.isPaired = isPaired;
    }

    /**
     * Getter method for the participant's count of roommates.
     *
     * @return  the participant's count of roommates
     */
    public int getCount_wg() {
        return count_wg;
    }

    /**
     * Setter method for the participant's count of roommates.
     *
     * @param count_wg  the participant's count of roommates
     */
    public void setCount_wg(int count_wg) {
        this.count_wg = count_wg;
    }

    /**
     * Getter method for the participant's age range.
     *
     * @return  the participant's age range
     */
    public AgeRange getAgeRange() {
        return ageRange;
    }

    /**
     * Setter method for the participant's age range.
     *
     * @param ageRange  the participant's age range
     */
    public void setAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
    }

    /**
     * Method that calculates the participant's age range based on their age.
     *
     * @return  the participant's age range
     */
    public AgeRange calculateAgeRange() {
        if (this.age < 18) {
            return AgeRange.UNDER_18;
        } else if (this.age < 26) {
            return AgeRange.BETWEEN_18_AND_25;
        } else if (this.age < 36) {
            return AgeRange.BETWEEN_26_AND_35;
        } else if (this.age < 46) {
            return AgeRange.BETWEEN_36_AND_45;
        } else if (this.age < 56) {
            return AgeRange.BETWEEN_46_AND_55;
        } else {
            return AgeRange.ABOVE_55;
        }
    }

    /**
     * Returns a string representation of the Participant object.
     *
     * @return  a string representation of the Participant object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Participant{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", foodPreference=").append(foodPreference);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", kitchen=").append(kitchen);
        sb.append(", kitchenStory=").append(kitchenStory);
        sb.append(", kitchenLongitude=").append(kitchenLongitude);
        sb.append(", kitchenLatitude=").append(kitchenLatitude);
        if (isPaired) {
            sb.append(", partner=").append(partner.getName());
        }
        sb.append('}');
        return sb.toString();
    }
}

