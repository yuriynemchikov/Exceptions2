public class Task3 {
    public static void main(String[] args) {
        int[] arr2 = {1,2,3,4,5};
        int[] arr1 = {1,1,1,1,1,1};

        int[] arr3 = subOfArrays(arr1, arr2);
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] subOfArrays(int[] arr1, int[] arr2){
        int[] subArr = new int[arr1.length];

        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        else{

            for (int i = 0; i < arr1.length; i++){
                subArr[i] = arr2[i] - arr1[i];
            }
        }
        return subArr;
    }

}
