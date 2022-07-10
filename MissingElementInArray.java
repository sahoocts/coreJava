import java.util.Arrays;

public class MissingElementInArray {

    public static void main(String args[]){
        int N = 10;
        int A[] = {6,1,2,8,3,4,7,10,5};
        getMissingElement(A,N);
    }

    private static void getMissingElement(int[] a, int n) {
        Arrays.sort(a);
        int B[]=new int[n];
        for(int i=0;i<n;i++){
            B[i]=i+1;
        }
        for(int i=0;i<B.length-1;i++){
            if(a[i]!=B[i]){
                System.out.print("missing element is"+B[i]);
            }
        }
    }
}
