package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 10, 11, 14, 16, 18};
        int num = 15;
        System.out.println(findCeiling(arr, num));
    }

    public static int findCeiling(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == num){
                return arr[mid];
            }
            else if(arr[mid] > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
