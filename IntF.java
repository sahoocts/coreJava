package JAVA8.FunctionalInterface;

public interface IntF {
    public void m1();
    default public void m2(){
        System.out.println("default method");
    }
}
