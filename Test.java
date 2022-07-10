package Java8.MCQS;

public class Test {
    static int start = 2;
    final int end;
    public Test(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.println(end-start+" ");
        System.out.println(distance);
    }
    public static void main(String args[]){
              Test t=new Test(10);
                t.fly(5);
    }
}
