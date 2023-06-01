package HackersRankk;
//Input:
//n = 10
//arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}

//Output: 4
//Explanation: The 4 subarrays are [-1 -3 4]
//[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
public class ZeroSumSubArray {

    public static void main(String args[]){
        int a[]={6,-1,-3,4,-2,2,4,6,-12,-7};
        getZeroSumSubArray(a);
    }

    private static void getZeroSumSubArray(int[] a) {
        int c=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum==0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
