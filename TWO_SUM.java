package Leetcode;

import java.util.HashMap;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TWO_SUM {

    public static int[] twoSum(int n[],int target){

        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<n.length;i++){
            hs.put(n[i],i);
        }
        for(int i=0;i<n.length;i++){
            int num=n[i];
            int rem=target-num;
            if(hs.containsKey(rem)){
                int index=hs.get(rem);
                if(index==i)
                    continue;
                return new int[]{i,index};
            }
        }
  return new int[]{};
    }
   public static void main(String args[]){
       int nums[] = {2,7,11,15};
       int  target = 9;
       int a[]=twoSum(nums,target);
       for (int s:a){
           System.out.print(s+" ");
       }
   }
}
