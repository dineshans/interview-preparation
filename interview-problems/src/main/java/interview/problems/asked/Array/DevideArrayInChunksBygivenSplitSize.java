package interview.problems.asked.Array;

import java.util.ArrayList;
import java.util.List;

public class DevideArrayInChunksBygivenSplitSize {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        divideArrayInChunks(arr, 3);

    }

    public static void divideArrayInChunks(int[] arr, int K){

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            temp.add(arr[i]);
            if((i+1) % K == 0){
                resultList.add(temp);
                temp = new ArrayList<>();
            }

        }

        if(!temp.isEmpty()){
            int a = temp.size();
            while(a != K){
                temp.add(0);
                a++;
            }
            resultList.add(temp);
        }

        resultList.stream().forEach(System.out::println);
    }
}
