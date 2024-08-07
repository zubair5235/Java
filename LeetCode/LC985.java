// Sum of Even Number after queries

import java.util.*;

public class LC985{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int queries[][] = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                queries[i][j] = sc.nextInt();
            }
        }
        System.out.println(sumEvenAfterQueries(arr, queries));
    }

    public static ArrayList<Integer> sumEvenAfterQueries(int arr[], int[][] queries){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < queries.length; i++){
            arr[queries[i][1]] += queries[i][0];
            ans.add(sumEven(arr));
        }
        return ans;
    }

    public static int sumEven(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
