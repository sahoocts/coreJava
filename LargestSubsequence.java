package LogicImplemented;

import java.util.Arrays;

public class LargestSubsequence {

    public static void main(String args[]){
        int a[]={1,9,3,10,4,20,2};
        int result=getLargestSubsequence(a);
        System.out.println(result);
    }
    private static int getLargestSubsequence(int[] a) {
        int temp;
        int max=1;
        int totalMax=1;
       /* for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }
        }*/
        Arrays.sort(a);//1,2,3,4,9,10,20://subsequence is:1,2,3,4==total 4
       for(int k=1;k<=a.length-1;k++){
           if(a[k]==a[k-1]+1){
               max++;

           }
           else{
               max=1;
           }
        if(max>totalMax){
            totalMax=max;
        }

       }
        return totalMax;
    }
}
