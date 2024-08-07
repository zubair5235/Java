// Number of Distinct Colors Among the balls

import java.util.*;

public class LC3160{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int queries[][] = new int[limit][2];
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < 2; j++){
                queries[i][j] = sc.nextInt();
            }
        }
        System.out.print(queryResults(limit, queries));
    }

    public static ArrayList<Integer> queryResults(int limit, int[][] queries){
        ArrayList<Integer> ans = new ArrayList<>();
        if(limit == 0){
            return ans;                            // [1,4],[2,5],[1,3],[3,4]  count - 2
        }
        int count = 0;                                      //colors - 3 5 4
        ArrayList<Integer> colors = new ArrayList<>();
        int temp[] = new int[limit];
        int j = 0;
        for(int i = 0; i < limit; i++){
            temp[queries[i][j] - 1] = queries[i][j + 1];
            for(int k = 0; k < temp.length; k++){
                if(temp[k] != 0){
                    colors.add(temp[k]);
                }
            }
            System.out.print(colors);
            count = isUnique(colors);
            colors.clear();
            ans.add(count);
        }
        return ans;
    }

    public static int isUnique(ArrayList<Integer> list){
        if(list.size() == 1){
            return 1;
        }
        boolean flag = true;
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    flag = false;
                }
            }
        }
        return flag == true ? list.size() : 0;
    }
}