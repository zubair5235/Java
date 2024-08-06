package recursion;

// Time Complexity : O(log n) Space Complexity : O(log n)

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        Arrays.parallelSort(arr);
        System.out.println(findElement(arr, 56, 0, arr.length - 1));
    }

    public static boolean findElement(int[] arr, int element, int start, int end){
        if(start > end){
            return false;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == element){
            return true;
        }
        else if(arr[mid] > element){
            return findElement(arr, element, start, mid - 1);
        }
        else{
            return findElement(arr, element, mid + 1, end);
        }
    }
}
