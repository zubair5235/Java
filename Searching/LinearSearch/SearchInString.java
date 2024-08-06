package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String s = "Mohamed zubair";
        char c = 'z';
        System.out.println(isPresent(s, c));
    }

    public static boolean isPresent(String s, char c){
        if(s.isEmpty()){
            return false;
        }
        for(char a : s.toCharArray()){
            if(a == c){
                return true;
            }
        }
        return false;
    }
}
