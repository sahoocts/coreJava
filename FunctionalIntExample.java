package Java8;

interface inref{
    public void m1();
}
/*class Test implements inref{
    public void m1(){
        System.out.println("Hello");
    }*/
//()-> System.out.println("Hello");

//}
public class FunctionalIntExample {
    public static void main(String args[]){
        inref i=()-> System.out.println("Hello--By Lambda Expression");
        i.m1();

    }
}
