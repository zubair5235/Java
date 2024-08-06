import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int endInd = removeDups(arr);
        for (int i = 0; i < endInd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDups(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : nums) {
            if (!list.contains(number)) {
                list.add(number);
            }
        }
        nums = list.stream().mapToInt(i -> i).toArray();
        return list.size();
    }
}