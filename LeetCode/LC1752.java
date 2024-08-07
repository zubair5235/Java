import java.util.*;

public class LC1752 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = Arrays.copyOfRange(arr, 0, arr.length); 
        if(isRotated(arr)) {
            int rotCount = findRotCount(arr);
            Arrays.sort(sortedArr);
            System.out.println(isSorted(arr, sortedArr, rotCount));
        } else {
            System.out.println(isSorted(arr));
        }
    }

    public static boolean isRotated(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int findRotCount(int[] arr){
        int ans = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                ans = i + 1;
            }
        }
        return ans;
    }

    public static boolean isSorted(int[] arr, int[] sortedArr, int rotCount){
        boolean sorted = true;
        rotCount %= sortedArr.length;
        reverse(sortedArr, 0, sortedArr.length - 1);
        reverse(sortedArr, 0, rotCount -1);
        reverse(sortedArr, rotCount, sortedArr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != sortedArr[i]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}