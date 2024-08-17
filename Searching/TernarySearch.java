import java.util.*;

// Time Complexity : O(log n), Space Complexity : O(1)

public class TernarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        Arrays.parallelSort(arr);
        System.out.println(findElement(arr, -10));
    }

    public static boolean findElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            if(target == arr[mid1] || target == arr[mid2]) {return true;}
            else if(target < arr[mid1]) {end = mid1 - 1;}
            else if(target > arr[mid1] || target < arr[mid2]) {start = mid1 + 1; end = mid2 - 1;}
            else {start = mid2 + 1;}
        }
        return false;
    }
}
