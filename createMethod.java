package Java8.MCQS;

/*public class createMethod {
}*/
class createMethod
{
    private createMethod(int data)
    {
        System.out.printf(" Constructor called ");
    }
    protected static createMethod create(int data)
    {
        createMethod obj = new createMethod(data);
        return obj;
    }
    public void myMethod()
    {
        System.out.printf(" Method called ");
    }

    public static void main(String[] args)
    {
        createMethod obj = createMethod.create(20);
        obj.myMethod();
    }
}
//Explanation: When a constructor is marked as private,
// the only way to create a new object of that class from some external class is using a method that creates a new object,
// as defined above in the program.
// The method create() is responsible for creation of Temp object from some other external class. Once the object is created,
// its method can be invoked from the class in which the object is created.