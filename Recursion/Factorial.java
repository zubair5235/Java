import java.util.*;

public class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findFactorial(n)); 
    }

    public static int findFactorial(int n){
        if(n == 2){
            return n;
        }
        return n * findFactorial(n - 1);
    }
}