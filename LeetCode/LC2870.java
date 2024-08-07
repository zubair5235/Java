import java.util.*;

public class LC2870{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(minOperations(arr));
    }
    public static int minOperations(int[] nums){
        int opCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); 
        HashSet<Integer> finished = new HashSet<>();      //[2,3,3,2,2,4,2,3,4]
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        for(int j = 0; j < nums.length; j++){
            if(!finished.contains(nums[j])){
                finished.add(nums[j]);
                int temp = map.get(nums[j]);
                if(temp % 2 == 0 && temp > 1){
                    while(temp > 1){
                        temp /= 2;
                        opCount++;
                    }
                }
                else if(temp % 2 != 0 && temp > 1){
                    temp /= 3;
                    opCount++;
                }
                else if(temp == 1){
                    opCount = -1;
                    break;
                }
            }
        }
        return opCount;
    }
}