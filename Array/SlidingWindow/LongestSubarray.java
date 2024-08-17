import java.util.*;                 // SubArray : consicutive sub Array of an array

public class LongestSubarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(find(arr, k));
    }

    public static ArrayList<ArrayList<Integer>> find (int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (arr.length == 1)  {if (arr[0] <= k) {ArrayList<Integer> li = new ArrayList<>(); li.add(arr[0]); ans.add(li); return ans;}}
        int sum = 0;
        for(int i = 0; i < arr.length;) {
            for(int j = )
        }
    }
}