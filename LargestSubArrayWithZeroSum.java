package LogicImplemented;

public class LargestSubArrayWithZeroSum {

    static int  LargeLen(int a[]){
        int n=a.length;
        int maxLen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+a[j];
                if(sum==0){
                    maxLen=Math.max(maxLen,j-i+1);
                }

            }
        }
        return maxLen;
    }

    public static void main(String args[]){

        int arr[]={15,-2,-1,1,2,-8,1,7,10,23};
        int result=LargeLen(arr);
        //System.out.println(result);
        for(int k=0;k<=result;k++){
            System.out.print(arr[k]);
        }
    }
}
