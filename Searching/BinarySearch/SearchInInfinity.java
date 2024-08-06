package BinarySearch;

public class SearchInInfinity {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 12, 15, 19, 20, 21, 28, 31, 63, 74, 81, 100, 101, 110, 113, 201, 312, 411, 514, 561, 615, 761, 1315, 1561, 6130, 15639, 651912};
        int target = 101;
        System.out.println(findElement(arr, target));
    }

    public static int findElement(int[] arr, int target){
        int[] ans = findStartandEnd(arr, target);
        int start = ans[0];
        int end = ans[1];
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

    public static int[] findStartandEnd(int[] arr, int target){
        int ans[] = new int[2];
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newStart = end + 1;
            end = end * (end - start + 1) * 2;
            start = newStart;
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
}
