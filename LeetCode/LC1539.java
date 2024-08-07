// Kth missing positive integer

import java.util.*;

public class LC1539{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(findMissingInteger(arr, k));
    }

    public static int findMissingInteger(int[] arr, int k){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            nums.add(arr[i]);
        }
        ArrayList<Integer> missingNums = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            missingNums.add(i);
        }
        missingNums.removeAll(nums);
        return missingNums.get(k - 1);
    }
}