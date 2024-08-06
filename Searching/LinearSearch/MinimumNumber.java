package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            min = Math.min(min, i);
        }
        return min;
    }
}
