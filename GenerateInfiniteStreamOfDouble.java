package JAVA8.NewProgram;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class GenerateInfiniteStreamOfDouble {
    public static void main(String args[]){
        DoubleStream.iterate(0, i->i+1).forEach(System.out::println);
        //Generate Infinite Stream of Integers in Java
        IntStream.iterate(0,i->i+1).forEach(
                System.out::println
        );
    }
}
