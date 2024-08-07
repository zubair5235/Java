// Minimum Number of moves to seat everyone

import java.util.*;

public class LC2037{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int seats[] = new int[n];
        int students[] = new int[n];
        for(int i = 0; i < n; i++){
            seats[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            students[i] = sc.nextInt();
        }
        System.out.print(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students){
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == students[i]){
                continue;
            }
            else{
                moves += Math.abs(seats[i] - students[i]);
            }
        }
        return moves;
    }
}