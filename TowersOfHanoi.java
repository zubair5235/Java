import java.util.*;

public class TowersOfHanoi{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s = 'a';
        char a = 'b';
        char d = 'c';
        TOH(n, s, d, a);
    }

    public static void TOH(int n, char s, char d, char a){
        if(n == 0){
            return;
        }
        TOH(n-1, s, a, d);
        System.out.println(s + " " + d);
        TOH(n-1, a, d, s);
    }
}