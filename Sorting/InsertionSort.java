
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {15, 1, 61, 6, 91, 100};
        System.out.println(Arrays.toString(sort(arr)));
    }

    /* public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int j = i + 1;
            while(j > 0){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
                j--;
            }
        }
        return arr;
    } */

    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while(j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                j--;
            }
        }
        return arr;
    }
}
