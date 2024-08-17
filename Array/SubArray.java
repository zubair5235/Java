import java.util.*;

public class SubArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(generateSubArrays(arr));
    }

    public static ArrayList<ArrayList<Integer>> generateSubArrays(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.length == 1) {
            ArrayList<Integer> li = new ArrayList<>();
            li.add(arr[0]);                          // 1 2 3 4 5 6 
            ans.add(li);                          
            return ans;
        }

        /* for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ArrayList<Integer> li = addElements(arr, i, j);
                ans.add(li);
            }
        } */
       
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j <= arr.length; j++) {
                int[] sub = Arrays.copyOfRange(arr, i, j);
                ArrayList<Integer> li = new ArrayList<>();
                for (int num : sub) {
                    li.add(num);
                }
                ans.add(li);
            }
        }

        return ans;
    }

    /* public static ArrayList<Integer> addElements(int[] arr, int start, int end) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            ans.add(arr[i]);
        }
        return ans;
    } */
}