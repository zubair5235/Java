// Sequential Digits

import java.util.*;

public class LC1291{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.print(sequentialDigits(low, high));
    }

    public static List<Integer> sequentialDigits(int low, int high){
        String firstDigit = String.valueOf(low);
        firstDigit = String.valueOf(firstDigit.charAt(0));
        int count = 0;
        return new ArrayList<Integer>();
    }
}