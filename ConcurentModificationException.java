package AddDigit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurentModificationException {

    public static void main(String args[]){

       // CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<String>();
        List<String> al=new ArrayList<String>();
        List<String> all= Arrays.asList("saroj1","saroj2","saroj3","saroj4");
        al.addAll(all);

        Iterator<String> it=al.iterator();
        while(it.hasNext()){
            String s=it.next();
           // System.out.println(s);
            if(s.equals("saroj1")){
               // it.remove();
                al.add("hi");
            }

        }
   for(String ss:al){
       System.out.println(ss);
   }

    }
}
