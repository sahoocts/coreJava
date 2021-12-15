package JAVA8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class ForEachApp {

    public static void main(String args[]){
        List<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.forEach(i->System.out.println(i));

    }
}
