package Comparator;
import java.util.*;
 class Student{
     int roll;
     String name;

     public int getRoll() {
         return roll;
     }

     public void setRoll(int roll) {
         this.roll = roll;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
public String toString(){
        return "the roll and name is"+roll+":::"+name;
}

}

 class ComparatorApp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if(o1.roll<o2.roll){
            return 1;
        }
        else if (o1.roll>o2.roll){
            return -1;
        }
        else{
            return 0;
        }


    }
}
public class ComparatorExample {
    /*List al= List.of(new Student(20,"saroj"),
            new Student(21,"kumar"),
            new Student(22,"sahoo")
            );*/

    public static void main(String args[]){
        // ArrayList al=new ArrayList();
       /* List al= List.of(new Student(20,"saroj"),
            new Student(21,"kumar"),
            new Student(22,"sahoo")
            );*/
        ArrayList<Student> al=new ArrayList<Student>();
         al.add(new Student(20,"saroj"));
         al.add(new Student(21,"kumar"));
         al.add(new Student(22,"sahoo"));

        Collections.sort(al,new ComparatorApp());
       for(int i=0;i<al.size();i++){
           System.out.println(al.get(i));
        }

    }


}
