package LogicImplemented;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraterApp {
     static Iterator fun(ArrayList myList){
         Iterator it1=myList.iterator();
         while(it1.hasNext()){
             Object ele=it1.next();
             if(ele instanceof String)
                 break;
         }
            return it1;


    }


    public static void main(String args[]){
        ArrayList myList=new ArrayList();
        myList.add("42");
        myList.add("10");
        myList.add("###");
        myList.add("Hello");
        myList.add("Java");

        Iterator it=fun(myList);

        while(it.hasNext()){
            Object el=it.next();
            System.out.println((String)el);
        }


    }


}
