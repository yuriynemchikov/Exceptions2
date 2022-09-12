public class Task1{
    public static void main(String[] args) {

        arr();
    }

    // ArithmeticException
    public static void division(){
        int a = 10 /0;
    }

    // ClassCastException
    public static void castEx(){
        Object obj = "5";
        int b = (Integer)obj;
    }

    // ArrayIndexOutOfBoundsException
    public static void arr(){
        int[] ints = new int[10];
        ints[11] = 1;
    }

}