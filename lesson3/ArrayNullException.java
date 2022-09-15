public class ArrayNullException extends RuntimeException {
    public ArrayNullException(int i) {
        super("array [" + i + "] = null");
    }
}
