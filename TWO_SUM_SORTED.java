package Leetcode;

public class TWO_SUM_SORTED {
    public static int[] twoSum(int n[],int target) {
        int start=0;
        int end=n.length-1;
        while(start<end){
            if(n[start]+n[end]>target){
                end--;
            }
            else if(n[start]+n[end]<target){
                start--;
            }
            else{
                return new int[]{start,end};
            }
        }
         return new int[]{};
    }
    public static void main(String args[]) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int a[] = twoSum(nums, target);
        for (int d:a){
            System.out.print(d+" ");
        }
    }
}