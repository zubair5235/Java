import java.util.*;

public class LC349{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j < m; j++){
            arr2[j] = sc.nextInt();
        }
        intersection(arr1, arr2);
    }
    public static void intersection(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(n > m){
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(arr2[i] == arr1[j]){
                        if(!set.contains(arr2[i])){
                            set.add(arr2[i]);
                            ans.add(arr2[i]);
                        }
                    }
                }
            }
        }
        else{
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(arr1[i] == arr2[j]){
                        if(!set.contains(arr1[i])){
                            set.add(arr1[i]);
                            ans.add(arr1[i]);
                        }
                    }
                }
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}