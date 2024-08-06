
// Time Complexity : O(N), Space Complexity : O(1)

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        System.out.println(findIndex(arr, 56));
    }

    public static int findIndex(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
