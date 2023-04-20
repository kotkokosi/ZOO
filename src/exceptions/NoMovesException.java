package exceptions;

public class NoMovesException extends RuntimeException{
    public NoMovesException(String message) {
        super(message);
    }
}
