package lesson20Exception;

public class DmdevException extends RuntimeException {

    public DmdevException(String message) {
        super(message);
    }

    public DmdevException(Throwable cause) {
        super(cause);
    }
}