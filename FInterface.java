package Java8;

@FunctionalInterface
public interface FInterface {
    public void m1();
}

@FunctionalInterface
interface A extends FInterface{
    //public void m1();without single abstract method it is valid because it inharit that m1() automatically,and
    public void m1();//It is valid also because its override concept.
        }