package racingcar.model.constants;

public enum Rule {
    DELIMITER(",", 0),

    CAR_MIN_LENGTH("1", 1),
    CAR_MAX_LENGTH("5", 5),

    TRIAL_MIN_LENGTH("1", 1),

    RANDOM_MIN_SIZE("0", 0),
    RANDOM_MAX_SIZE("9", 9),
    MOVE_VALUE("4", 4),

    SEPARATOR(" : ", 0),
    MOVEMENT("-", 1),
    STOP("", 0);

    private final String message;
    private final int value;

    Rule(String message, int value) {
        this.message = message;
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public int getValue() {
        return value;
    }
}