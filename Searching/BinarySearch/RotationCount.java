package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(findRotationCount(arr));
    }

    public static int findRotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return (mid + 1) % arr.length;
            }
            else if(arr[mid] < arr[mid - 1]){
                return ((mid - 1) + 1) % arr.length;
            }
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return 0;
    }
}
