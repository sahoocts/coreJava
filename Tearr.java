public class Tearr {
  public static void main(String args[]){

             int N = 5, K = 16;
             int Arr[] = {9, 7, 2, 16, 4};
       int A[] = {5, 7, 9, 3, 6, 2};
        int B[] = {1, 2, 6, -1, 0, 9};
        int n=A.length;
        int m=B.length;
       long c= find_multiplication(A,B,n,m);
       System.out.println(c);
    }


        public static long find_multiplication (int arr[], int brr[], int n, int m) {
            // Complete the Function
            int max=arr[0];
            int min=brr[0];
            long p=0;
            for(int i=0;i<n;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }

            for(int i=0;i<m;i++){
                if(min>brr[i]){
                    min=brr[i];
                }
            }
            p=(long)max*min;
            return p;
        }



    }
