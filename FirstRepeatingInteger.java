package Geeksforgeeks;

import java.util.HashMap;

public class FirstRepeatingInteger {

    static int getRepeatingInteger(int a[]){
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
       // HashMap<Integer,Integer> hss=new HashMap<Integer,Integer>();


        for(int i:a){
            if(hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }
            else{
                hs.put(i,1);
            }
        }
        for(int j=0;j<a.length;j++){
            if(hs.get(a[j])>1){
                return j+1;
            }

        }
        return -1;
    }

    public static void main(String args[]){

       int n = 7;
       int arr[] = {1, 5, 3, 4, 3, 5, 6,7,7,7};

       // int arr1[] = {1,1,2,2,2,3,4,4,4,4,4,6,7,7,7};
        getRepeatingInteger(arr);
       int s=getRepeatingInteger(arr);
     //  System.out.println(s);
    }
}
