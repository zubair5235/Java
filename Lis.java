import java.util.*;

public class Lis{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(lis(0,-1,arr,n));
    }

    public static int lis(int ind, int pre_ind, int arr[], int n){
        if(ind == n){
            return 0;
        }
        int take = 0;
        if(pre_ind == -1 || arr[ind] > arr[pre_ind]){
            take = 1 + lis(ind+1,ind,arr,n);
        }
        int ntake = 0 + lis(ind+1,pre_ind,arr,n);
        return Math.max(take,ntake);
    }
}