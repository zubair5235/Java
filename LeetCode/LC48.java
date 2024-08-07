import java.util.*;

public class LC48{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int image[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                image[i][j] = sc.nextInt();
            }
        }
        rotate(image);
    }
    public static void rotate(int[][] image){
        /* int rotated[][] = new int[image.length][image.length];
        for(int j = 0; j < image.length; j++){
            int k = 0;
            for(int i = image.length - 1; i >= 0; i--){
                rotated[j][k++] = image[i][j];
            }
        }
        for(int i = 0; i < rotated.length; i++){
            for(int j = 0; j < rotated.length; j++){
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        } */

        for(int i = 0; i < image.length - 1; i++){
            for(int j = i; j < image.length; j++){
                if(i != j) {
                    int temp = image[i][j];
                    image[i][j] = image[j][i];
                    image[j][i] = temp;
                }
            }
        }

        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image.length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}