package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class THREE_SUM {

    static List<List<Integer>> res=new ArrayList<>();
    public static List<List<Integer>> threeSum(int nums[]){
        int n=nums.length;
        Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(i==0 || nums[i-1]!=nums[i]){
                    twoSorted(i+1,n-1,nums,0-nums[i]);
                }

            }
            return res;
    }

   static void twoSorted(int start, int end, int[] nums, int target) {
        int a1=nums[start-1];
        while(start<end){
                if(nums[start]+nums[end]>target){
                    end--;
                }
              else if(nums[start]+nums[end]<target){
                start++;
            }
              else{
                  List<Integer> list=new ArrayList<>();
                  list.add(a1);list.add(nums[start]);list.add(nums[end]);
                    res.add(list);
                  while(start<end && nums[start]==nums[start+1])start++;
                  while(start<end && nums[end]==nums[end-1])end--;
                  start++;
                  end--;
                }
        }
    }


    public static void main(String args[]){
       int nums[]= {-1,0,1,2,-1,-4};
       List<List<Integer>> l=threeSum(nums);
       System.out.print(l);
   }
}
