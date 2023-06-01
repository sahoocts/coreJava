package HackersRankk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortArrayAccordingToTheOther {

    public static void main(String args[]) {
        int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int A2[] = {2, 1, 8, 3};
        int a[] = getSort(A1, A2);
        for (int s : a) {
            System.out.print(s + " ");
        }
    }
    private static int[] getSort(int[] A1, int[] A2) {
        int arr[] = new int[A1.length];
        int c = 0;
        for (int i = 0; i < A2.length; i++) {
            for (int j = 0; j < A1.length; j++) {
                if (A2[i] == A1[j]) {
                    arr[c] = A1[j];
                    A1[j] = -1;
                    c++;
                }
            }
        }
        Arrays.sort(A1);
        for (int j = 0; j < A1.length; j++) {
            if (A1[j] != -1) {
                arr[c] = A1[j];
                c++;
            }
        }
        return arr;
    }
}


