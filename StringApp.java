package Java8.MCQS;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class StringApp {
    public static void main(String args[]){
   //    String str=new String("null");
     //   StringBuilder b=new StringBuilder("null");
       // String s=null;
        //s=s.concat(str);
     // List<String> al=new ArrayList<>();
        HashMap<String,Integer> hs=new HashMap<String, Integer>();
      //  ConcurrentHashMap<String,Integer> hs=new ConcurrentHashMap<String, Integer>();
        hs.put("saroj2",3);
        hs.put("saroj1",2);
        hs.put("swws",9);
        hs.put("sdds",6);

    //  Iterator i=al.iterator();
        for(Map.Entry e:hs.entrySet()){

            hs.put("sahoo",4);
          //  System.out.println(e.getKey());
        }

    }
}
