import java.util.*;

public class LC66{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        int res = 0;
        int nums[] = new int[numberOfInputs];
        int ans[] = new int[numberOfInputs + 1];
        for(int i = 0; i < numberOfInputs; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < numberOfInputs; i++){
            res = res*10+nums[i];
        }
        res = res+1;
        if(Math.pow(10,numberOfInputs) == res){
            for(int i = numberOfInputs; i >= 0; i--){
                ans[i] = res%10;
                res = res/10; 
            }
            for(int i = 0; i <= numberOfInputs; i++){
                System.out.print(ans[i] + " ");
            }
        }
        else{
            for(int i = numberOfInputs - 1; i >= 0; i--){
                nums[i] = res%10;
                res = res/10;
            }
            for(int i = 0; i < numberOfInputs; i++){
                System.out.print(nums[i] + " ");
            }
        }
    }
}