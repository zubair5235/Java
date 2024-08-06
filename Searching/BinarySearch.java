import java.util.*;

// Time Complexity : O(log n), Space Complexity : O(1)

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        Arrays.parallelSort(arr);
        System.out.println(findElement(arr, 56));
    }

    public static boolean findElement(int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == element){
                return true;
            }
            else if(arr[mid] > element){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
