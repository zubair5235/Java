package LinearSearch;
//LC1295
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1, 12, 123, 1234, 12345, 11};
        System.out.println(findEvenDigitsCount(arr));
    }

    public static int findEvenDigitsCount(int[] arr){
        int count = 0;
        for(int i : arr){
            if(isEvenDigit(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isEvenDigit(int num){
        if(num < 0){
            num *= -1;
        }
        return ((int)Math.log10(num) + 1) % 2 == 0 ? true : false;
    }
}
