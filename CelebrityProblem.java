/* import java.util.*;

public class CelebrityProblem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int index = -1;
        int flag;
        for(int i = 0; i < n; i++){
            flag = 0;
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1){
                    flag = 1;
                }
            }
            if(flag == 0){
                index = i;
                break;
            }
        }
        System.out.print(index == -1 ? "No Celebrity" : index);
    }
} */

import java.util.*;

public class CelebrityProblem {
    static int findCelebrity(int n, int[][] arr) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left][right] == 1)
                left++;
            else
                right--;
        }

        for (int i = 0; i < n; i++) {
            if (i != left && (arr[i][left] == 0 || arr[left][i] == 1))
                return -1; 
        }

        return left; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int celebrityIndex = findCelebrity(n, arr);
        System.out.print(celebrityIndex == -1 ? "No Celebrity" : celebrityIndex);
    }
}
