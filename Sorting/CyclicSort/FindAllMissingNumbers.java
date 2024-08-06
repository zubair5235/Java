package CyclicSort;

// LC - 448

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(findMissingNumbers(arr)));
    }

    public static Object[] findMissingNumbers(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length;){
            if(arr[i] == arr[arr[i] - 1]){
                i++;
            }
            else{
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                ans.add(i + 1);
            }
        }
        return ans.toArray();
    }
}
