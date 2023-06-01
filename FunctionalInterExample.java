package JAVA8.FunctionalInterface;
interface I{
    void m1();
    void m2();
  //  void m4();
   default void m3(){
       System.out.print("default method");
   }
}
class A implements I{
    public void m1(){

    }
    public void m2(){

    }
}

class II implements I{
    public void m1(){

    }
    public void m2(){

    }
}
class III implements I{
    public void m1(){

    }
    public void m2(){

    }
}
class IIII implements I{
    public void m1(){

    }
    public void m2(){

    }
}
public class FunctionalInterExample {
}
