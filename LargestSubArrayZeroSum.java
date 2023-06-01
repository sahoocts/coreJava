package Practice;

public class LargestSubArrayZeroSum {
    private static int getLargestSubArray(int a[]){

        int maxL=0;
        for(int i=0;i<a.length;i++){
            //int sum=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==0){
                    maxL=Math.max(maxL,j-i);

                }
            }
        }
        return maxL;
    }

    public static void main(String args[]){

        int arr[]={15,-2,-1,1,2,-8,1,7,10,23};
        int x=getLargestSubArray(arr);
        System.out.print("MaxL is"+x);

    }

}
