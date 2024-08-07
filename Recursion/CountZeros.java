import java.util.*;

public class CountZeros{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countZeros(n,  0));
    }

    public static int countZeros(int n, int c){
        if(n == 0){
            return c;
        }
        if(n % 10 == 0){    
           return countZeros(n / 10, c + 1);
        }
        else{
           return countZeros(n / 10, c);
        }
    }
}