package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingJava8 {
    public static void main(String args[]){
        Integer a[]={1,2,3,4,5,6};
        List<Integer> l=Arrays.asList(a);
      //  Arrays.stream(a).filter(i->i%2==0).forEach(e->System.out.print(e));
        List<Integer> f=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.print(f);

    }
}
