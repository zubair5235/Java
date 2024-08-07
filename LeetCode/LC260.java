import java.util.*;

public class LC260{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        singleNumber(arr);
    }
    public static int[] singleNumber(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> dup = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                dup.add(nums[i]);
            }
        }
        set.clear();
        set.addAll(dup);
        int empty[] = new int[2];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                empty[j] = nums[i];
                j++;
            }
        }
        return empty;
    }
}