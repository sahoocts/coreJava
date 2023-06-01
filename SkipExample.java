package JAVA8.StreamAPI;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

public class SkipExample {
    public static Stream<String> skip_fun(Stream<String> str,int a){
        return str.skip(a);
    }
    public static void main(String args[]){
        List<String> l=new ArrayList<String>();
        l.add("saroj1");
        l.add("saroj2");
        l.add("saroj3");
        l.add("saroj4");
        l.add("saroj5");
        Stream<String> s=l.stream();
        Stream<String> d=skip_fun(s,3);
        d.forEach(System.out::println);
    }
}
