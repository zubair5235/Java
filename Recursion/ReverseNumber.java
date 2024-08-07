import java.util.*;

public class ReverseNumberRec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseIt(n);
    }

    public static void reverseIt(int n){
        if(n == 0){
            return;
        }
        System.out.print(n % 10);
        reverseIt(n / 10);
    }
}