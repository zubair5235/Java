// Find the Winner of an Array Game

import java.util.*;

public class LC1535{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        /* rotateArray(arr, 1, arr.length - 1);
        for(int i : arr){
            System.out.print(i + " ");
        } */
        int k = sc.nextInt();
        System.out.print(findWinner(arr, k));
    }

    public static int findWinner(int[] arr, int k){
        int winCount = 1;
        HashSet<Integer> currentWinner = new HashSet<>();
        ArrayList<Integer> currentWinners = new ArrayList<>();
        while(winCount != k){
            if(arr[0] > arr[1]){
                if(!currentWinner.contains(arr[0])){
                    currentWinner.add(arr[0]);
                }
                else{
                    winCount++;
                }
                currentWinners.add(arr[0]);
                rotateArray(arr, 1, arr.length);
            }
            else{
                if(!currentWinner.contains(arr[1])){
                    currentWinner.add(arr[1]);
                }
                else{
                    winCount++;
                }
                currentWinners.add(arr[1]);
                rotateArray(arr, 0, arr.length);
            }
        }
        int ans = returnWinner(currentWinners, k);
        return ans;
    }

    public static void swap(int arr[], int firstIndex, int lastIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    public static void rotateArray(int arr[], int first, int last){
        for(int i = first; i < last - 1; i++){
            swap(arr, i, i + 1);
        }
    }

    public static int returnWinner(ArrayList<Integer> ans, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int num = -1;
        for(int i : ans){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(k == m.getValue()){
                num = m.getKey();
            }
        }
        return num;
    }
}