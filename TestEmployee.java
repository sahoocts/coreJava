package JAVA8.Sorted;

import java.util.*;

public class TestEmployee {
    public static void main(String args[]) {
        List<Employe> emp = Arrays.asList(new Employe("George", 10, 10000),
                new Employe("Robert", 12, 15000),
                new Employe("Kathy", 24, 25000));
      //----------------------------------------------------------------------
        //sort simple java7
       /* Collections.sort(emp, new Comparator<Employe>() {
            public int compare(Employe e1, Employe e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });*/
        /*for(Employe e:emp){
            System.out.println(e);
        }*///-------------------------------------
     emp.sort((Employe e1,Employe e2)->e1.getName().compareTo(e2.getName()));
       // emp.forEach(e->System.out.println(e));
        //---------------------------------------
        //we can first sort by name and then,by age like below code:

        emp.sort(Comparator.comparing(Employe::getName).thenComparing(Employe::getAge));
       // emp.forEach(e->System.out.println(e));
      //  emp.forEach(System.out::println);

      /*  Comparator<Employe> sortByName=(e11,e22)->e11.getName().compareToIgnoreCase(e22.getName());
        Comparator<Employe> sortBySalary=(e11,e12)->Double.compare(e11.getSalary(),e12.getSalary());
        emp.stream().sorted(sortByName.thenComparing(sortBySalary)).forEach(e->System.out.println(e));*/

        //SORT BY NAME

       /* emp.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
        emp.forEach(e->System.out.println(e));*/

       //sort by salary
        emp.sort((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary()));
        emp.forEach(e->System.out.println(e));

    }
}
