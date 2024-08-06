
// LC 1095

import static BinarySearch.PeakElement.findPeak;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findMinInd(arr, target));
    }

    public static int findMinInd(int[] arr, int target){
        int peakInd = findPeak(arr);
        int start = 0;
        int end = peakInd;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        start = peakInd;
        end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
