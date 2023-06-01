package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    public static void main(String args[]) {
        int a[] = {3, 1, 2, 3, 8};
        int c=findDuplicate(a);
        System.out.print(c);
    }


    public static int findDuplicate(int[] nums) {
        int x = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int s : nums) {
            if (!set.contains(s)) {
                set.add(s);
            } else {
                x = s;
            }
        }
        return x;
    }
}