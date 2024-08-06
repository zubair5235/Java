package recursion;

// Time Complexity : O(N), Space Complexity : O(1)

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        System.out.println(findIndex(arr, 56, 0));
    }

    public static int findIndex(int[] arr, int element, int currentIndex){
        if(currentIndex == arr.length){
            return -1;
        }
        if(arr[currentIndex] == element){
            return currentIndex;
        }

        return findIndex(arr, element, currentIndex + 1);
    }
}

