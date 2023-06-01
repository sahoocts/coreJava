package JAVA8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

class EmployeObj{
    private int id;
    private int age;

    private String name;
    public EmployeObj(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
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
}
public class TestExampleHashMap {
    public static void main(String args[]){
        EmployeObj e1=new EmployeObj(1,20,"saroj");
        EmployeObj e2=new EmployeObj(2,21,"saroj2");
        EmployeObj e3=new EmployeObj(3,22,"saroj3");
        EmployeObj e4=new EmployeObj(4,23,"saroj4");
        HashMap<Integer,EmployeObj> hs=new HashMap<>();
        hs.put(e1.getId(),e1);
        hs.put(e2.getId(),e2);
        hs.put(e3.getId(),e3);
        hs.put(e4.getId(),e4);
        for(Map.Entry<Integer,EmployeObj> e:hs.entrySet()){
            System.out.println("Key is"+e.getKey());
            int age=e.getValue().getAge();
            System.out.println("age is" +age);
            String name=e.getValue().getName();
            System.out.println("name is"+name);
        }
       // Predicate


    }
}
