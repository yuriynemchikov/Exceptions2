public class InvalidDateException extends RuntimeException{
    public InvalidDateException(String message) {
        super("Invalid date format");
    }
}
