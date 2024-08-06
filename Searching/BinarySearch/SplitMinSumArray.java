package BinarySearch;

// LC 410

import java.util.Arrays;

public class SplitMinSumArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        int m = 2;
        System.out.println(minArraySum(arr, m));
    }

    public static int minArraySum(int[] arr, int m){
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i : arr){
            start = Math.max(start, i);
            end += i;
        }
        while(start < end){
            int mid = start + (end - start) / 2;
            int pieces = findPieces(arr, mid);
            if(pieces > m){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

    public static int findPieces(int[] arr, int mid){
        int count = 1;
        int i = 0;
        int sum = 0;
        for(int num : arr){
            if(sum + num > mid){
                sum = num;
                count++;
            }
            else{
                sum += num;
            }
        }
        return count;
    }
}
