package Geeksforgeeks;

//An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
//Given an array arr[] of size N, find the index of any one of its peak elements.
//N = 3
//arr[] = {1,2,3}
//Output: 2
//Explanation: index 2 is 3.
//It is the peak element as it is
//greater than its neighbour 2.
public class PeekElements {
    public static int getPeekElement(int arr[],int n){
        int max=arr[0];
        int index=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3};
        int N=3;
        int x=getPeekElement(arr,N);
        System.out.println("The index is:"+x);

    }
}
