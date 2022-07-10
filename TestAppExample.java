
class InvalidAgeException extends RuntimeException{
    int age;
    InvalidAgeException( int age){
        super();
    }
}
public class TestAppExample {
    //static ArithmeticException e=new ArithmeticException();
   // static ArithmeticException e;
    static void getMethod(int age){
        if(age<23){
            throw new InvalidAgeException(age);
        }
        else{
            System.out.println("valid");
        }
    }
    public static void main(String args[]){

        try{
            getMethod(20);
        }
        catch(Exception e){

        }
    }
}
