package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareIntegerValue {

    public static void main(String args[]){
        List<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(1);
        al.add(11);
        al.add(30);
        Comparator<Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2) ?-1:0;
        Collections.sort(al,c);
        for(Integer a1:al){
            System.out.println(a1);
        }
    }
}
