package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
public class AssendingOrder {
    public static void printNumber(int b[]){
        String[] s=new String[b.length];
        for(int i=0;i<b.length;i++){
            s[i]=String.valueOf(b[i]);
        }
        Comparator<String> comp=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return o2.compareTo(o1);
            }
        };
        Arrays.sort(s,comp);
        for(String s1:s){
            System.out.print(s1);
        }
    }
    public static void main(String args[]){
          int a[]={3, 30, 34, 5, 9};
          printNumber(a);
    }
}
