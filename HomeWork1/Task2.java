public class Task2 {

    // 1. ArrayIndexOutOfBoundsException - при переборе по столбцам.
    // 2. NumberFormatException - если при инициализации массива неверно прописаны числа.
    // 3. NullPointerException - если задан массив null.

    public static void main(String[] args) {
        String[][] str = {
                {"1","2","3"},
                {"1","2","3"},
                {"1","2","3"}};

        System.out.println(str.length);
        sum2d(str);

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
