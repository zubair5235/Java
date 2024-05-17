import java.util.*;

public LPS{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        SrtingBuilder s = new StringBuilder(s1);
        s.reverse();
        String s2 = s.toString();

        System.out.print(lcs(s1,s2,s1.length()-1,s2.length()-1));
    }

    public static int lcs(String s1, String s2, int ind1, int ind2){
        if(ind1 < 0 || ind2 < 0){
            return 0;
        }
        if(s1.charAt(ind1) == s2.charAt(ind2)){
            return 1 + lcs(s1,s2,ind1-1,ind2-1);
        }
        return 0 + Math.max(lcs(s1,s2,ind1-1,ind2),lcs(s1,s2,ind1,ind2-1));
    }
}