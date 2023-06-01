package HackersRankk;

public class OverLoadingRuleTest {
    public static void main(String[] args) {
        OverLoadingRuleTest t = new OverLoadingRuleTest();
      //  t.m1(2);          // float
        byte b = 5;
       // t.m1(b);            //short
        A obj = new B();
     //  t.m1(obj);        //Object
       // t.m2(null);       //B
      // t.m1(null);       //eXCEPTION
      //  t.m2(new C());   //B
        Double d = 12.3;
      //  t.m1(d);        //Object
    }
    public void m1(short s) {
        System.out.println("Short");
    }
    public void m1(byte...b) {
        System.out.println("Byte");
    }
    public void m1(Integer s) {
        System.out.println("Integer");
    }
    public void m1(float s) {
        System.out.println("float");
    }
    public void m1(double s) {
        System.out.println("double");
    }
    public void m1(Object s) {
        System.out.println("Object");
    }
    public void m1(String s) {
        System.out.println("String");
    }

    public void m2(Object s) {
        System.out.println("Object");
    }
    public void m2(A a) {
        System.out.println("A");
    }
    public void m2(B s) {
        System.out.println("B");
    }
}

class A {

}

class B extends A {

}

class C extends B {

}
