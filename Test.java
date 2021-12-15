package JAVA8;

import java.util.function.Function;

public class Test {
//    public static int getInt(int n){
//        return n*n;
//    }



    public static void main(String args[]){
          ////using lamda java 7
        //System.out.println(Test.getInt(10));



        //  //using lamda java 8
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(5));

        //lambda expression




    }







}
