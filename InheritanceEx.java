package HackersRank;
class Arithmetic{
    public int add(int a,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{

}
public class InheritanceEx {
    public static void main(String args[]){
        Adder a=new Adder();
        System.out.print(a.add(10,20));
    }
}
