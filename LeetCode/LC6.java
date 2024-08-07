// ZigZag Conversion

import java.util.*;

public class LC6 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();
    System.out.print(convert(s, n));
  }

  public static String convert(String s, int n) {
    if (s.length() == 1 || n == 1) {
      return s;
    }
    ArrayList<ArrayList<String>> list = new ArrayList<>();
    ArrayList<ArrayList<String>> correctedList = new ArrayList<>();
    int i = 0;
    int leave = n - 2;
    while (i < s.length()) { // PAYPALISHIRING
      ArrayList<String> subList = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        subList.add(s.charAt(i++) + "");
        if (i == s.length()) {
          break;
        }
      }
      list.add(subList);
      i += leave;
    }
    leave = n;
    i = 0;
    String subString = "";
    while (i < s.length()) {
      i += leave;
      if (i >= s.length()) {
        break;
      }
      for (int j = 0; j < n - 2; j++) {
        subString += s.charAt(i++) + "";
      }
    }
    int j = 0;
    for (int a = 0; a < n; a++) {
      ArrayList<String> li = new ArrayList<>();
      for (ArrayList<String> l : list) {
        try {
          li.add(l.get(j));
        } catch (Exception e) {
          int ii = 0;
        }
      }
      j++;
      correctedList.add(li);
    }
    int insertListCount = n - 2;
    int start = 0;
    while (start < insertListCount) {
      String existed = "";
      for (String y : correctedList.get(correctedList.size() - 2 - start)) {
        existed += y;
      }
      int y = 0;
      int z = n % 2 == 0 ? start : 0;
      correctedList.get(correctedList.size() - 2 - start).clear();
      for (int f = 0; f < existed.length() + subString.length() / 2; f++) {
        if (y < existed.length()) {
          correctedList
            .get(correctedList.size() - 2 - start)
            .add(existed.charAt(y++) + "");
        }
        if (z < subString.length()) {
          correctedList
            .get(correctedList.size() - 2 - start)
            .add(subString.charAt(z) + "");
          z += n % 2 == 0 ? 2 : 1;
        }
      }
      start++;
    }
    String ans = "";
    for (ArrayList<String> lii : correctedList) {
      for (String c : lii) {
        ans += c;
      }
    }
    return ans;
  }
}
