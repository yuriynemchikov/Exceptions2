import java.nio.file.Files;
import java.nio.file.Path;

public class TaskDiv {

        public static void main(String[] args)  {

            readFile("dfvs");
        }

        public static Object getArray(Object[] arr, int i){
            if(arr[i] == null){
                throw new ArrayNullException(i);
            }
            return arr[i];
        }

        public static boolean readFile(String filename) {
            if (!Files.exists(Path.of(filename))){
                try {
                    throw new NoFileException(filename);
                } catch (NoFileException e) {
                    System.out.println(e.getMessage());
                }
            }
            return true;
        }

        public static int div(int a, int b) {
            if (b == 0){
                throw new DevByZeroException();
            }
            return a / b;
        }
}

