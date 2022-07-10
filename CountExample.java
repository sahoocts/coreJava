package Java8;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String args[]){
       // public static void main(String[] args) {
            List<Integer> al= Arrays.asList(10,20,30,40,50,60);
            long s=al.stream().filter(i->i<30).count();
            System.out.println(s);
        }
    }

