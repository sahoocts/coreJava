import java.util.Arrays;
//Given two arrays, A and B, of equal size n, the task is to find the minimum value of
// A[0] * B[0] + A[1] * B[1] +…+ A[n-1] * B[n-1]. Shuffling of elements of arrays A and B is allowed.
public class sumOfProduct {
    public static void main(String args[]){
        long A[] = { 3, 1, 1 };
        long B[] = { 6, 5, 4 };
        int n = A.length;
        ;
       // System.out.println(minValue(A, B, n));
        System.out.println(minValue(A,B,n));
    }

    private static long minValue(long[] a, long[] b, int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        long res=0;
        for(int i=0;i<n;i++){
            res+=(a[i]*b[n-i-1]);
        }
       return res;
    }
}
