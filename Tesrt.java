package Java8;

public class Tesrt {

    public static void main(String args[]){
        int a[]={15, -2, 2, -8, 1, 7, 10, 23};
       int x= getH(a);
       System.out.println("::;"+x);
    }

    private static int getH(int[] a) {

        int mx=1;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(0==sum){
                    mx=Math.max(mx,j);
                }
            }
        }
        return mx;
    }
}
