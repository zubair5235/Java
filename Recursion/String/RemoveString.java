// Remove a String from a String
import java.util.*;

public class String2Rec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(removeString(str1, str2));
    }

    public static String removeString(String s1, String s2){
        if(s1.isEmpty()){
            return "";
        }
        if(s1.startsWith(s2)){
            return removeString(s1.substring(s2.length()), s2);
        }
        return s1.charAt(0) + removeString(s1.substring(1), s2); 
    }
}