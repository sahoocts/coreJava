package Leetcode;

public class NexTgreater {
    public static int[] nextGreater(int[] nums1,int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        int res[]=new int[nums1.length];
        for(int i=0;i<n1;i++){
            int temp=nums1[i];
            for(int j=0;j<n2;j++) {
                if (temp == nums2[j]) {
                    if (j + 1 == nums2.length) {
                        res[i] = -1;
                        break;
                    } else {
                        int flag = 0;
                        for (int k = j + 1; k < n2; k++) {
                            if (nums2[k] > nums2[j]) {
                                res[i] = nums2[k];
                                flag=-1;
                                break;

                            }
                        }
                        if (flag == 0) {
                            res[i] = -1;
                        }

                    }
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int a[]=nextGreater(nums1,nums2);
        for(int d:a){
            System.out.print(d);
        }
    }
}
