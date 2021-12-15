package LogicImplemented;


class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }

}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }
    MotorCycle(){
        System.out.println("Hello"+define_me());
        String temp=super.define_me();
        System.out.println("Hi"+temp);
    }
}
public class OverRidingExample1 {

    public static void main(String args[]){
        MotorCycle m=new MotorCycle();

    }
}
