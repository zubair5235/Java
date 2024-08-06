import java.util.*;

public class HashTableSearch {
    public static void main(String[] args) {
        int[] arr = {10, 13, 8, 91, 53, 56, 65, 14, 0};
        System.out.println(findIndex(arr, 56));
    }

    public static int findIndex(int[] arr, int element){
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i = 0; i < arr.length; i++){
            table.put(arr[i], i);
        }
        return table.getOrDefault(element, -1);
    }
}
