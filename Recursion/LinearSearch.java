import java.util.*;

public class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(find(0, arr, target));
    }

    public static boolean find(int ind, int[] arr, int target){
        if(ind == arr.length - 1){
            return arr[ind] == target;
        }
        if(arr[ind] == target){
            return true;
        }
        return find(ind + 1, arr, target);
        /* if(arr[ind] != target && ind == arr.length - 1){
            return false;
        }
        return arr[ind] == target || isPresent(target, arr, ind + 1); */
    }
}