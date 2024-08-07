import java.util.*;

public class StringPermutation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        permutations("", s);
        ans = permutationsList("", s);
        System.out.println();
        System.out.println(ans);
    }

    public static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            permutations(f + ch + l, up.substring(1));
        }
    }

    public static ArrayList<ArrayList<String>> permutationsList(String p, String up){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            ans.add(list);
            return ans;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + l, up.substring(1)));
        }

        return ans;
    }
}