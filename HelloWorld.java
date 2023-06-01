package Geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

class HelloWorld {
    static void gteDup(int arr[]){
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else{
                hs.put(arr[i],1);
            }
        }
        //System.out.print("e.getKey()");
        int t=1;
        for(Map.Entry e:hs.entrySet()){
            // System.out.print(e.getValue());
            int a= (int) e.getValue();
            System.out.print(a);
            //   if(a==1){
            //        System.out.println(e.getKey());
            //  }
        }

    }

    public static void main(String args[]){
        int a[]={1, 2, 3, 2, 1, 4};
        gteDup(a);

    }
}
