package Others;
class P{
    private void marry(){
        System.out.print("parent marry");
    }
}
public class OveridingApp extends P{
    private  final void marry(){
        System.out.print("child marry");
    }

    public static void main(String args[]){
        P p1=new OveridingApp();
       // p1.marry();;
    }
}
