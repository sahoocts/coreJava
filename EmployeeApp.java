package Java8.Employeee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeApp {
    public static void main(String args[]){
        List<Employee> al=Arrays.asList(new Employee(1, 1000, "Chandra Shekhar", 6000),
                new Employee(1, 2000, "Rajesh", 8000), new Employee(1, 1004, "Rahul", 9000));

        //int total=al.stream().
       List<Employee> s= al.stream().map(e->{
            if(e.getDeptId()>1000){
                e.setSalary(e.getSalary()*1.10);
            }
            return e;
        }).collect(Collectors.toList());
 System.out.println(s);
    }
}
