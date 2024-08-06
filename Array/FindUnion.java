import java.util.*;

public class FindUnion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(unionOf(arr1, arr2));
    }

    public static List<Integer> unionOf(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        for (int i : arr1) {
            if (!ans.contains(i)) {
                ans.add(i);
            }
        }
        for (int j : arr2) {
            if (!ans.contains(j)) {
                ans.add(j);
            }
        }
        return ans;
    }
}