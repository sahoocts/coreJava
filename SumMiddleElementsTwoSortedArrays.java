package HackersRankk;

import java.util.*;
public class SumMiddleElementsTwoSortedArrays {

   static int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            al.add(ar1[i]);
            al.add(ar2[i]);
        }
        Collections.sort(al);
        return al.get(n-1)+al.get(n);
    }
    public static void main(String args[]){
       int N = 5;
        int Ar1[] = {1, 2, 4, 6, 10};
        int Ar2[] = {4, 5, 6, 9, 12};
        int x=findMidSum(Ar1,Ar2,N);
        System.out.println(x);
    }
}
