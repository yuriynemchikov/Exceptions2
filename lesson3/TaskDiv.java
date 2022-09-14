public class TaskDiv {

        public static void main(String[] args) {
            int c = div(9, 0);
            System.out.println(c);
        }

        public static int div(int a, int b) {
            if (b == 0){
                throw new DevByZeroException();
            }
            return a / b;
        }
}

