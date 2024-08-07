// Remove duplicates from sorted array II

import java.util.*;

public class LC80{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
        for(int i : arr){
            System.out.print(i + " ");          // 1 1 2 2 3 1
        }
    }

    public static int removeDuplicates(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length - 1;){
            for(int j = i + 1; j < nums.length;){
                if(nums[i] == nums[j] && (j - i == i + 1)){
                    j++;
                }
                else if(nums[i] == nums[j] && (i != j)){
                    rotateArray(nums, j);
                    break;
                }
                else{
                    i++;
                    break;
                }
            }
        }
        return count;
    }

    public static void rotateArray(int[] arr, int firstInd){
        for(int i = firstInd; i < arr.length - 1; i++){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}