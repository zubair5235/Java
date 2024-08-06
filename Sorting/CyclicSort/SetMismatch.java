package CyclicSort;

import java.util.*;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findDup(arr)));
    }

    public static Object[] findDup(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
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
                ans.add(i + 1);
                break;
            }
        }
        return ans.toArray();
    }
}
