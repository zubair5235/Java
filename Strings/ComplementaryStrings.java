// Deliveroo Question

import java.util.*;

public class ComplementaryStrings{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
        for (;;) {
            String s = sc.next();
            if (s.equals("-1")) {break;}
            arr.add(s);
        }
        System.out.println(countCompStrings(arr));
    }

    public static int countCompStrings(List<String> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                String conString = arr.get(i) + arr.get(j);
                int oddCount = 0;
                HashMap<Character, Integer> map = new HashMap<>();
                for (char ch : conString.toCharArray()) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }
                for (Map.Entry<Character, Integer> m : map.entrySet()) {
                    if(m.getValue() % 2 != 0) {oddCount++;}
                }
                if(oddCount == 1) {ans++;}
            }
        }
        return ans;
    }
}