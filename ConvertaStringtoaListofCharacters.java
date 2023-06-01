package JAVA8.NewProgram;

import java.util.List;
import java.util.stream.Collectors;

import java.util.*;
public class ConvertaStringtoaListofCharacters {
    public static void main(String args[]){
        String s="saaroj";
        List<Character> li=s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        li.stream().filter(e->e=='a').forEach(System.out::println);
        System.out.print(li);

        //List of Integers to a List of Strings
        List<Integer> INTEGER_LIST = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<String> exp=INTEGER_LIST.stream().map(e->e.toString()).collect(Collectors.toList());
        System.out.print(exp);

    }
}
