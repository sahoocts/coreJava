package HackersRank_06062022;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String args[]){
        /*HashMap<Integer,String> hs=new HashMap<>();
        hs.put(null,"saroj1");
        hs.put(null,"saroj2");
        hs.put(null,"saroj3");
        hs.put(null,"saroj4");
        for(Map.Entry<Integer,String> e:hs.entrySet()){
            System.out.print(e.getKey()+"::"+e.getValue());
            System.out.println();


        }

        System.out.print(hs.size());*/

        int digit=11224;

      //  int a=12;
        int b=0;
        int c=0;
       while(digit>0){
           c=digit%10;
           digit =digit/10;
           System.out.print("digit::"+digit+"::");
           System.out.println("c"+c);

       }








    }
}
