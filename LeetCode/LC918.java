// Maximum sum Circular subarray

import java.util.*;

public class LC918{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] arr){
        int sum = 0;
        ArrayList<Integer> i = new ArrayList<>();
        ArrayList<Integer> j = new ArrayList<>();
        for(int a = 0; a < arr.length; a++){
            for(int b = a + 1; b < arr.length; b++){
                if(arr[a] == arr[b]){
                    i.add(a);
                    j.add(b);
                }
            }
        }
        System.out.print(i + " " + j);
        for(int a = 0; a < i.size(); a++){
            ArrayList<Integer> subarray = new ArrayList<>();
            for(int b = i.get(a); b <= j.get(a); b++){
                subarray.add(arr[b]);
            }
            int[] subArr = toArray(subarray);
            sum = Math.max(sum, findSum(subArr));
        }
        return sum;
    }

    public static int[] toArray(ArrayList<Integer> arr){
        int a[] = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            a[i] = arr.get(i);
        }
        return a;
    }

    public static int findSum(int[] nums){
        int sum = Integer.MIN_VALUE;
        int i = 1;
        while(i <= nums.length){
            for(int j = 0; j < nums.length - i + 1; j++){ //-2 -1
                int subSum = 0;
                int a = j;
                int sub[] = new int[i];
                for(int k = 0; k < i; k++){
                    sub[k] = nums[a++];
                }
                subSum += add(sub);
                sum = Math.max(subSum, sum);
            }
            i++;
        }
        return sum;
    }

    public static int add(int[] arr){
        if(arr.length < 2){
            return arr[0];
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}