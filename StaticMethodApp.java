package JAVA8;

interface I1{
    static void m2(){
        System.out.println("in static method");
    }
}
public class StaticMethodApp implements  I1{
    public static void main(String args[]){
        I1.m2();
    }
}
