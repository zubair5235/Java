import java.util.*;

public class LC350{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        } 
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        intersect(arr1, arr2);
    }
    public static int[] intersect(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(n > m){
            int arr1[] = removeDups(nums1);
            for(int i = 0; i < m; i++){
                for(int j = 0; j < arr1.length; j++){
                    if(nums2[i] == arr1[j]){
                        ans.add(nums2[i]);
                    }
                }
            }
        }
        else{
            int arr2[] = removeDups(nums2);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < arr2.length; j++){
                    if(nums1[i] == arr2[j]){
                        ans.add(nums1[i]);
                    }
                }
            }
        }
        System.out.print(ans);
        int empty[] = new int[ans.size()];
        int i = 0;
        for(int a : ans){
            empty[i++] = a;
        }
        return empty;
    }   
    public static int[] removeDups(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            set.add(i);
        }
        ArrayList<Integer> a = new ArrayList<Integer>(set);
        int dummy[] = new int[a.size()];
        int b = 0;
        for(int i : a){
            dummy[b++] = i;
        }
        return dummy;
    }
}