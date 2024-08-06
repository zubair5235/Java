
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 15, 6, 61, 91, 100};
        System.out.println(Arrays.toString(sort(arr)));
    }

    /* public static int[] sort (int[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    } */


    // 03-08-2024
    public static int[] sort (int[] arr) {
        int swapCount = 0;
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
            if (!swapped) {System.out.println("breaked"); break;}
        }
        System.out.println(swapCount);
        return arr;
    }
}
