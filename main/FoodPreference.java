/**

 This enum represents the different types of food preferences that participants can have.
 */
package main;
public enum FoodPreference {
    MEAT("MEAT"),
    NONE("NONE"),
    VEGAN("VEGAN"),
    VEGGIE("VEGGIE");
    private final String name;

    /**
     * Constructor for FoodPreference enum.
     * @param name the name of the food preference
     */
    FoodPreference(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the food preference.
     * @return the name of the food preference
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the FoodPreference enum constant with the specified name.
     * @param name the name of the food preference
     * @return the FoodPreference enum constant with the specified name
     * @throws IllegalArgumentException if there is no constant with the specified name
     */
    public static FoodPreference fromName(String name) {
        for (FoodPreference fp : values()) {
            if (fp.name.equalsIgnoreCase(name)) {
                return fp;
            }
        }
        throw new IllegalArgumentException("No constant with name " + name);
    }
}