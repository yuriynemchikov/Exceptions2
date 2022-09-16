import java.util.List;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(List<String> list) {
        super("Data is not correct in: " + list);
    }
}
