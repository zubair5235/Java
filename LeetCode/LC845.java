// Valid Moutain Array

import java.util.*;

public class LC845{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(longestMoutainArray(arr));
    }

    public static int longestMoutainArray(int[] arr){
        if(arr.length < 3){
            return 0;
        }
        int maxSize = 0;
        int j = 3;                  // 2 1 4 7 3 2 5
        while(j <= arr.length){
            for(int i = 0; i < arr.length - j + 1; i++){
                int a = i;
                int temp[] = new int[j];
                for(int k = 0; k < j; k++){
                    temp[k] = arr[a++];
                }
                maxSize = Math.max(maxSize, isValidMoutainArray(temp));
            }
            j++;
        }
        return maxSize;
    }

    public static int isValidMoutainArray(int[] arr){
        if(arr.length < 3){
            return 0;
        }
        int i = 0;
        int j = arr.length - 1;
        while(i + 1 < arr.length - 1 && arr[i] < arr[i + 1]){
            i++;
        }
        while(j - 1 >= 1 && arr[j] < arr[j - 1]){
            j--;
        }
        if(i == j){
            return arr.length;
        }
        return 0;
    }
}