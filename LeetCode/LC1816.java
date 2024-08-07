// Truncate Sentence

import java.util.*;

public class LC1816{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.print(truncateSentence(s, k));
    }
    public static String truncateSentence(String s, int k) {
        String words[] = s.split(" ");
        String ans = "";
        int limit = k > words.length ? k - words.length : k;
        for(int i = 0; i < limit; i++){
            if(i == limit - 1){
                ans += words[i];
            }
            else{
                ans += words[i] + " ";
            }
        }
        return ans;
    }
}