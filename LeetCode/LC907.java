// Sum of Minimum Subarrays

import java.util.*;

public class LC907{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(sum(nums));
    }

    public static int sum(int[] nums){
        if(nums.length < 3){
            Arrays.sort(nums);
            return nums[0];
        }
        int sum = 0;
        int arrSize = nums.length;
        int j = 1;
        while(j <= arrSize){
            for(int i = 0; i < nums.length - j + 1; i++){
                int a = i;
                int sub[] = new int[j]; 
                for(int k = 0; k < j; k++){
                    sub[k] = nums[a++];
                }     
                sum += add(sub); 
            }
            j++;
        }
        return sum;
    }

    public static int add(int[] sub){
        Arrays.sort(sub);
        return sub[0];
    }
}