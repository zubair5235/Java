import java.util.*;

public class LC387{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(firstUniqChar(s));
    }
    public static int firstUniqChar(String s){
        /* HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length()-1; i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    set.add(s.charAt(i));
                }
            }
        }
        for(int k = 0; k < s.length(); k++){
            if(!set.contains(s.charAt(k))){
                return k;
            }
        }
        return -1; */
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int j = 0; j < s.length(); j++){
            if(map.get(s.charAt(j)) == 1){
                return j;
            }
        }
        return -1;
    }
}