// Group Anagrams

import java.util.*;

public class LC49{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs[] = new String[n];
        for(int i = 0; i < n; i++){
            strs[i] = sc.next();
        }
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> ans = new ArrayList<>();
        if(strs.length == 0){
            return ans;
        }
        ArrayList<String> copyOfStrs = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            copyOfStrs.add(strs[i]);
        }
        while(!copyOfStrs.isEmpty()){
            for(int i = 0; i < copyOfStrs.size() - 1; i++){
                List<String> subAns = new ArrayList<>();
                for(int j = i + 1; j < copyOfStrs.size(); j++){
                    if(isAnagram(copyOfStrs.get(i), copyOfStrs.get(j))){
                        subAns.add(copyOfStrs.get(j));
                        copyOfStrs.remove(j);
                    }
                }
                subAns.add(copyOfStrs.get(i));
                copyOfStrs.remove(i);
                Collections.sort(subAns);
                ans.add(subAns);
            }
        }
        return ans;
    }

    public static boolean isAnagram(String s1, String s2){
        HashSet<Character> set = new HashSet<>();
        for(char c : s1.toCharArray()){
            set.add(c);
        }
        for(char c : s2.toCharArray()){
            set.remove(c);
        }
        return set.isEmpty();
    }
}

