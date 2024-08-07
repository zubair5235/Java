import java.util.*;

public class LC283{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        moveZeros(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void moveZeros(int arr[]){
        int count = 0;
        for(int i : arr){
            if(i == 0){
                count++;
            }
        }
        while(count > 0){
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] == 0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            count--;
        }
    }
}