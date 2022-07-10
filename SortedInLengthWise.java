package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedInLengthWise {
    public static void main(String args[]){
        List<Integer> al=Arrays.asList(5,2,1,6,2);
        List<String> all= Arrays.asList("A","AAA","AAAA","AA");
        Comparator<String> c=(s1,s2)->{
            int l1=s1.length();
            int l2=s2.length();
            if(l1<l2) return -1;
            else if(l1>l2) return 1;
            else return s1.compareTo(s2);
        };

        List<String> l=all.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l);
    }
}
