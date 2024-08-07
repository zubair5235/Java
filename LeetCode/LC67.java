import java.util.*;

public class LC67{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        System.out.print(Integer.toBinaryString(num1 + num2));
    }
}