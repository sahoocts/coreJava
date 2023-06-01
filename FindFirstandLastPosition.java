package LeetcodeNew;



//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
public class FindFirstandLastPosition {
    public static void main(String args[]){
        int nums[]= {5,7,7,8,8,10};
        int target = 8;
        int a[]=searchRange(nums,target);
    }

    private static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    private static int search(int[] nums, int target, boolean findfirstIndex) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=end-1;
            }
            else{
                ans=mid;
                if(findfirstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
