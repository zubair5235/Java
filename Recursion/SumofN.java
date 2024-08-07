import java.util.*;

public class SumofNRec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }

    public static int sum(int n){
        if(n == 1){
            return n;
        }
        return n + sum(n - 1);
    }
}