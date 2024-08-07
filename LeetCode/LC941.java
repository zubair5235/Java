// Valid Mountain Array

import java.util.*;

public class LC941{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(validMountainArray(arr));
    }
    
    public static boolean validMountainArray(int[] arr){
        if(arr.length < 3){
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]){
            l++;
        }
        while(r - 1 >= 1 && arr[r] < arr[r - 1]){
            r--;
        }
        return l == r;
    }
}