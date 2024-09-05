package RPSgame;

public enum gameOperations {
    // Enum constants
    rock("R"), paper("P"), scissors("S");

    // Encalpsulation
    private String value;

    //Constructor to initialize the values
    GameOperations(String value) {
        this.value = value;
    }

    // Method to hold enum values
    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    // Static method to get an enum constant from a string value
    public static GameOperations fromValue(String value) {
        for (GameOperations op : GameOperations.values()) {
            if (op.value.equalsIgnoreCase(value)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

}
