package NewPrepare;

class Abc{
    private static Abc obj=new Abc();
    private Abc(){

    }
    public static Abc getObj(){
        return obj;
    }
}
public class SingletonApp {

    public static void main(String args[]){
        Abc a=Abc.getObj();
        Abc b=Abc.getObj();
        System.out.print(a==b);

    }
}
