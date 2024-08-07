// Maximum Number of Coins you can get

import java.util.*;

public class LC1561{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(maxCoins(arr));
    }

    public static int maxCoins(int[] arr){
        int numberOfRounds = arr.length / 3;
        int a = 0;
        int coinCount = 0;
        while(numberOfRounds > 0){
            int temp[] = new int[3];
            for(int i = 0; i < 3; i++){
                temp[i] = arr[a++];
            }
            coinCount += findMax(temp);
            numberOfRounds--;
        }
        return coinCount;
    }

    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[1];
    }
}