import java.util.*;

public class LC1392{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String input = sc.nextLine();
      	String prefix[] = new String[input.length()-1];
      	String suffix[] = new String[input.length()-1];
      	for(int i = 0; i < input.length()-1; i++){
        	prefix[i] = input.substring(0,i+1);
        }
      	int j = 0;
      	for(int i = input.length()-1; i >= 1 ; i--){
        	suffix[j] = input.substring(i);
          	j++;
        }
      	ArrayList<String> s = new ArrayList<>();
      	for(int i = 0; i < prefix.length; i++){
        	if(prefix[i].equals(suffix[i])){
            	s.add(prefix[i]);
            }
        }
      	int max = Integer.MIN_VALUE;
      	String res = "";
      	for(String k : s){
          if(max < k.length()){
          	max = k.length();
            res = k;
          }
        }
      	System.out.println(res);
    }
}