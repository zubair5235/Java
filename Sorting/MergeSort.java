
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 7, 1, 7, 8, 6};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mergedArray[k++] = left[i];
                i++;
            }
            else{
                mergedArray[k++] = right[j];
                j++;
            }
        }
        while(i < left.length){
            mergedArray[k++] = left[i++];
        }
        while(j < right.length){
            mergedArray[k++] = right[j++];
        }
        return mergedArray;
    }
}
