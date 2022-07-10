package Java8;
//Lamda expression
//Functional Intearface
//Default and static method.
//predicate//Function//consumer//suplier
//Double colon operater(::)
//method refereance
//constructer refereance
//stream
//date and time api
//Optional class
//Nashorn javascript engine
import java.util.function.Predicate;
//Predicate it gives bollean either true false,nad it has method called test()
public class PredicateExample {

    public static void main(String args[]){
        Predicate<Integer> p= i->i%2==0;
        System.out.println(p.test(4));
        System.out.println(p.test(5));

    }
}
