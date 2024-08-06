package BinarySearch;

public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findElement(arr, target));
    }

    public static int findElement(int[] arr, int target){
        int pivotInd = findPivot(arr);
        if(pivotInd == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        else{
            int ans = binarySearch(arr, target, 0, pivotInd);
            return ans  >= 0 ? ans : binarySearch(arr, target, pivotInd + 1, arr.length - 1);
        }
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
