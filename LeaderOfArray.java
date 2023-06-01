package NewPrepare;

import java.util.ArrayList;

public class LeaderOfArray {

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        int rt_value=arr[n-1];
         a.add(rt_value);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>rt_value){
                rt_value=arr[i];
                a.add(rt_value);
            }
        }
        for(int i=a.size()-1;i>=0;i--){
            System.out.print(a.get(i)+" ");
        }
        return a;
    }
    public static void main(String args[]){
        int n = 6;
        int A[] = {16,17,4,3,5,2};
        ArrayList<Integer> al=leaders(A,n);
    }
}
