package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 10, 11, 14, 16, 18};
        int num = 8;
        System.out.println(findFloor(arr, num));
    }
    
    public static int findFloor(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == num){
                return arr[mid];
            }
            else if(arr[mid] < num){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
}

