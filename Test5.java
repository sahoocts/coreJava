package Java8.MCQS;

class Test6{
    Test6(int x){
        System.out.println("Constructor called " + x);
    }
}
public class Test5 {
    Test6 t1=new Test6(10);
    Test5(int i){
        t1=new Test6(i);
    }
    public static void main(String args[]){
        Test5 t2=new Test5(5);
    }
}
