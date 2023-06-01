package JAVA8;

import java.util.Arrays;
import java.util.List;

public class Employee {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
public static void main(String args[]){
    Employee e1=new Employee(1,"saroj1");
    Employee e2=new Employee(2,"saroj2");
    Employee e3=new Employee(3,"saroj3");
    Employee e4=new Employee(4,"saroj4");
    List<Employee> empList1= Arrays.asList(e1,e2,e3,e4);
    empList1.stream().filter(a->a.getId()%2==0).map(a->{
        return a.getName();
    }).forEach(a->System.out.println(a));

   // empList1.stream().filter(a->a.getId()%2==0).forEach(a->System.out.println(a.getName()));




}

}
