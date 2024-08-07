// Relative Sort Array

import java.util.*;

public class LC1122{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        relativeSort(arr1, arr2);
    }

    public static void relativeSort(int[] arr1, int[] arr2){
        int a = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    int temp = arr1[j];
                    arr1[j] = arr1[a];
                    arr1[a] = temp;
                    a++;
                }
            }
        }
        int constant = a;
        int temp[] = new int[arr1.length - a];
        for(int i = 0; i < temp.length; i++){
            temp[i] = arr1[a++];
        }
        Arrays.sort(temp);
        int b = 0;
        for(int i = constant; i < arr1.length; i++){
            arr1[i] = temp[b++];
        }
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}