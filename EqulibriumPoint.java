public class EqulibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(arr.length==1){
            return 1;
        }
        long rs=0;
        long ls=0;
        for(int i=0;i<n;i++){
            rs=rs+arr[i];
        }
        for(int i=0;i<n;i++){
            rs-=arr[i];
            if(rs==ls){
                return i+1;
            }
            ls=ls+arr[i];
        }
        return -1;
    }
    public static void main(String args[]){

        int n = 5;
        long A[] = {1,3,5,2,2};
       int x= equilibriumPoint(A,n);
       System.out.print(x);
    }
}
