package Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] a)
    {
        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* sort the array of strings */
        Arrays.sort(a);
        for(String d:a){
           // System.out.println(d);
        }

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());
       // System.out.println("end:"+end);

        /* find the common prefix between the first and
           last string */
        int i = 0;
        char c=a[0].charAt(i);
        char c1=a[size-1].charAt(i);
        System.out.println("c:"+c);
        System.out.println("c1:"+c1);
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) ) {
            i++;
        }
        String pre = a[0].substring(0, i);
        return pre;
    }

    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        LongestCommonPrefix gfg = new LongestCommonPrefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println( "The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));
    }
}
