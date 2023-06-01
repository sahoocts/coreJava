package HackersRankk;
class Ab{
    {
        System.out.print("class Ab");
    }
    static{
        System.out.print("static Ab");
    }
    public Ab(){
        System.out.print("constr Ab");
    }
}

class Ba extends Ab{
    {
        System.out.print("class b");
    }
    static{
        System.out.print("static b");
    }
    public Ba(){
        System.out.print("constr b");
    }
}
public class ConsExam {
 public static void main(String args[]){
    // Ab a=new Ab();
       //Ab b=new Ba();
      Ba c=new Ba();
 }



}
