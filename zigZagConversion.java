
import java.io.*;
import java.util.*;

public class zigZagConversion {
    /*package whatever //do not write package name here */


        // Method for zig-zag conversion of array
        static void swap(int a[], int i, int j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        static void zigZag(int a[], int n)
        {
            for (int i = 1; i < n; i += 2) {
                // Check if previous element
                // is greater then the current element
                // then swap them
                if (a[i - 1] > a[i])
                    swap(a, i, i - 1);
                // if next element is greater then
                // then the current element then
                // also swap them.
                if (i + 1 < n && (a[i + 1] > a[i]))
                    swap(a, i, i + 1);
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            int a[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
            zigZag(a, a.length);
            System.out.println(Arrays.toString(a));
        }
    }


