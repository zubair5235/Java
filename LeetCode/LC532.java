// K-Diff pairs in an Array

import java.util.*;

public class LC532{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        } 
        int k = sc.nextInt();
        System.out.print(findKDiffPairs(arr, k));
    }

    public static int findKDiffPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        HashSet<Integer> checked = new HashSet<>();
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k && (!checked.contains(nums[i]) || !checked.contains(nums[j]))){
                    count++;
                    checked.add(nums[i]);
                    checked.add(nums[j]);
                }
            }
        }
        return count;
    }
}