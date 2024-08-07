import java.util.*;
public class LC35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        int arr[] = new int[numberOfInputs];
        for(int i = 0; i < numberOfInputs; i++){
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        for(int i = 0; i < numberOfInputs; i++){
            if(arr[i] == val || arr[i] > val){
                System.out.println(i);  
                break; 
            }
            if(i == numberOfInputs - 1){
                System.out.println(numberOfInputs);
            }
        }
    }
}