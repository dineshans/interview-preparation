package interview.problems.asked.Array;

public class RotateArrayByKPosition {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
        int k = 2;

        //int[] resultArr = rotateArray(arr, k);

        int[] resultArr = bruteForceApproach(arr, k);

        System.out.print("[ ");
        for(int i = 0; i < resultArr.length; i++){
            System.out.print(resultArr[i] + " ");
        }
        System.out.print(" ]");
    }

    // Using temp array
    public static int[] rotateArray(int[] arr, int k){

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {

            temp[(i+k) % arr.length] = arr[i];
        }

        return temp;
    }

    public static int[] bruteForceApproach(int[] arr, int k){

        for(int i = 0; i < k; i++){

            int previous = arr[arr.length-1];

            for (int j = 0; j < arr.length; j++) {
                int temp = arr[j];
                arr[j] = previous;
                previous = temp;
            }
        }

        return arr;
    }
}
