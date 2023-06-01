package JAVA8;

interface A{
    public void m1();
}
class B implements A{
    public void m1(){
        System.out.print("okkkk");
    }
}
public class TestCreate {
    public static void main(String args[]){
        A b=new B();
        b.m1();
    }
}
