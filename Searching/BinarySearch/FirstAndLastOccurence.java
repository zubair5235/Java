package BinarySearch;

// LC - 34

import java.util.*;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(findElements(arr, target));
    }

    public static List<Integer> findElements(int[] arr, int target){
        List<Integer> ans = new ArrayList<>();
        if(arr.length == 0){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        int ind = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ind = mid;
                end = mid - 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        ans.add(ind);
        ind = -1;
        start = 0;
        end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ind = mid;
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        ans.add(ind);
        return ans;
    }
}
