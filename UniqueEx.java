import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueEx {

    public static void main(String args[]){
        int a[]={2,3,4,4,7,8,8};
        ArrayList<Integer> ss=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            ss.add(a[i]);
        }
      //  List<Integer> l=Arrays.asList(a);
      //  List<Integer> s=ss.stream().distinct().collect(Collectors.toList());
        List<Integer> s1= ss.stream().sorted((i,j)->(i<j) ? 1:(i>j) ?-1 :0).collect(Collectors.toList());
       // List<Integer> s2= ss.stream().sorted(() .collect(Collectors.toList());
        System.out.print(s1);
    }
}
