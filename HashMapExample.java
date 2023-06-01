package PrevPractice;

import java.util.HashMap;
import java.util.*;

public class HashMapExample {

    public static void main(String args[]){
        HashMap<Character,Integer> hs=new HashMap<>();
        hs.put('A',100);
        hs.put('B',200);
        for(Map.Entry en:hs.entrySet()){
            System.out.println(hs.get(en.getKey()));
        }
      //  System.out.print(hs.get('A'));
    }
}
