import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        String[][] array = {{"1", "1", "1.43cdsa", "1", "2"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            System.out.println(getArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        List<String> list = new ArrayList<>();

        if (arr.length != 4) {
            throw new MyArraySizeException(arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException(arr[i].length);
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (isNumeric(arr[i][j])) {
                    sum += Integer.parseInt(arr[i][j]);
                }
                else{
                    list.add("(" + i + "," + j + ")");
                }
            }
        }
        if (!list.isEmpty()) {
            throw new MyArrayDataException(list);
        }
        return sum;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
}
