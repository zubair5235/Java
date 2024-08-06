// Order Agnostic Binary Search is nothing but binary search works with respect to Arrays sorted order

import java.util.Arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {56, 45, 34, 33, 21, 10, 7, 4, 1};
        System.out.println(findElement(arr, 56));
    }

    public static int findElement(int[] arr, int element){
        boolean isAscending = arr[0] < arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;
        while(start  <= end){
            int mid = start + (end - start) / 2;
            if(isAscending){
                if(arr[mid] == element){
                    return 1;
                }
                else if(arr[mid] > element){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(arr[mid] == element){
                    return 1;
                }
                else if(arr[mid] > element){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return 0;
    }
}

