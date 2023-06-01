package HackersRank_06062022;
@FunctionalInterface
interface intr{
    public void m();
}
public class LambdaExpressionExample2 {
    public static void main(String args[]){
        intr d1=()->{
            System.out.println("inside LE");
        };
        d1.m();
    }
}
