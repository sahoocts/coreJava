package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CountStringGorupingBy {
    public static void main(String args[]){
        String str[]={"aple","banana","banana","aple","abc","abc","abc"};
      //  String str1="sarojkumar";
       // char ch[]=str1.toCharArray();
      List<String> al=  Arrays.asList(str);
        Map<String,Long> s=al.stream().collect(groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(s);
    }
}
