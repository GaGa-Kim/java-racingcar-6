package racingcar.model.constants;

public enum Error {
    NON_COMMA("잘못된 값을 입력했습니다. (쉼표가 없습니다.)"),
    LENGTH_INVALID("잘못된 값을 입력했습니다. (이름은 5자 이하만 가능합니다.)"),
    DUPLICATE("잘못된 값을 입력했습니다. (이름이 중복되었습니다.)");

    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}