import java.util.*; //sieve of erotheneses

public class LC204{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countprimes(n));
    }
    public static int countprimes(int n){
        if(n < 3){
            return 0;
        }
        int count = 0;
        boolean composites[] = new boolean[n];
        int limit = (int)Math.sqrt(n);
        for(int i = 2; i <= limit; i++){
            if(!composites[i]){
                for(int j = i * i; j < n; j += i){
                    composites[j] = true;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(!composites[i]){
                count++;
            }
        }
        return count;
    }
}