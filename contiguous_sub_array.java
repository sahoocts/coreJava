package nighteen_four;

public class contiguous_sub_array {
//{1,2, 3, -2, 5;
    //travrse and sum it and return max sum
  static  long maxSubarraySum(int arr[], int n){

        // Your code here
        int max=-10;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }

    public static void main(String args[]){
       int arr[]={1,2, 3, -2, 5};
       // int arr[] = {-1,-2,-3,-4};
        int n=arr.length;
       long x= maxSubarraySum(arr,n);

           System.out.println(x);
       }
    }

