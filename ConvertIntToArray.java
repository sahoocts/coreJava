package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertIntToArray {
    public static void main(String args[]){
        List<Integer> al= Arrays.asList(5,3,6,2);
        Integer a[]=al.stream().toArray(Integer[]::new);
        Stream.of(a).forEach(System.out::println);
    }
}
