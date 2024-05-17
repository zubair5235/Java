import java.util.Scanner;

public class StackWithQueue{
    static Queue<Integer> q1 = new LinkedList()<Integer>();
    static Queue<Integer> q2 = new LinkedList()<Integer>();
    static int curr_size;
    static void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    static void pop(){
        if(q1.isEmpty()){
            return;
        }
        q1.remove();
    }
    static int top(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
    static int size(){
        return q1.size();
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            s.push(input);
        }
        for(int i = 0; i < n; i++){
            System.out.println(s.top());
            s.pop();
            System.out.println(s.size());
        }
    }
}