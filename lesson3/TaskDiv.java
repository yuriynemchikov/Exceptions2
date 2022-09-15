public class TaskDiv {

        public static void main(String[] args) {

            Object[] array = {1,4,2,null,7,1};
            getArray(array, 3);
        }

        public static Object getArray(Object[] arr, int i){
            if(arr[i] == null){
                throw new ArrayNullException(i);
            }
            return arr[i];
        }

        public static int div(int a, int b) {
            if (b == 0){
                throw new DevByZeroException();
            }
            return a / b;
        }
}

