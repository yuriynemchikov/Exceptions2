public class IncorrectDataInNameException extends RuntimeException{
    public IncorrectDataInNameException(String name) {
        super("Input a correct name: " + name);
    }
}
