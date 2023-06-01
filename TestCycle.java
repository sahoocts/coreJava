package Geeksforgeeks;

public class TestCycle {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int n=a.length;
        int x=a[n-1];
       for(int i=n-1;i>0;i--){
           a[i]=a[i-1];
       }
        for(int s:a){
            System.out.print(s);
        }
    }
}
