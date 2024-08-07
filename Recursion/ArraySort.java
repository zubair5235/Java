// Check Whether the array is sorted or not

import java.util.*;

public class ArratSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(0, arr));
    }

    public static boolean isSorted(int i, int[] arr){
        if(i == arr.length - 1){
            return true;
        }
        
        if(arr[i] < arr[i + 1]){
            return isSorted(i + 1, arr);
        }

        else{
            return false;
        }
       /* if(i == arr.length - 1){
          return true;
       }

       return arr[i] < arr[i + 1] && isSorted(i + 1, arr); */
    }
}
