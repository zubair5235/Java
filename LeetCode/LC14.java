import java.util.*;

public class LC14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n = sc.nextInt();
        String strs[] = new String[n];
        System.out.println("Enter the inputs");
        for(int i = 0; i < n; i++){
            strs[i] = sc.next();
        }
        /* int min = Integer.MAX_VALUE;
        int index = 0; 
        for(int i = 0; i < n; i++){
            int count = strs[i].length();
            if(count <= min){
                min = count;
                index = i;
            }
        }
        int limit = strs[index].length();
        String ans = "";
        String ansarr[] = new String[n];
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                ans = "";
                for(int k = 0; k < limit; k++){
                    if(strs[i].charAt(k) == strs[j].charAt(k)){
                        ans += String.valueOf(strs[i].charAt(k));
                    }
                }
                ansarr[i] = ans;
            }
        }
        for(String a : ansarr){
            System.out.print(a + " ");
        } 
        int i = 0;
        for(int j = 1; j < n; j++){
            for(int k = 0; k < limit; k++){
                if(j == 1){
                    if(strs[i].charAt(k) == strs[j].charAt(k)){
                        ans += String.valueOf(strs[i].charAt(k));
                        fa += ans;
                    }
                }
                else{
                    if(ans.charAt(k) == strs[j].charAt(k)){
                        ans += String.valueOf(strs[i].charAt(k));
                    }   
                }
            }
        }
        int i = 0;
        String ansarr[] = new String[n];
        for(int j = 1; j < n; j++){
            ans = "";
            for(int k = 0; k < limit; k++){
                if(strs[i].charAt(k) == strs[j].charAt(k)){
                    ans += String.valueOf(strs[i].charAt(k));
                }
            }
            ansarr[j-1] = ans;
        } */
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i = 0; i < Math.min(first.length(),last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            ans.append(first.charAt(i));
        }

        System.out.println(ans.toString());
    }
}