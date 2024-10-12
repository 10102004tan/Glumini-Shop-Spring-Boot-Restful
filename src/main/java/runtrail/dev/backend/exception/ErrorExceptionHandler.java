package runtrail.dev.backend.exception;

public class ErrorExceptionHandler extends RuntimeException {
    private int statusCode;
    public ErrorExceptionHandler(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
