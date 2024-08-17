import java.util.*;

public class InterPolation {
    public static void main(String[] args) {
        int arr[] = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        Arrays.parallelSort(arr);
        System.out.println(findElement(arr, 56));
    }

    public static boolean findElement(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi && arr[lo] <= target && arr[hi] >= target) {
            int pos = lo + (((target - arr[lo]) * (lo - hi)) / (arr[lo] - arr[hi]));
            if(arr[pos] == target) {return true;}
            else if(arr[pos] < target) {lo = pos + 1;}
            else {hi = pos - 1;}
        }
        return false;
    }
}
