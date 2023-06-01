package HackersRank;
interface Statagy{
    int doExecute(int a,int b);
}
class OperationAdd implements Statagy{
    public int doExecute(int a,int b){
        return a+b;
    }
}
class OperationSubstract implements Statagy{
    public int doExecute(int a,int b){
        return a-b;
    }
}
class OperationMultiply implements Statagy{
    public int doExecute(int a,int b){
        return a*b;
    }
}
class Context{
    private Statagy s;
    public Context(Statagy s){
        this.s=s;
    }
    public int execute(int a,int b){
        return s.doExecute(a,b);
    }
}
public class Demo{
    public static void main(String[] args) {
        //  OperationAdd v1=new OperationAdd();
          Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.execute(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.execute(10, 5));
    }


}
