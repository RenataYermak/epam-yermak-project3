package by.epam.yermak.task1.exception;

public class NoSuchNumberException extends  Exception{
    private String message;

    public NoSuchNumberException() {
    }

    public NoSuchNumberException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public NoSuchNumberException(String message) {
        super(message);
        this.message = message;
    }

    public NoSuchNumberException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
