// Word Search

import java.util.*;

public class LC79{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char board[][] = new char[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = sc.next().charAt(0);
            }
        }
        String word = sc.next();
        System.out.print(exist(board, word));
    }

    public static boolean exist(char[][] board, String word){
        String allChars = "";
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                allChars += String.valueOf(board[i][j]);
            }
        }
        int i = 0;
        String f = "";
        while(i < word.length()){
            int flag = 0;
            for(int j = 0; j < allChars.length(); j++){
                if(word.charAt(i) == allChars.charAt(j)){
                    allChars = allChars.replaceFirst(String.valueOf(allChars.charAt(j)), "");
                    flag = 1;
                    break;
                }
            }
            f += String.valueOf(flag);
            i++;
        }
        return f.contains("0") ? false : true;
    }
}