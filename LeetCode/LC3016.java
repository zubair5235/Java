import java.util.*;

public class LC3016 {

    static int max = Integer.MIN_VALUE;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(minimumPushes(word));
    }

    public static int minimumPushes (String word) {
        int ans = 0;
        int[] letterFreq = new int[26];
        Integer[] sortedFreq = new Integer[26];
        for (char ch : word.toCharArray()) {    
            letterFreq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            sortedFreq[i] = letterFreq[i];
        }
        Arrays.sort(sortedFreq, Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (sortedFreq[i] == 0) {break;}
            ans += (i / 8 + 1) * sortedFreq[i]; 
        }
        return ans;
    }
}