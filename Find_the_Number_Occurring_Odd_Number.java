package LogicImplemented;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_the_Number_Occurring_Odd_Number {

    private static void getOddNumerOfTimes(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else
                hs.put(arr[i],1);
        }

       // Set<Integer,Integer> s=hs.entrySet();
        for(Map.Entry en:hs.entrySet()){
          //  System.out.println(en.getKey()+"::"+en.getValue());
            int s= (int) en.getValue();
            if(s%2!=0){
                System.out.println(en.getKey());
            }
        }

    }
    public static void main(String args[]){

        int arr[]={1,2,3,2,3,1,3,5,5,5,5,5,5,5};

        getOddNumerOfTimes(arr);

    }

//in array 3 and 5 number are odd acrance so print
}
