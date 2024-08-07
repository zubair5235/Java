// Find Players With Zero or One Loses

import java.util.*;

public class LC2225{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matches[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matches[i][j] = sc.nextInt();
            }
        }
        System.out.print(findWinners(matches));
    }

    public static ArrayList<ArrayList<Integer>> findWinners(int[][] matches){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<Integer> winners = new HashSet<>();
        HashSet<Integer> losers = new HashSet<>();
        for(int i = 0; i < matches.length; i++){
            winners.add(matches[i][0]);
        }
        for(int i = 0; i < matches.length; i++){
            losers.add(matches[i][1]);
        }
        ArrayList<Integer> winnersList = new ArrayList<>(winners);
        ArrayList<Integer> losersList = new ArrayList<>(losers);
        ArrayList<Integer> loser1 = new ArrayList<>();
        for(int i = 0; i < losersList.size(); i++){
            int count = 0;
            for(int j = 0; j < matches.length; j++){
                if(losersList.get(i) == matches[j][1]){
                    count++;
                }
            }
            if(count == 1){
                loser1.add(losersList.get(i));
            }
        }
        winnersList.removeAll(losersList);
        ans.add(winnersList);
        ans.add(loser1);
        return ans;
    }
}