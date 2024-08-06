package CyclicSort;

// LC - 268

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(findNumber(arr));
    }

    public static int findNumber(int[] arr){
        for(int i = 0; i < arr.length;){
            if(arr[i] == i || arr[i] == arr.length){
                i++;
            }
            else{
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i){
                return arr[i];
            }
        }
        return arr.length;
    }
}
