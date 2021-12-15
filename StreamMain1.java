package JAVA8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String args[]){
        List<Integer> l=List.of(1,5,3,60,11,20,7);
       // List l1= Arrays.asList(2,3,4,5);
        //System.out.print(l1);

  /*      List<Integer> ev=new ArrayList<>();
  for(Integer i:l){
      if(i%2==0){
          ev.add(i);
      }
  }
  System.out.println(ev);
*/
      //  System.out.println("::"+l3);

        //List l3=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> greater= l.stream().filter(i->i>10).collect(Collectors.toList());
        Stream<Integer> s=l.stream();
        List<Integer> e=s.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(greater);


    }
}
