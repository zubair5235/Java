import java.util.*;

public class MaxSliding{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result[] = new int[n - k + 1];
        for(int i = 0; i <= n - k; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++){
                max = Math.max(max, arr[j]);
            }
            result[i] = max;
        }
        System.out.println(Arrays.toString(result));
    }
}