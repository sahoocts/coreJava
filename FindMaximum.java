package Infinity;

public class FindMaximum {
    private static int getFindMaximum(int[] a) {
        int n=a.length;
        int maxDif=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(a[j]>a[i] && maxDif<(j-i)){
                    maxDif=j-i;
                }
            }
        }
        return maxDif;
    }
    public static void main(String args[]){
        int a[]={ 9, 2, 3, 4, 5, 6, 7, 8, 18, 0 };
        int x=getFindMaximum(a);
        System.out.print(x);

    }


}
