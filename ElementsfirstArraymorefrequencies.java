package New_Leetcode;
import java.util.*;

public class ElementsfirstArraymorefrequencies {
    static void moreFreq(int ar1[], int ar2[], int m, int n)
    {
        // Traverse first array and store frequencies
        // of all elements
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0 ; i < m; i++)
        {
            if(mp.containsKey(ar1[i]))
            {
                mp.put(ar1[i], mp.get(ar1[i])+1);
            }
            else
            {
                mp.put(ar1[i], 1);
            }
        }

        // Traverse second array and reduce frequencies
        // of common elements.
        for (int i = 0; i < n; i++)
            if (mp.containsKey(ar2[i]))
                mp.put(ar2[i], mp.get(ar2[i])-1);

        // Now traverse first array again and print
        // all those elements whose frequencies are
        // more than 0. To avoid repeated printing,
        // we set frequency as 0 after printing.
        for (int i = 0; i < m; i++)
        {
            if (mp.get(ar1[i]) > 0)
            {
                System.out.print(ar1[i] + " ");
                mp.put(ar1[i], 0);
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int ar1[] = { 1, 2, 2, 2, 3, 3, 4, 5 };
        int ar2[] = { 2, 2, 3, 3, 3, 4 };
        int m = ar1.length;
        int n = ar2.length;
        moreFreq(ar1, ar2, m, n);
    }
}
