package Practice;

import java.util.Arrays;

public class LongestCommonPrefixx {
    public static void main(String args[]){
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String x=longestCommonPrefix(input);
        System.out.print("prefix x is::"+x);
    }

    private static String longestCommonPrefix(String[] a) {
        int size=a.length;
        if(size==0){
            return "";
        }
        if(size==1){
            return a[0];
        }
        Arrays.sort(a);
        int end=Math.min(a[0].length(),a[size-1].length());
      int i=0;
      while(i<end && a[0].charAt(i)==a[size-1].charAt(i)){
          i++;
      }
      String ss=a[0].substring(0,i);
      return ss;
    }
}
