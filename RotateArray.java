package PrevPractice;

public class RotateArray {
    private static void getRotate(int[] a) {
       // int b[]=new int[a.length];
        int len=a.length;
        int n=len-1;
        int a1=a[n];
        for(int i=0;i<len-1;i++){
            a[n-i]=a[n-i-1];
        }
        a[0]=a1;
        for(int d:a){
            System.out.print(d+",");
        }
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        getRotate(a);
    }


}
