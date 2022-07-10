package Java8;

import java.util.Arrays;
import java.util.List;

public class MinElement {

    public static void main(String args[]){
        List<Integer> al= Arrays.asList(5,2,1,6,2);

             Integer l1=al.stream().min((s1,s2)->s1.compareTo(s2)).get();
             Integer l2= al.stream().max((s1,s2)->s1.compareTo(s2)).get();
             System.out.println(l1);
             System.out.println(l2);

    }
}
