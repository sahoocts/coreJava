package Java8.MCQS;
class Base{
    private int mult(int data){
        return data*2;
    }
}

public class Derived1 extends Base{
    private static int data;
    public Derived1(int i){
        data=i*5;
    }

    public static void main(String args[]){
        Base b=new Derived1(5);
       // System.out.println(b.mult(data));
    }
}
