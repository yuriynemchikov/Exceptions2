public class NoFileException extends Exception {
    public NoFileException(String path) {
        super("File not found: " + path);
    }
}
