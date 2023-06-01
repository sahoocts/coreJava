package JAVA8.Programs;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

    public static void main(String args[]){
        List<Integer> v= Arrays.asList(45,15,2,4,11,5,4,3,2,3);
        v.stream().findFirst().ifPresent(System.out::println);

        int max=v.stream().max(Integer::compare).get();
        int min=v.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
