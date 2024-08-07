// Append Characters to String to Make Subsequence

import java.util.*;

public class LC2486{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.print(appendCharacters(s, t));
    }
    public static int appendCharacters(String s, String t){
        int sIndex = 0;
        int tIndex = 0;
        int sLength = s.length();
        int tLength = t.length();
        while(sIndex < sLength && tIndex < tLength){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                tIndex++;
            }
            sIndex++;
        }
        return tLength - tIndex;
    }
}