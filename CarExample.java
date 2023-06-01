package Others;

interface IBrakeBehavior{
    void brake();
}
class BrakeWithABS implements IBrakeBehavior{
    public void brake(){
        System.out.println("Brake with ABS applied");
    }
}
class Brake implements IBrakeBehavior{
    public void brake() {
        System.out.println("simple Brake applied");
    }
}
 class car{
    private IBrakeBehavior iBrakeBehavior;
    public car(IBrakeBehavior iBrakeBehavior){
        this.iBrakeBehavior=iBrakeBehavior;
    }
    public void setiBrakeBehavior(IBrakeBehavior iBrakeBehavior) {
        this.iBrakeBehavior = iBrakeBehavior;
    }

    public void applyBrake(){
        iBrakeBehavior.brake();
    }

}
class Sedan extends car{
    public Sedan(IBrakeBehavior iBrakeBehavior) {
        super(iBrakeBehavior);
    }
    /*public Sedan(){
        super(new Brake());
    }*/
}

class SUV extends car{
    public SUV(){
        super(new BrakeWithABS());
    }
}
public class CarExample {
    public static void main(final String[] arguments) {

        car sedanCar = new Sedan(new Brake());
        sedanCar.applyBrake();

        car suvCar = new SUV();
        suvCar.applyBrake();

        // set brake behavior dynamically
        suvCar.setiBrakeBehavior(new Brake() );
        suvCar.applyBrake();    // This will invoke class "Brake"
    }
}
