package PrevPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDup {
    public static void main(String args[]){
        int a[]={1,3,1,2};
        removeDup(a);
    }

    private static void removeDup(int[] a) {
        int b[]=new int[a.length];
        ArrayList al=new ArrayList();
        int j=0;
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
               // b[j++]=a[i];
                al.add(a[i]);
            }
        }
     //   b[j++]=a[n-1];
        al.add(a[n-1]);
       /* for(int i=0;i<j;i++){
            a[i]=b[i];
        }*/
        System.out.print(al);
    }

}
