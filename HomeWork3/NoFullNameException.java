public class NoFullNameException extends Exception {
    public NoFullNameException(String[] name) {
        super("The name is not full");
    }
}
