// Find Pivot Integer

import java.util.*;

public class LC2485{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findPivot(n));
    }

    public static int findPivot(int num){
        int ans = -1;
        if(num < 2){
            return num;
        }
        int totalSum = (num * (num + 1)) / 2;  
        int secondSum = 0;
        for(int i = num; i >= 1; i--){
            secondSum += i;
            if(secondSum == totalSum){
                ans = i;
            }
            totalSum -= i;
        }
        return ans;
    }
}