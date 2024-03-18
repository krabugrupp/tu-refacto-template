package ee.tu.app.errors;

public class TuAppServiceException extends RuntimeException {


    private String error;

    public TuAppServiceException(String error, String message) {
        super(message);
        this.error = error;
    }

    public TuAppServiceException(String error, String message, Throwable cause) {
        super(message, cause);
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
