package LogicImplemented;
import java.util.ArrayList;
import java.util.HashMap;
public class Print_all_triplets_in_sorted_array_that_form_AP {
    static void printAllAPTriplets(int []arr, int n)
    {
        ArrayList<Integer> s =
                new ArrayList<Integer>();
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                // Use hash to find if
                // there is a previous
                // element with difference
                // equal to arr[j] - arr[i]
                int diff = arr[j] - arr[i];
                boolean exists =
                        s.contains(arr[i] - diff);

                if (exists)
                    System.out.println(arr[i] - diff +
                            " " + arr[i] +
                            " " + arr[j]);
            }

            s.add(arr[i]);
        }
    }// Driver code
    public static void main(String args[])
    {
        int []arr = {3, 5, 6, 7, 8, 10, 12};
        int n = arr.length;
        printAllAPTriplets(arr, n);
    }
    }


