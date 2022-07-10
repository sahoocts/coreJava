package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortedExample {
    public static void main(String args[]){
        List<Integer> al= Arrays.asList(5,2,1,6,9,3);
        List<String> all=Arrays.asList("sachin","Elina","aradhya","Nilamani");

        //  long s=al.stream().filter(i->i<40).count();
        List<Integer> s= al.stream().sorted().collect(Collectors.toList());//assending sorting order
        List<Integer> s1=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(
                Collectors.toList()//comparater//decending sorting order
        );

        List<Integer> s2=al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(
                Collectors.toList());

        List<String> s12=all.stream().sorted((s11,s22)->-s11.compareTo(s22)).collect(Collectors.toList());//comparater//decending sorting order
        List<String> s13=all.stream().sorted((s11,s22)->s11.compareTo(s22)).collect(Collectors.toList());//assending sorting order
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s12);
        System.out.println(s13);
    }
    }

