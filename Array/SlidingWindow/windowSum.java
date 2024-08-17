import java.util.*;

public class windowSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int windowSize = sc.nextInt();
        System.out.println(Arrays.toString(findSum(arr, windowSize)));
        System.out.println(Arrays.toString(findSum(windowSize, arr)));
    }


    //Aproach 1
    public static int[] findSum(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        for (int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            ans[i] = sum;
        }
        return ans;
    }

    //Aproach 2
    public static int[] findSum(int k, int[] arr) {
        int[] ans = new int[arr.length - k + 1];
        int sum = sumArray(arr, 0, k - 1);
        ans[0] = sum;
        int left = 1;
        int right = k;
        while (right < arr.length) {
            sum -= arr[left - 1];
            sum += arr[right];
            ans[left] = sum;
            left++;
            right++;
        } 
        return ans;
    }

    public static int sumArray(int[] arr, int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}