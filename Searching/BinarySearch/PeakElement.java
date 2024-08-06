package BinarySearch;

import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
        }
        return end; // if we want index of the peak element then it is start the one we have to return
    }
}
