public class Task4 {
    public static void main(String[] args) {

        int[] arr1 = {1,1,1,1,1};
        int[] arr2 = {1,2,3,4,5};

        int[] arr3 = divArrays(arr1, arr2);
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] divArrays(int[] a, int[] b){
        int[] subArr = new int[a.length];

        if (a.length != b.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        else{

            for (int i = 0; i < a.length; i++){
                if (a[i] == 0){
                    throw new RuntimeException("Деление на ноль невозможно");
                }
                else subArr[i] = b[i] / a[i];
            }
        }
        return subArr;
    }
}
