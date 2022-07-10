package Java8;

interface AA{
    default void m1(){
        System.out.println("ddddd");
    }
}
interface BB{
    default void m1(){
        System.out.println("jh");
    }
}

public class MultipleInharitanceExample implements AA,BB{
    public void m1(){
//System.out.println("jh");
        AA.super.m1();
    }

    public static void main(String args[]){
        MultipleInharitanceExample a=new MultipleInharitanceExample();
a.m1();
    }


}
