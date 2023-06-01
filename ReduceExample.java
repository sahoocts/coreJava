package JAVA8.StreamAPI;
import java.util.*;
public class ReduceExample {
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
       // int c=Arrays.stream(num).reduce(0,(a,b)->a+b);
        int c=Arrays.stream(num).reduce(0,(a,b)->(a+b));
        System.out.print(c);
    }
}
