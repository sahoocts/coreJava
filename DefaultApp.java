package JAVA8;

interface  I{
    default void m1(){

        System.out.println("welcome default");

    }
        }
public class DefaultApp implements I{

  /*  public void m1(){
        System.out.println("welcome to my default");
    }
*/
    public static void main(String args[]){

        I i1=new DefaultApp();
     i1.m1();
    }
}
