package HackersRankk;

import java.util.*;
import java.util.stream.Collectors;

public class Employe {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
      Employe employe = (Employe) o;
        return code == employe.code && Objects.equals(name, employe.name) && Objects.equals(designation, employe.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, designation);
    }

    private String name;
    private int code;
    private String designation;

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", designation='" + designation + '\'' +
                '}';
    }

    public Employe(String name, int code, String designation){
        this.name=name;
        this.code=code;
        this.designation=designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String args[]){
        List<Employe> empObjList= Arrays.asList(
                new Employe("Raj",1,"Software ENgineer"),
                new Employe("Saroj",2,"Sw"),
                new Employe("Raj",1,"Software ENgineer"));
             Set<Employe> set=new HashSet<>();
            //   set.add(empObjList);
        List<Employe> duplicateRem=empObjList.stream().filter(e->set.add(e)).collect(Collectors.toList());

      //  List<Employe> duplicateRem=empObjList.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicateRem);

  /*  for(int i=0;i<empObjList.size();i++){
        System.out.println(empObjList.get(i).name);

        if(!empObjList.get(i).name.equalsIgnoreCase(empObjList.get(i).name)){
            System.out.println(empObjList.get(i));
        }
    }*/
    }


}
