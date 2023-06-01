package HackersRankk;
import java.util.Arrays;
import java.util.HashMap;
public class MinSwap {
    public static int minSwaps(int nums[]) {
        // Code here
        int n = nums.length;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nums[i];
        }
        Arrays.sort(a);
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hs.put(a[i], i);
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            while (hs.get(nums[i]) != i) {
                c++;
                swap(nums, hs.get(nums[i]), i);
            }
        }
        return c;
    }

    public static void swap(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String args[]){
        int nums[] = {2, 8, 5, 4};
        int minswap=minSwaps(nums);
        System.out.println(minswap);
    }
}
