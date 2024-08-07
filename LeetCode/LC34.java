import java.util.*;

public class LC34{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        searchRange(arr, target);
    }
    public static int[] searchRange(int[] nums, int target){
        int ans[] = new int[2];
        Arrays.fill(ans, -1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans[0] = i;
                break;
            }
        }
        for(int j = nums.length -1; j >= 0; j--){
            if(nums[j] == target){
                ans[1] = j;
                break;
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
        return ans;
    }
}