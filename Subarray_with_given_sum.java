package Geeksforgeeks;

import java.util.ArrayList;

public class Subarray_with_given_sum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int j=0;j<n;j++){
            int sum=0;
            for(int k=j;k<n;k++){
                sum=sum+arr[k];
                if(sum==s){
                    al.add(j);
                    al.add(k);

                }
            }
            if(al.size()==2){
              break;
            }
        }

        return al;
    }
    public static void main(String args[]){

        int N = 5, S = 12;
        int A[] = {1,2,3,7,5};
        ArrayList<Integer> s=subarraySum(A,N,S);
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
    }
}
