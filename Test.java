package Geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class Test {
    static void gethash(int a[]){

        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hs.containsKey(a[i])){
                hs.put(a[i],hs.get(a[i])+1);
            }
            else{
                hs.put(a[i],1);
            }

        }
        for(Map.Entry es:hs.entrySet()){
            System.out.println(es.getKey()+"::"+es.getValue());
        }
    }
    public static void main(String args[]){

        int a[]={1,2,3,4,1,2,3,4};
        gethash(a);
    }
}
