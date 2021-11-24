class Abc{
    private static Abc obj=new Abc();
    private Abc(){

    }
  public static Abc getInstance(){
        return obj;
  }

}

public class SingletonApp {

    public static  void main(String args[]){
        Abc a=Abc.getInstance();
        Abc b=Abc.getInstance();
        System.out.println(a.equals(b));

    }

}
