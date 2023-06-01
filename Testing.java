package NewPrepare;


interface AAA{
    public void m1();
}

interface BBB{
    public void m1();
}

interface CCC{
    public void m1();
}
interface DDD extends AAA,BBB,CCC{

}
public class Testing implements DDD{
    public void m1(){
        System.out.println("Testing");
    }
    public static void main(String args[]){
        AAA s=new Testing();
        s.m1();

        // AAA s1=new Testing();
        //s1.m1();
    }
}
