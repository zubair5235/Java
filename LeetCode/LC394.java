// Decode String 

import java.util.*;

public class LC394{
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  //  2[a3[bc]]  == abcbcbcabcbcbc  2a3bc  
        String str = sc.next();
        Stack<Character> s = new Stack<>();
        for(int i = 0; i <= 9; i++){
            set.add(i);
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ']' && str.charAt(i) != '[')
                s.push(str.charAt(i));
        }
        String subStr = "";
        String freq = "0";
        while(!s.isEmpty()){
            if(isDigit(s.peek())){          //2a   sub = bc     freq = 30
                freq = freq + s.peek();
            }
            else{
                for(int i = 1; i <= Integer.parseInt(freq) / 10; i++){
                    subStr = subStr + subStr;
                }
                subStr = subStr + String.valueOf(s.peek());
            }
            s.pop();
        }
        System.out.print(subStr);
    }

    public static boolean isDigit(char a){
        return set.contains(a - '0') ? true : false;
    }
}