import java.util.*;

public class LC268 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findMissingInteger(nums));
    }

    public static int findMissingInteger(int[] nums){
        int[] newArr = new int[nums.length + 1];
        for(int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            if (nums[i] <= 0 || nums[correct] == nums[i]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}