import java.util.*;
//Remove all occurences of a character in a string


public class String1Rec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        String ans = "";    
        System.out.println(remove(s,c,ans, 0));
    }

    public static void remove(String s, char c, int len, String ans){
        if(len == s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(len) != c){
            ans += String.valueOf(s.charAt(len));
        }
        remove(s, c, len + 1, ans);
    }

    public static String remove(String s, char c, String ans, int len){
        if(len == s.length()){
            return ans;
        }
        if(s.charAt(len) != c){
            ans += String.valueOf(s.charAt(len));
        }
        return remove(s, c, ans, len + 1);
    }
}