package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employeee{
    @Override
    public String toString() {
        return "Employeee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    int id;
    int salary;
    public Employeee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

public class EmployeSalarySortingOrder {
    public static void main(String args[]){
        ArrayList<Employeee> al=new ArrayList<Employeee>();
        al.add(new Employeee(1,100));
        al.add(new Employeee(2,200));
        al.add(new Employeee(3,300));
       // Collections.sort(al,(i1,i2)->(i1.getSalary()<i2.getSalary())?1:(i1.getSalary()>i2.getSalary()?-1:0));

       // Collections.sort(al,(i1,i2)->(i1.getSalary()>i2.getSalary()?1:(i1.getSalary()<i2.getSalary()?-1:0)));
//Fetch all employees having salary less than 3rd hight salary:by using skip(3) method
       List<Employeee> empL= al.stream().sorted((i1, i2)->(i1.getSalary()-i2.getSalary())).skip(3).collect(Collectors.toList());
        System.out.println(empL);
    }
}
