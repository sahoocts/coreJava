package Java8;

import java.util.function.Function;
//Lambda Expression:It is a anonymous function,without name,without return type,without modifier
//concise of code ,reduce the code

public class LambdaExpression {
   /* public static int squre(int a){
        return a*a;
    }*/
    public static void main(String args[]){
        /*System.out.println(LambdaExpression.squre(5));
        System.out.println(LambdaExpression.squre(4));*/
        Function<Integer,Integer> sq=i->i*i;
        System.out.println(sq.apply(5));
        System.out.println(sq.apply(4));

        //Here Instead of writing lengthy code we reduce the code by one line Function<Integer,Integer> sq=i->i*i;
        //so it is consize the code and return the value
        //concise code we ll get

    }
}
