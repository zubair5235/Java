// Reverse String
import java.util.*;

public class LC344{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = new char[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next().charAt(0);
        }
        reverseString(s);
    }

    public static void reverseString(char[] s){
        int j = s.length - 1;
        for(int i = 0; i <= j; i++){
            if(i != j && i < j){
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            j--;
        }
        for(char a : s){
            System.out.print(a + " ");
        }
    }
}