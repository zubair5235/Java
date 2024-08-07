// Three Divisors

import java.util.*;

public class LC1952{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isThree(n));
    }
    public static boolean isThree(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count == 3 ? true : false;
    }
}