package Java8;

@FunctionalInterface
interface square{
int calculate(int x);
}
public class FunInterExample {
    public static void main(String args[]){

        int a=5;
        square s=x->x*x;
        int ans=s.calculate(5);
        System.out.println(ans);
    }
}
