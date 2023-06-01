package LogicImplemented;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayToArrayList {

    public static void main(String args[]){
      //  int a[]={1,2,3,4,5};
       // ArrayList<Integer> al=new ArrayList<Integer>();
      /*  for(int i:a){
            al.add(i);
        }*/

        /*Iterator i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }*/

        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
       int a[]=new int[al.size()];
       for(int i=0;i<al.size();i++){
           a[i]=al.get(i);
       }

       for(int c:a){
           System.out.print(c);
       }
    }
}
