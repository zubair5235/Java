// Maximum Subarray Sum

import java.util.*;

public class LC53{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums){
        if(nums.length < 2){
            return nums[0];
        }
        int sum = Integer.MIN_VALUE;
        int i = 1;
        while(i <= nums.length){
            for(int j = 0; j < nums.length - i + 1; j++){ //-2 -1
                int subSum = 0;
                int a = j;
                int sub[] = new int[i];
                for(int k = 0; k < i; k++){
                    sub[k] = nums[a++];
                }
                subSum += add(sub);
                sum = Math.max(subSum, sum);
            }
            i++;
        }
        return sum;
    }

    public static int add(int[] arr){
        if(arr.length < 2){
            return arr[0];
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}