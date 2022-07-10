package Java8.Employeee;

public class Test {

    public static void main(String args[]){
        try{
            m1();
        }
    catch(Exception e){
      System.out.println("ghgsa");
    }
        finally{
            System.out.println("hi");
        }
        System.out.println("hiii");
    }

    private static void m1() {
        System.out.println("dggf");
        throw new RuntimeException("hello");
    }
}
