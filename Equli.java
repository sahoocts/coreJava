public class Equli {
    public static void main(String args[]){
        int n = 5;
       long  A[] = {1,3,5,2,2};
      //  int A[] = {1};
      int x= getEquli(A,n);
      System.out.print(x);

    }

    private static int getEquli(long[] a, int n) {
        if(a.length==1){
            return 1;
        }
        long rightSum=0;
        long leftSum=0;
        for(int i=0;i<n;i++){
            rightSum=rightSum+a[i];
        }
        for(int i=0;i<n;i++){
            rightSum=rightSum-a[i];

            if(rightSum==leftSum){
                return i+1;
            }
            leftSum=leftSum+a[i];
        }
        return -1;
    }
}
