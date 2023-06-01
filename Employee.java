package HackersRankk;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private int age;
    private String name;
    public Employee(int id, int age, String name){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public static void main(String args[]){

    List<Employee> list= Arrays.asList(new Employee(1,20,"saroj"),
            new Employee(2,30,"Sachin"),new Employee(3,40,null));

    //pull out the name of employe whos ages greater 20;

     list.stream().filter(e->e.age>20).forEach(e->System.out.println(e.name));

  //  System.out.println(map);



//   String opt=Optional.ofNullable(str).map(String::toUpperCase).orElse("Not present");
 //   System.out.println(opt);
    /*if(opt.isPresent()){
        System.out.println(e.name.toUpperCase());
    }
    else{
        System.out.println("not present");
    }*/
}


}
