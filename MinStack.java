/* import java.util.*;

public class MinStack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            s.add(input);
        }
        int min = Integer.MAX_VALUE;
        while(!s.isEmpty()){
            if(min > s.peek()){
                min = s.peek();
            }
            s.pop();
        }
        System.out.print(min);
    }
} */

/* 
import java.util.*;

public class MinStack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < n){
            if(arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        System.out.print(min);
    }
} */

import java.util.*;

public class MinStack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Number of inputs
        Stack<Integer> s = new Stack<>();
        Stack<Integer> minstack = new Stack<>();
        for(int i = 0; i < n; i++){
            s.push(sc.nextInt());
        }
        minstack.push(s.peek());
        s.pop();
        while(s.isEmpty()){
            if(minstack.peek() > s.peek()){
                minstack.push(s.peek());
            }
            s.pop();
        }
        System.out.print(minstack.peek());
    }
}