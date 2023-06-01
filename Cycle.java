package Geeksforgeeks;

public class Cycle {
    static int[] getCycle(int a[]){
        int n=a.length;
        int x=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=x;
        return a;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
       int x[]= getCycle(a);
       for(int s:x){
           System.out.print(s+",");
       }
    }
}
