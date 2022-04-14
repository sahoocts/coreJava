package Geeksforgeeks;

import java.util.HashMap;

public class FirstNonRepeating {
    public static int firstNonRepeating(int arr[], int n)
    {
        // Complete the function
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else{
                hs.put(arr[i],1);
            }
        }
        for(int j=0;j<n;j++){
            if(hs.get(arr[j])==1){
                return arr[j];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[] = {-1, 2, -1, 3, 2};
        int n=arr.length;
        int x=firstNonRepeating(arr,n);
        System.out.println(x);
    }
}
