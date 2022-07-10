import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

    public static void main(String args[]){

        String s[]={"A","B","c"};
        List<String> al=Arrays.asList(s);
       // al.set(2,"b");
        al.add("50");//UnsupportedOperationException
        System.out.println(al);
    }
}
