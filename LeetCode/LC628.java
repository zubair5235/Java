import java.util.*;

public class LC628{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = arr[0] * arr[1] * arr[arr.length - 1];
        int y = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 2];
        System.out.println(x > y ? x : y);
    }
}