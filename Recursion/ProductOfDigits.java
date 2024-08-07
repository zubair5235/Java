import java.util.*;

public class ProductOfDigitsRec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(product(n));
    }

    public static int product(int n){
        if(n % 10 == n){
            return n;
        }
        return n % 10 * product(n / 10);
    }
}