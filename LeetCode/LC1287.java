// Element Appearing more than 25% in sorted array

import java.util.*;

public class LC1287{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, map.get(arr[i]));
        }
        for(Map.Entry m : map.entrySet()){
            if((int) m.getValue() == max){
                val = (int) m.getKey();
            }
        }
        return val;
    }
}