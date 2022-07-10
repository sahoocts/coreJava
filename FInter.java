package Java8;
//@FunctionalInterface
interface Inter1{
    void m1();
    void m2();
}

abstract class Test implements  Inter1{

    @Override
   abstract public void m1();

    @Override
    public void m2() {

    }
}
public class FInter {

}
