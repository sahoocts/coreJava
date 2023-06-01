package JAVA8;
interface intrf{
    public static void m1(){
        System.out.println("Inside static interface method");
    }
}
public class InterfAB implements intrf{
    public static void main(String args[]){
        intrf.m1();//The only possible way to call By using interface name only we can call m1() otherthan that not

    }

}
