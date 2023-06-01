package Small_Program;

import java.util.Arrays;
import java.util.List;

public class ReturningMultipleValues {

    public static List getDetails(){
        String name="saroj";
        int age=20;
        char gender='m';
        return Arrays.asList(name,age,gender);

    }

    public static void main(String args[]){
      List person=getDetails();
      System.out.println(person);
    }
}
