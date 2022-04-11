package NewTry;

//Questions:Mth element after K Right Rotations of an Array

public class FindMthElement_after_K_Right_Rotations_of_an_Array {
    // Function to return Mth element of
// array after k right rotations
    static int getFirstElement(int a[], int N,int K, int M)
    {
        // The array comes to original state
        // after N rotations
        K=K%N;
        int index;
        // If K is greater or equal to M
        if (K >= M)
            // Mth element after k right
            // rotations is (N-K)+(M-1) th
            // element of the array
            index = (N - K) + (M - 1);
            // Otherwise
        else
            // (M - K - 1) th element
            // of the array
            index = (M - K - 1);

        int result = a[index];

        // Return the result
        return result;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 10, 25, 11, 12 };
        int N = 4;
        int K = 2, M = 2;

        System.out.println(getFirstElement(a, N, K, M));
    }
}
