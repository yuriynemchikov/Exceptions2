public class Task2 {

    public static void main(String[] args) {
        String[][] str = {{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"}};

        System.out.println(str.length);
        sum2d(str);

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
