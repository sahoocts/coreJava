package Java8;

import java.util.*;

public class FindDuplicate {
    public static void main(String args[]){
        List<Integer> al= Arrays.asList(1,2,98,98,20,20);
        Set<Integer> set=new HashSet<Integer>();
        al.stream().filter(n->!set.add(n)).forEach(System.out::println);

    }
}
