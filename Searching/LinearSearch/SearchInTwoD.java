package LinearSearch;

public class SearchInTwoD {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 1}, {3,1}, {14,15}};
        System.out.println(findElement(arr, 56));
    }

    public static int findElement(int[][] arr, int element){
        for(int[] i : arr){
            for(int j : i){
                   if(j == element){
                       return 1;
                   }
            }
        }
        return 0;
    }
}

