import java.util.*;

public class LC202{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappyNumber(n));
    }

    public static boolean isHappyNumber(int n){
        if(n == 1) return true;
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(true){
            n = findSquare(n);
            if(!set.add(n)){
                return false;
            }
            if(n == 1){
                break;
            }
        }
        return true;
    }

    public static int findSquare(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}