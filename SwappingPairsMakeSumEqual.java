package NewPrepare;

public class SwappingPairsMakeSumEqual {
    static int getSum(int X[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += X[i];
        return sum;
    }

    // Function to prints elements to be swapped
    static void findSwapValues(int A[], int n, int B[], int m)
    {
        // Calculation of sums from both arrays
        int sum1 = getSum(A, n);
        int sum2 = getSum(B, m);
       // System.out.println(sum1);
       // System.out.println(sum2);

        // Look for val1 and val2, such that
        // sumA - val1 + val2 = sumB - val2 + val1
        int newsum1, newsum2, val1 = 0, val2 = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                newsum1 = sum1 - A[i] + B[j];
                System.out.println("The new sum is"+newsum1);
                newsum2 = sum2 - B[j] + A[i];
                System.out.println("The new sum is"+newsum2);
                if (newsum1 == newsum2)
                {
                    val1 = A[i];
                    val2 = B[j];
                }
            }
        }

        System.out.println(val1+" "+val2);
    }

    // driver program
    public static void main (String[] args)
    {
        int A[] = { 4, 1, 2, 1, 1, 2 };
        int n = A.length;
        int B[] = { 3, 6, 3, 3 };
        int m = B.length;

        // Call to function
        findSwapValues(A, n, B, m);
    }
}
