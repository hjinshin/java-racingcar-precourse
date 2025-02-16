package validator;

public interface CustomValidator<T> {
    String ERROR_HEADER = "[ERROR] ";

    void validate(T param);

    default void throwError(String errorMessage) {
        throw new IllegalArgumentException(ERROR_HEADER + errorMessage);
    }
}
