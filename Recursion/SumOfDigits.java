import java.util.*;

public class SumOfDigitsRec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
                        
    public static int sum(int n){
        if(n % 10 == n){
            return n;
        }
        return n % 10 + sum(n / 10); 
    }
}