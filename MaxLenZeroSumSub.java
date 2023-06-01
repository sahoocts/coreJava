package NewPrepare;

public class MaxLenZeroSumSub {

    public static void main(String args[]){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
       int c= getMax(arr);
       System.out.println(c);
    }
    private static int getMax(int[] arr) {
        int maxL=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i;j<arr.length;j++){
                s=s+arr[j];
                if(s==0){
                maxL=Math.max(maxL,j-i+1);
                }
            }
        }
        return maxL;
    }
}
