public class Task2 {
    public static void main(String[] args) {
        int[] ints = {2,4,1,6,4,7};
        int d = 0;
        method(d,ints);

    }

    public static void method(int d, int[] intArray) {

        int index = 1;
        if(index < intArray.length){
            if(d!=0) {
                double catchedRes1 = intArray[index] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
            else throw new RuntimeException("На ноль делить нельзя");
        }
        else throw new RuntimeException("Индекс больше длины массива");
    }
}
