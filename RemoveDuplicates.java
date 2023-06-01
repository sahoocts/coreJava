package Small_Program;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int a[]){
        int n=a.length;
        Arrays.sort(a);
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){

            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[n-1];

        for(int i=0;i<j;i++){
            a[i]=temp[i];
        }
        return j;

    }
    public static void main(String args[]){

        int a[]={1,2,2,1,2};
       int res= removeDuplicates(a);
       for(int i=0;i<res;i++){
           System.out.println("The number is:"+a[i]);
       }
    }
}
