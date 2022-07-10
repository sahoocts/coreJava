public class EquilibriumPoint {
  //  public static void main(String args[]) {

    int equilibrium(int arr[], int n)
    {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < n; i++)
            sum=sum+arr[i];

        for (int i = 0; i < n; i++) {
            sum=sum-arr[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum=leftsum+arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        EquilibriumPoint equi = new EquilibriumPoint();
        int arr[] = {1,3,5,2,2};
        int arr_size = arr.length;
        System.out.println("First equilibrium index is " +
                equi.equilibrium(arr, arr_size));
    }
    }

