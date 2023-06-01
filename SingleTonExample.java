package Others;

import java.io.Serializable;

class Abc implements Serializable {
    private static Abc obj=new Abc();
    private Abc(){

    }
    public  static Abc getObj(){
        return obj;
    }

    protected Object readResolve(){
        return obj;
    }
protected Object clone() throws CloneNotSupportedException {
        return super.clone();
   // throw new CloneNotSupportedException();

}
}
public class SingleTonExample {
    public static void main(String args[]){
        Abc a=Abc.getObj();
        Abc b=Abc.getObj();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
