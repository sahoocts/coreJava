package NewClassAdded;

public class MaximumLengthOfSubarraySubarrayIsEven {
    public static void main(String args[]){
       int arr[] = {1, 2, 3, 4,2, 1, 4};
       int s=0;
       int max=0;
       int maxL=0;
       for(int i=0;i<arr.length;i++){
           s=s+arr[i];
           if(s%2==0){
               if(s>max){
                   max=s;
                   maxL=Math.max(maxL,i);
               }
           }
       }
       System.out.println(maxL);
    }
}
