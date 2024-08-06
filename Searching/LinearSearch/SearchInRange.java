package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        System.out.println(findIndex(arr, 56, 3, 6));
    }

    public static int findIndex(int[] arr, int element, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
