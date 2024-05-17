import java.util.*;

public class StockPerm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> input = new LinkedList<>();
        Queue<Integer> output = new LinkedList<>();
        for(int i = 0; i < n; i++){
            input.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            output.add(sc.nextInt());
        }
        int flag = 0;
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for(int i = 0; i < n; i++){
            s.push(input.peek());
            while(!s.isEmpty() && s.peek() == output.peek()){
                output.poll();
                s.pop();
                j++;
            }
            input.poll();
        }
        if(j == n && s.size() == 0){
            flag = 1;
        }
        System.out.print(flag == 1 ? "YES" : "NO");
    }
}