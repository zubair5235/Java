import java.util.*;

public class LC238{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[n];
        int sum = 1;
        int j = 0;
        while(j < n){
            sum = 1;
            for(int i = 0; i < n; i++){
                if(i == j){
                    continue;
                }
                else{
                    sum *= arr[i];
                }
            }
            ans[j] = sum;
            j++;
        }
        for(int i : ans){
            System.out.println(i);
        }
    }
}