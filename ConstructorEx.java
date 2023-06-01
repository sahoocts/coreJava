package HackersRankk;
class Aa{
    public Aa(int a){
        System.out.print("Aa is"+a);
    }
}
class Bb extends Aa{
    public Bb(int a){
        super(10);
        System.out.print("Bb is"+a);

    }
}
public class ConstructorEx {
    public static void main(String args[]){
        Bb b=new Bb(5);
    }
}
