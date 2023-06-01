package Leetcode;

import java.util.ArrayList;

public class ZeroSumSubarrays {

    public static void main(String args[]){
        int a[]={6,-1,-3,4,-2,2,4,6,-12,-7};
          printZeroSumSubarrays(a);
    }

    private static void printZeroSumSubarrays(int[] a) {
        boolean flag=false;
        ArrayList<Integer> al=new ArrayList();
        for(int i=0;i<a.length-1;i++){
            int s=0;
            for(int j=i;j<a.length;j++){
                  s=s+a[j];
                if(s==0){
                    flag=true;
                    while(i<=j){
                        System.out.print(a[i]);
                        i++;
                    }
                }
            }
           /* if(flag==true){
            for(int k=0;k<al.size();k++){
                System.out.print(al.get(k));
            }*/

        }

        }
        /*if(flag==true){
            for(int i=0;i<al.size();i++){
                System.out.print(al.get(i));
            }
            //
        }*/
    }

