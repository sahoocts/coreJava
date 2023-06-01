package NewClassAdded;

public class NextGreaterElement {
    public static void main(String args[]) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int s[]=nextGreaterElement(nums1, nums2);
        for(int h:s){
            System.out.print(h);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (temp == nums2[j]) {
                    if (j + 1 == nums2.length) {
                        res[i] = -1;
                        break;
                    } else {
                        int flag = 0;
                        for (int k = j + 1; k < nums2.length; k++) {
                            if (nums2[k] > nums2[j]) {
                                res[i] = nums2[k];
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0)
                            res[i] = -1;
                    }
                }
            }
        }
        return res;
    }
}