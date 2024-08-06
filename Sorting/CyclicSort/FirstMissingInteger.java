package CyclicSort;

import java.util.*;

public class FirstMissingInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        System.out.println(findMissingInteger(arr));
    }

    public static int findMissingInteger(int[] arr){
        for(int i = 0; i < arr.length;){
            int correct = arr[i] - 1;
            if(arr[i] <= 0 || arr[i] > arr.length || arr[i] == arr[correct]){
                i++;
            }
            else{
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
