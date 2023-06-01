package TwentySeven;

public class MaximumProductSubarray {

        /* Returns the product of max product subarray.*/
        static long maxSubarrayProduct(int arr[])
        {
            // Initializing result
            /*int result = arr[0];
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                int mul = arr[i];
                // traversing in current subarray
                for (int j = i + 1; j < n; j++) {
                    // updating result every time to keep an eye
                    // over the maximum product
                    result = Math.max(result, mul);
                    mul= mul *arr[j];
                }
                // updating the result for (n-1)th index.
                result = Math.max(result, mul);
            }
            return result;*/
            int n = arr.length;
            long currmax = 1;
            long msf = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                currmax=currmax*arr[i];
                msf=Math.max(msf,currmax);
                if(currmax==0){
                    currmax=1;
                }
            }
            currmax=1;
            for(int i=n-1;i>=0;i--){
                currmax=currmax*arr[i];
                msf=Math.max(msf,currmax);
                if(currmax==0){
                    currmax=1;
                }
            }
            return msf;
        }

        // Driver Code
        public static void main(String[] args)
        {
            int arr[] = {6, -3, -10, 0, 2};
            System.out.println("Maximum Sub array product is "
                    + maxSubarrayProduct(arr));
        }
    }

// This code is contributed by Aditya Kumar (adityakumar129)

