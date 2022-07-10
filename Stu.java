import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stu {
    public static void main(String args[]){
        List<Student> al= Arrays.asList(new Student("a",1),new Student("c",2));
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
