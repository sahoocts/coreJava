package HackersRankk;
import java.util.*;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class CountAccuranceUsingJava8 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8};
      // Arrays.stream(a).filter(e->e<5).forEach(e->System.out.println(e));
       Arrays.stream(a).map(e->e+5).forEach(e->System.out.println(e));
        String str= "Communication";
       // char ch[]=str.toCharArray();
      //  List<char[]> list=Arrays.asList(ch);
/*        Map<String,Long> cnt= Arrays.stream(str.split("")).map(String::toLowerCase).
                collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));*/

 Map<String,Long> cnt= Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));


        //System.out.println(cnt);
    }

}
