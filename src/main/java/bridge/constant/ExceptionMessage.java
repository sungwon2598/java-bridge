package bridge.constant;

public enum ExceptionMessage {
    INVALID_NUMBER("3 -20범위에 맞는 숫자를 입력해주세요"),
    PLEASE_INPUT_RORQ("R혹은 Q만 입력해주세요"),
    PLEASE_INPUT_UORD("U혹은 D만 입력해주세요");
    private static final String FIRST_MESSAGE = "[ERROR] ";
    private final String message;

    ExceptionMessage(String message) {
        this.message = FIRST_MESSAGE + message;
    }

    public String getMessage() {
        return message;
    }
}
