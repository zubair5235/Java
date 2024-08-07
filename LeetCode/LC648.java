// Replace a word

import java.util.*;

public class LC648{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int n = sc.nextInt();
        String dict[] = new String[n];
        for(int i = 0; i < n; i++){
            dict[i] = sc.next();
        }
        System.out.print(replaceWords(dict, sentence));
    }

    /* public static String replaceWords(String[] dict, String sent){
        String ans = "";
        if(sent.length() == 0){
            return ans;
        }
        String[] words = sent.split(" ");
        Arrays.sort(dict);
        for(int i = 0; i < dict.length; i++){
            for(int j = 0; j < words.length; j++){
                if(words[j].contains(dict[i])){
                    words[j] = replace(words[j], dict[i]);
                }
            }
        }
        for(String i : words){
            ans += i;
            ans += " ";
        }
        return ans;
    }

    public static String replace(String a, String b){
        if(a.indexOf(b) < b.length()){
            a = b;
        }
        return a;
    } */

   /* LeetCode Approach */

   public static String replaceWords(String[] dict, String sent){
        String ans = "";
        String words[] = sent.split(" ");
        HashSet<String> dictWords = new HashSet<>();
        for(String i : dict){
            dictWords.add(i);
        }
        for(int i = 0; i < words.length; i++){
            words[i] = replace(words[i], dictWords);
        }
        for(String i : words){
            ans += i;
            ans += " ";
        }
        ans = ans.trim();
        return ans;
   }

   public static String replace(String str, HashSet<String> dictWords){
        String subString = "";
        for(int i = 0; i < str.length(); i++){
            subString += String.valueOf(str.charAt(i));
            if(dictWords.contains(subString)){
                return subString;
            }
        }
        return str;
   }
}