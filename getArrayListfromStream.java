package JAVA8.NewProgram;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class getArrayListfromStream {
    public static void main(String args[]){
        Stream s=Stream.of(1,2,3,4);
       ArrayList<Integer> l= getarrayList(s);
        
    }

    private static <T>ArrayList<T> getarrayList(Stream<T> s) {
        List<T> list=s.collect(Collectors.toList());
        ArrayList<T> al=new ArrayList<T>(list);
        return  al;

    }
}
