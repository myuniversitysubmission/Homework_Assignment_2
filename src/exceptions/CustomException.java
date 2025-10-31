package exceptions;

/**
 * Custom exception class used to demonstrate user-defined exceptions.
 * This can be thrown when a specific application condition is violated.
 */
public class CustomException extends Exception {

    /**
     * Constructor with only a message.
     * @param message explanation of the exception
     */
    public CustomException(String message) {
        super(message);
    }

    /**
     * Constructor with both message and cause.
     * @param message explanation of the exception
     * @param cause the original cause of this exception
     */
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
