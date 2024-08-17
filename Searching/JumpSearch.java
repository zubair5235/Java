import java.util.*;

public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21,
            34, 55, 89, 144, 233, 377, 610};
        Arrays.parallelSort(arr);
        System.out.println(findElement(arr, 55, (int)Math.sqrt(arr.length)));
    }

    public static boolean findElement(int[] arr, int target, int m){
        for(int i = 0; i < arr.length;) {
            if(arr[i] == target) {return true;}
            else if(arr[i] > target) {i -= m; return linearSearch(arr, target, i, i + m);}
            i += m;
        }
        return false;
    }

    public static boolean linearSearch(int[] arr, int target, int start, int end) {
        for(int i = start; i <= end; i++) {
            if(arr[i] == target) {return true;}
        }
        return false;
    }
}
