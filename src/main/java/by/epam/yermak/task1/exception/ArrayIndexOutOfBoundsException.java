package by.epam.yermak.task1.exception;

public class ArrayIndexOutOfBoundsException extends Exception{
    private String message;

    public ArrayIndexOutOfBoundsException() {
    }

    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
        this.message = message;
    }

    public ArrayIndexOutOfBoundsException( Throwable cause) {
        super(cause);
    }

    public ArrayIndexOutOfBoundsException(String message, Throwable cause) {
        super(message,cause);
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
