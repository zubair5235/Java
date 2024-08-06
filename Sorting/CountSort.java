import java.util.*;

public class CountSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxElement = Integer.MIN_VALUE;
        for (int nums : arr) {
            maxElement = Math.max(maxElement, nums);
        }
        int[] freqArr = new int[maxElement + 1];
        for (int nums : arr) {
            freqArr[nums]++;
        }
        int k = 0;
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 0) {
                for (int j = 0; j < freqArr[i]; j++) {
                    arr[k++] = i;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(freqArr));
    }
}