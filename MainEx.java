package Kushal.Abstract;
interface In{
   default void m1(){
       System.out.print("First");
   }
}
interface Inn{
    default void m1(){
        System.out.print("second");
    }
}
public class MainEx implements In,Inn{
    @Override
    public void m1() {
     //   In.super.m1();
        System.out.print("child");
    }

    public static void main(String args[]){
        MainEx e=new MainEx();
        e.m1();
    }

}
