import java.util.*;

public class LC2461{
    static long max = 0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        int left = 0;
        int right = k-1;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i <= right; i++){
            li.add(arr[i]);
            sum += arr[i];
        }
        map.put(sum, li);
        keys.add(sum);
        long maxSum = sum;
        while(right < n - 1){
            li = new ArrayList<>();
            li.addAll(map.get(sum));
            li.remove(0);
            sum -= arr[left++];
            sum += arr[++right];
            li.add(arr[right]);
            map.put(sum, new ArrayList<>(li));
            keys.add(sum);
            maxSum = Math.max(maxSum, sum);
        }
        max = maxSum;
        for(int i : keys){
            findDistinct(i, map.get(i));
        }
    }

    public static void findDistinct(int i, ArrayList<Integer> a){
        boolean repeated = false;
        for(int k = 0; k < a.size()-1; k++){
            for(int j = k + 1; j < a.size(); j++){
                if(a.get(k) == a.get(j)){
                    repeated = true;
                    break;
                }
            }
        }
        if(!repeated){
            max = (long)i;
            System.out.print(max);
        }
    }
}