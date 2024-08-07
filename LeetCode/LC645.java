// Set MisMatch  //Not Completed

import java.util.*;

public class LC645{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(findErrorNum(nums));
    }

    public static ArrayList<Integer> findErrorNum(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                ans.add(nums[i + 1]);
                ans.add(nums[i + 1] + 1);
            }
        } 
        return ans;
    }
}