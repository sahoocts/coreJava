package Java8;
//for(Integer i1:l){
//System.out.println(i1);
//}

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//Replace with:
// l.stream().forEach(System.out::println);

//toArray()--to convert stream of object  to array
public class InsteadOfLoop {

    public static void main(String args[]){
        List<Integer> al= Arrays.asList(5,3,6,2);
        List<String> all=Arrays.asList("A","AAA","AAAA","AA");
        /*for(Integer k:al){
            System.out.println(k+"::");
        }*/
        List<Integer> alll= al.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> allls= al.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(allls);
        all.stream().forEach(System.out::println);
        Consumer<Integer> c= i->{
           // System.out.println(i*i);
        };
        //al.stream().forEach(c);
    }
}
