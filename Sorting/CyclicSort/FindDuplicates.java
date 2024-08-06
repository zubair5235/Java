package CyclicSort;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 8, 6};
        System.out.println(findDuplicate(arr));
    }

    public static List<Integer> findDuplicate(int[] arr){
        List<Integer> ans = new ArrayList<>();
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
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
