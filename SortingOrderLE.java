package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingOrderLE {
    public static void main(String args[]){
        List<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(8);
        al.add(23);
       // Comparator r=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
       //
        // Collections.sort(al,(i1,i2)->(i1>i2)?1:(i1<i2)?-1:0);

        Collections.sort(al,(i1,i2)->(i1>i2)?1:(i1<i2)?-1:0);
        System.out.println(al);
    }


}
