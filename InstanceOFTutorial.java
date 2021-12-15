package LogicImplemented;

import java.util.ArrayList;
import java.util.Scanner;


class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOFTutorial {

    static String count(ArrayList al){
        int a=0;
        int b=0;
        int c=0;
      for(int i=0;i<al.size();i++){
          Object ele=al.get(i);
          if(ele instanceof Student){
              a++;
          }
          if(ele instanceof Rockstar){
              b++;
          }
          if(ele instanceof Hacker){
              c++;
          }

      }
      String ret=Integer.toString(a)+""+Integer.toString(b)+""+Integer.toString(c);
       return ret;
    }

    public static void main(String args[]){
        ArrayList al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            String s1=sc.next();
            if(s1.equals("Student"))
                al.add(new Student());
            if(s1.equals("Rockstar"))
                al.add(new Rockstar());
            if(s1.equals("Hacker"))
                al.add(new Hacker());

        }
        System.out.println(count(al));
    }
}
