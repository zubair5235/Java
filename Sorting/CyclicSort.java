
import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length;){
            int correct = arr[i] - 1;
            if(arr[i] <= 0 || arr[i] == arr[correct]){
                i++; 
            }
            else{
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}


