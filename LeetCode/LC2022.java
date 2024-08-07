// Convert 1D to 2D

import java.util.*;

public class LC2022{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        construct2DArray(arr,m,l);
    }

    public static void construct2DArray(int[] arr, int m, int n){
        if(arr.length != m * n){
            System.out.print("Can't construct 2D Array");
            return;
        }
        int k = 0;
        int tarr[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                tarr[i][j] = arr[k++];
            }
        }
    }
}