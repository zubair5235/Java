import java.util.*;

public class LC1002{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = sc.next();
        }
        System.out.print(findCommon(words));
    }

    public static ArrayList<Character> findCommon(String[] words){
        ArrayList<Character> ans = new ArrayList<>();
        if(words.length == 0){
            return ans;
        }
        int k = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].charAt(k++) == words[j].charAt(k++)){
                    ans.add(words[i].charAt(k++));
                }
            }
        }
        return ans;
    }
}

// Not Completed
