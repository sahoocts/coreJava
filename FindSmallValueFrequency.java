package Kushal;

public class FindSmallValueFrequency {

    static int frequencyOfSmallest(int n, int arr[])
    {
        int mn = arr[0], freq = 1;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] < mn)
            {
                mn = arr[i];
               freq = 1;
            }
            else if (arr[i] == mn)
                freq++;
        }
       /* for (int j = 0; j < n; j++) {
             if (arr[j] == mn)
                freq++;
        }*/
        return freq;
    }

    // Driver Code
    public static void main (String[] args)
    {

        int arr[] = {3,5,3,1,5,1,1,5,4,4};
        int N = arr.length;
       // int arr[] ={4, 3, 5, 3, 3, 6};
        System.out.println (frequencyOfSmallest(N, arr));
    }
}
