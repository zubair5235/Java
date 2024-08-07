import java.util.*;

public class LC17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();
        letterCombinations(digits);
    }
    public static List<String> letterCombinations(String digits){
        ArrayList<String> ans = new ArrayList<String>();
        if(digits.length() == 0){
            return ans;
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"stu");
        map.put(9,"wxyz");
        int num = digits.charAt(0) - '0';
        for(int j = 0; j < map.get(num).length(); j++){
            ans.add(String.valueOf(map.get(num).charAt(j)));
        }
        for(int i = 1; i < digits.length(); i++){
            String s = map.get(digits.charAt(i) - '0');
            for(int j = 0; j < ans.size(); j++){
                int k = 0;
                while(k < s.length()){
                    String dummy = ans.get(j);
                    dummy += String.valueOf(s.charAt(k));
                    ans.add(dummy);
                    k++;
                }
            }
        }
        System.out.print(ans);
        return ans;
    }
}