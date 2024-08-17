import java.util.*;

public class FindMax {
    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 6, 10, 2};
        System.out.println(findMaxElement(arr, 0, arr.length - 1));
    }

    public static int findMaxElement(int[] arr, int start, int end) {
        if(start > end) {return Integer.MIN_VALUE;}
        
        if(start == end) {return arr[start];}

        int mid = start + end / 2;

        int leftMax = findMaxElement(arr, start, mid);
        int rightMax = findMaxElement(arr, mid + 1, end);

        return Math.max(leftMax, rightMax);
    }
}