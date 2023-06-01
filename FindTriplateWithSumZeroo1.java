package TwentySeven;

public class FindTriplateWithSumZeroo1 {
    private static boolean findTriplets(int[] arr, int n) {
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]>0)
                    k--;

                else if (arr[i]+arr[j]+arr[k]<0)
                    j++;

                else
                    return true;

            }
        }
        return false;
    }


    public static void main(String args[]) {
      //  int arr[] = {0, -1, 2, -3, 1};
         int arr[] = { 1,2,3};
        int n = arr.length;
        if (findTriplets(arr, n)) {
            System.out.print("-1");
        } else {
            System.out.print("0");
        }
    }

}
