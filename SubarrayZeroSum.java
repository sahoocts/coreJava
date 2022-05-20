package Eighteen_four;

import java.util.HashSet;

//4, 2, -3, 1, 6
//4
public class SubarrayZeroSum {
    static boolean findsum(int arr[],int n)
    {
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int val : arr){
            sum =sum+ val;
            if(sum==0){
                return true;
            }
            if(hs.contains(sum)){
                return true;
            }
            else{
                hs.add(sum);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int n=5;
        int a[]={4, 2, -3, 1, 6};
        boolean x=findsum(a,n);
        System.out.println(x);
    }
}
