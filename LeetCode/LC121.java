import java.util.*;

public class LC121{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(maxprofit(arr));
    }
    public static int maxprofit(int[] prices){
        if(prices.length == 0){
            return 0;
        }
        int profit = 0;
        int bp = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] <= bp){
                bp = prices[i];
            }
            profit = Math.max(profit, prices[i] - bp);
        }
        return profit;
    }
}