package nighteen_four;

import java.util.HashMap;
import java.util.Map;

public class HashExample {

    public static void main(String args[]){
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        hs.put(1,10);
        hs.put(1,20);
        hs.put(1,30);
        hs.put(1,40);
        hs.put(1,50);
        hs.put(1,60);

        System.out.println(hs.size());
        for(Map.Entry e:hs.entrySet()){
            System.out.println(e.getKey()+"::"+e.getValue());
        }
    }
}
