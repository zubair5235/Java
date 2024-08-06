import java.util.*;

public class Temp {
    public static void main (String args[]) {
        int[] arr = {1, 4, 3, 2, 5, 6, 41, 13, 65, 900, 123, 61, 76, 412, 5412};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        if(arr.length <= 10) {return insertionSort(arr);}
        else {
            if(arr.length == 1) {return arr;}
            int mid = arr.length / 2;

            int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
    
            return merge(left, right);
        }
    }

    public static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i, j, k;
        i = j = k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {ans[k++] = left[i++];}
            else {ans[k++] = right[j++];}
        }
        while (i < left.length) {
            ans[k++] = left[i++];
        }   
        while (j < right.length) {
            ans[k++] = right[j++];
        }
        return ans;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }
}