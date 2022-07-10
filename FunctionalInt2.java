package Java8;
interface Interf1{
    public void m1(int a,int b);
}

/*class Test implements Interf1{

    @Override
    public void m1(int a, int b) {
        System.out.println(a+" "+b);
    }
  //  (a,b)->System.out.println(a+" "+b);
}*/
public class FunctionalInt2 {
    public static void main(String args[]){
        Interf1 ff= (a,b)->System.out.println(a+" "+b);
        ff.m1(10,20);
    }


}
