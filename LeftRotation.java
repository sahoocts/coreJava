package stack;

import java.util.Scanner;

public class LeftRotation {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int index=sc.nextInt();

       // int a[]={1,2,3,4,5};
     //   int index=4;
        int a1[]=getleftArray(a,index);
        for(int s:a1){
            System.out.print(s+" ");
        }
    }

    private static int[] getleftArray(int[] a,int index) {
        int temp[]=new int[index];
        for(int i=0;i<index;i++){
            temp[i]=a[i];
        }
        int j=0;
        for(int i=index;i<a.length;i++){
            a[j]=a[i];
            j++;
        }
        for(int i=0;i<temp.length;i++){
            a[j]=temp[i];
            j++;
        }
        return a;
    }
}
