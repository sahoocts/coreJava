package PrevPractice;

public class Largest_Sub_Array_With_Zero_sum {

    private static int getSubArray(int a[]){
        int maxL=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum==0){
                    maxL=Math.max(maxL,j-i+1);
                }
            }
        }
        return maxL;
    }
    public static void main(String args[]){
        int arr[]={15,-2,-1,1,2,-8,1,7,10,23};
        int x=getSubArray(arr);
        System.out.print(x);

    }


}
