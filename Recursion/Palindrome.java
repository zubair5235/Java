import java.util.*;

public class PalindromeRec{
    static String reverse = "";
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseIt(n);
        int rev = Integer.parseInt(reverse);
        System.out.print(n == rev);
    }

    public static void reverseIt(int n){
        if(n == 0){
            return;
        }
        reverse = reverse + String.valueOf(n % 10);
        reverseIt(n / 10);
    }
}