package GFS2311;

public class RotateArray {

    static int getRotate(int arr[], int n) {
        int min=arr[0];
        int ind=0;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                ind=i;
               // break;
            }
        }
        return ind;
    }


public static void main(String args[]) {
         int arr[]={5,1,2,3,4};
        int n=arr.length;
        int x=getRotate(arr,n);
        System.out.println(x);    }
}
