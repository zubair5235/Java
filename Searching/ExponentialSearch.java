import java.util.*;

public class ExponentialSearch {
    public static void main(String[] args) {
        int arr[] = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        Arrays.parallelSort(arr);
        System.out.println(findElement(arr, -56));
    }

    public static boolean findElement(int[] arr, int target){
        if(arr[0] == target) {return true;}
        int end = 1;
        while(end < arr.length && arr[end] < target) {
            end = end * 2;
        }
        int ans = Arrays.binarySearch(arr, end / 2, Math.min(end, arr.length - 1), target);
        return ans > 0 ? true : false;
    }
}
