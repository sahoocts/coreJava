package JAVA8.StreamAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String args[]){
       /* String names[]={"saroj","kumar","sahoo"};
        Stream<String> s1= Stream.of(names);
        s1.forEach(e->{
            System.out.println(e);
        });*/
         //saroj
        // kumar
        // sahoo

        String n[]={"abc","def","ghi"};
        List<String> ls=Arrays.asList(n);
        ls.stream().forEach(e->System.out.println(e));

        List<Integer> l1= Arrays.asList(10,15,20,25);
        List<Integer> l2= Arrays.asList(4,1,2,7,0);
        //add grace mark for the student you need to use map interface
        List<Integer> marks=l1.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(marks);

        List<Integer> l5=l1.stream().map(i->i+5).collect(Collectors.toList());
        //filter the marks those are having greater than 10
       List<Integer> grtMark= l1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(grtMark);
          //filter the marks those are having less than 20 and failed
        long failedStudent=l1.stream().filter(x->x<20).count();
        System.out.println("failedStudent:::"+failedStudent);
        //Sorting order naturaly
      List<Integer> sortingOrder=  l2.stream().sorted().collect(Collectors.toList());
      System.out.println("::"+sortingOrder);

    }

}
