package BinarySearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 48},
                {33, 36, 39, 50}};
        int target = 50;
        System.out.println(Arrays.toString(findElement(arr, target)));
    }

    public static int[] findElement(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;
        while(r < arr.length && c > 0){
            if(arr[r][c] == target){
                return new int[]{r, c};
            }
            if(arr[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}
