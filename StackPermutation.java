import java.util.*;

public class StackPermutation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        int original[] = new int[numberOfInputs];
        int target[] = new int[numberOfInputs];
        System.out.println("Enter the inputs for Original Array");
        for(int i = 0; i < numberOfInputs; i++){
            original[i] = sc.nextInt();
        }
        System.out.println("Enter the inputs for Target Array");
        for(int i = 0; i < numberOfInputs; i++){
            target[i] = sc.nextInt();
        }
        System.out.println(isStackPermutated(original,target));
    }

    public static boolean isStackPermutated(int[] original, int[] target){
        Stack<Integer> s = new Stack<Integer>();
        int i = 0;
        for(int j = 0; j < original.length; j++){
            s.push(original[j]);
            while(!s.isEmpty() && s.peek() == target[i]){
                s.pop();
                i++;
            }
        }
        return s.isEmpty();
    }
}