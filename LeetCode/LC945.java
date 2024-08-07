// Minimum Increment to Make Array Unique

import java.util.*;

public class LC945{
    static int count = 0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(minimumIncrementForUnique(arr));
    }

    public static int minimumIncrementForUnique(int[] nums){
        if(nums.length == 0){
            return count;
        }                                                        
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                int newValue = nums[i - 1] + 1;
                count += newValue - nums[i];
                nums[i] = newValue;
            }
        }
        return count;
    }
}