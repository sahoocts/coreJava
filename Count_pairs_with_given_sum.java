package Geeksforgeeks;

import java.util.HashMap;

class Pair{
    public int i;
    public int j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }

}
public class Count_pairs_with_given_sum {

    static HashMap<Integer,Integer> getPairs(int arr[],int k){
        HashMap<Integer,Integer> hs=new HashMap<>();
        int n=arr.length;
        Pair p=null;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                      // p=new Pair(i,j);
                    hs.put(i,j);
                }
            }
        }
      return hs;
    }

    public static void main(String args[]){
        int N = 4, K = 6;
        int arr[] = {1, 5, 7, 1};
        HashMap<Integer,Integer> p1=getPairs(arr,K);
       System.out.println(p1.size());
    }
}
