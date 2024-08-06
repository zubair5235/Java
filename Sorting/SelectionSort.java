
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15, 1, 61, 6, 91, 100};
        System.out.println(Arrays.toString(sort(arr)));
    }

    /* public static int[] sort(int[] arr){
        int k = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            int max = Integer.MIN_VALUE;
            int maxInd = -1;
            for(int j = 0; j < arr.length - i; j++){
                if(max < arr[j]){
                    max = arr[j];
                    maxInd = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[maxInd];
            arr[maxInd] = temp;
            k--;
        }
        return arr;
    } */

    public static int[] sort (int[] arr) {
        int i = arr.length - 1;
        for (int j = 0; j < arr.length; j++) {
            int maxElement = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int k = 0; k < arr.length - j; k++) {
                if(maxElement < arr[k]) {
                    maxElement = arr[k];
                    maxIndex = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            i--;
        }
        return arr;
    }
}
