// Determine if String Halves are like
import java.util.*;

public class LC1704{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(halvesAreLike(s));
    }

    public static boolean halvesAreLike(String s){
        HashSet<Character> vowels = new HashSet<>();
        HashMap<Character, Integer> amap = new HashMap<>();
        HashMap<Character, Integer> bmap = new HashMap<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int n = s.length();
        String a = "";
        String b = "";
        int acount = 0;
        int bcount = 0;
        for(int i = 0; i < n / 2; i++){
            a += String.valueOf(s.charAt(i));
            if(vowels.contains(s.charAt(i))){
                amap.put(s.charAt(i), amap.getOrDefault(s.charAt(i), 0) + 1);
                acount++;
            }
        }
        for(int j = n/2; j < n; j++){
            b += String.valueOf(s.charAt(j));
            if(vowels.contains(s.charAt(j))){
                bmap.put(s.charAt(j), bmap.getOrDefault(s.charAt(j), 0) + 1);
                bcount++;
            }
        }
        if(acount != bcount){
            return false;
        }
        else if(acount == bcount){
            return true;
        }
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < a.length(); j++){
                if(amap.containsKey(a.charAt(i)) && bmap.containsKey(b.charAt(j))){
                    if(amap.get(a.charAt(i)) == bmap.get(b.charAt(j))){
                        return true;
                    }
                }
            }
        }
        return false;  
    }
}