// Find All Good Indices

import java.util.*;

public class LC2420{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(goodIndices(arr, k));
    }

    public static List<Integer> goodIndices(int arr[], int k){
        List<Integer> ans = new ArrayList<>();
        if(arr.length == 0){
            return ans;
        }
        for(int i = k; i < arr.length - k; i++){
            int a = 0;
            ArrayList<Integer> temp1 = new ArrayList<>(); 
            ArrayList<Integer> temp2 = new ArrayList<>(); 
            for(int j = i - k; j < i; j++){
                temp1.add(arr[j]);
            }
            a = 0;
            for(int l = i + 1; l < i + 1 + k; l++){
                temp2.add(arr[l]);
            }
            System.out.println(temp1);
            System.out.println(temp2);
            if(isDecreasing(temp1) && isIncreasing(temp2)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean isDecreasing(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size() - 1; i++){
            if(arr.get(i) < arr.get(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size() - 1; i++){
            if(arr.get(i) > arr.get(i + 1)){
                return false;
            }
        }
        return true;
    }

}
