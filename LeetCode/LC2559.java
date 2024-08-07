// Count Vowel Strings in ranges    92/93

import java.util.*;

public class LC2559{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = sc.next();
        }
        int m = sc.nextInt();
        int queries[][] = new int[m][2];
        for(int j = 0; j < m; j++){
            queries[j][0] = sc.nextInt();
            queries[j][1] = sc.nextInt();
        }
        System.out.println(vowelStrings(words, queries));
    }

    public static List<Integer> vowelStrings(String[] words, int[][] queries){
        List<Integer> ans = new ArrayList<>();
        if(words.length == 0){
            return ans;
        }
        int i = 0;
        while(i < queries.length){
            int count = 0;
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(containsVowel(words[j])){
                    count++;
                }
            }
            ans.add(count);
            i++;
        }
        return ans;
    }

    public static boolean containsVowel(String word){
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1)));
    }
}