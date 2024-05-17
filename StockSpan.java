/* import java.util.*;

public class StockSpan{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int span[] = new int[n];
        calculateSpan(arr,span);
    }
    public static void calculateSpan(int[] arr, int[] span){
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        span[0] = 1;
        for(int i = 1; i < arr.length; i++){
            int count = 1;
            while(!s.isEmpty()){
                if(arr[i] >= arr[s.peek()]){
                    count++;
                }
                else{
                    break;
                }
                s.pop();
            }
            span[i] = count;
            for(int j = 0; j <= i; j++){
                s.push(j);
            }
        }
        System.out.print(Arrays.toString(span));
    }
}
 */

import java.util.*;

public class StockSpan{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int span[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i-1; j >= 0; j--){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
            span[i] = count;
        }
        for(int i : span){
            System.out.print(i +  " ");
        }
    }
}