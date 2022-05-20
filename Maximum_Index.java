package nighteen_four;

public class Maximum_Index {
    static int maxIndexDiff(int A[], int N) {
        // Your code here
        int index = 0; int max_diff = -1;
        for(int i = 0; i < N; i++){
            int j = index + 1;
            while(j<N){
                if(A[i] <= A[j]){
                    int diff = j - i;
                    max_diff = Math.max(diff, max_diff);
                    index = j;
                }
                j++;
            }
        }
        return max_diff;

    }
    public static void main(String args[]){
        int N = 9;
        int A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int x=maxIndexDiff(A,N);
        System.out.print("x is"+x);
    }
}
