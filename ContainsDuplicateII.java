package Leetcode;

import java.util.HashMap;

//Given an integer array nums and an integer k, return true if there are
// two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
public class ContainsDuplicateII {

    public static void main(String args[]){

        int k=3;
        int a[]={1,2,3,1};
       boolean b= containsNearbyDuplicate(a,k);
    System.out.print(b);
        }

    private static boolean containsNearbyDuplicate(int[] a, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hs.containsKey(a[i])){
                int x=hs.get(a[i]);
                hs.put(a[i],i);
                if(Math.abs(x-i)<=k){
                    return true;
                }
            }
            else{
                hs.put(a[i], i);
            }
        }
        return false;
    }
}

