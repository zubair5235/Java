import java.util.*;

public class LC3110{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(scoreOfString(s));
    }
    public static int scoreOfString(String s){
        int score = 0;
        for(int i = 0; i < s.length() - 1; i++){
            score += Math.abs((s.charAt(i) - 97 + 97) - (s.charAt(i + 1) - 97 + 97)); 
        }
        return score;
    }
}