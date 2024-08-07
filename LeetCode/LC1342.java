// Number of Steps to reduce number to zero

import java.util.*;

public class LC1342{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countSteps(n, 0));
    }

    public static int countSteps(int n, int c){
        if(n == 0){
            return c;
        }
        else if(n % 2 == 0){
            return countSteps(n / 2, c + 1);
        }
        return countSteps(n - 1, c + 1);
    }
}