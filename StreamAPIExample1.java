package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample1 {
    public static void main(String args[]){

    List<String> al= Arrays.asList("ac","","sa");

    List<String> s=al.stream().filter(d->!d.isEmpty()).collect(Collectors.toList());
 System.out.println(s);
}
}
