// Hand of Straights

import java.util.*;

public class LC846{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cards[] = new int[n];
        for(int i = 0; i < n; i++){
            cards[i] = sc.nextInt();
        }
        int groupSize = sc.nextInt();
        System.out.print(isNStraightHand(cards, groupSize));
    }

    public static boolean isNStraightHand(int[] cards, int gS){
        if(cards.length % gS != 0){
            return false;
        }
        Arrays.sort(cards);
        for(int i = 0; i < cards.length; i++){
            if(cards[i] >= 0){
                if(!findSuccessor(cards, i, gS))
                    return false;
            }
        }
        return true;
    }

    public static boolean findSuccessor(int[] cards, int ind, int gS){
        int f = cards[ind] + 1;
        cards[ind] = -1;
        int count = 1;
        ind++;
        while(ind < cards.length && count < gS){
            if(cards[ind] == f){
                f++;
                cards[ind] = -1;
                count++;
            }
            ind++;
        }
        return count == gS ? true : false;
    }
}