package JAVA8;

import java.util.function.Predicate;

public class NumberIsOddOrEven {

    public static void main(String args[]){
        Predicate<Integer> f=i->i%2==0;
        System.out.print(f.test(10));
    }
}
