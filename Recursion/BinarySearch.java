import java.util.*;

public class BinarySearchRec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(find(0, arr, arr.length - 1, target));
    }

    public static boolean find(int start, int[] arr, int end, int target){
        if(start > end){
            return false;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return true;
        } else if(arr[mid] > target){
            return find(start, arr, mid - 1, target);
        } else{
            return find(mid + 1, arr, end, target);
        }
    }
}