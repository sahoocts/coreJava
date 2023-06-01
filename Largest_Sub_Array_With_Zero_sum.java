package LogicImplemented;

import java.util.HashMap;

public class Largest_Sub_Array_With_Zero_sum {

    public static void main(String args[]){

        int arr[]={15,-2,-1,1,2,-8,1,7,10,23};
        System.out.println(getSubArray(arr));
    }
    private static int getSubArray(int[] arr) {
        int maxLen=0;
       // HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    maxLen=Math.max(maxLen,j-i+1);
                    //int len=j-i+1;
                    /*if(len>maxLen){
                        maxLen=len;
                        //hs.put(maxLen,i);
                    }*/
                }
            }

        }
        return maxLen;
    }
}
