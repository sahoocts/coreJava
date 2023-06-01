package NewPrepare;

public class MoveZeroToLast {
    public static void main(String[] args) {

        // int n=4;
        int k=6;
        int a[]={1,0,2,0,3,0,4,5};
        int b[]=new int[a.length];
        int x=a[a.length-1];
        int n=a.length;
        // System.out.println(x);
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                b[i]=a[j];
                j++;
            }
        }

        for(int s:b){
            System.out.println(s);
        }
        //  System.out.println("Hello, World!");

    }
}
