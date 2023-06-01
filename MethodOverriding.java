package HackersRank;

class BiCycle{
    String define_me(){
        return "a vehicle with pedals";
    }
}
class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine";
    }
    MotorCycle(){
    System.out.println("Hello I am a motorcycle, I am"+define_me());
    String s=super.define_me();
    System.out.println("Hello I am a motorcycle, I am"+s);
    }
}
public class MethodOverriding {

    public static void main(String args[]){
        MotorCycle m=new MotorCycle();
    }
}
