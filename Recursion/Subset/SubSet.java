import java.util.*;

// Generating subsets of a string

public class SubSet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> list = new ArrayList<>();
        System.out.println();
        generateSubsets("",s);
        System.out.println(generateSubsets(list, "", s));
    }

    public static void generateSubsets(String p, String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = s.charAt(0);

        generateSubsets(p + ch, s.substring(1));
        generateSubsets(p, s.substring(1));
    }

    public static List<String> generateSubsets(List<String> list, String p, String s){
        if(s.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = s.charAt(0);

        generateSubsets(list, p + ch, s.substring(1));
        return generateSubsets(list, p, s.substring(1));
    }
}