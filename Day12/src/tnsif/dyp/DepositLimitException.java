package tnsif.dyp;

public class DepositLimitException extends RuntimeException {
    public DepositLimitException() {
        super();
    }

    public DepositLimitException(String message) {
        super(message);
    }
}
