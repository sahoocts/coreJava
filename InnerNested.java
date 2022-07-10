package Java8.MCQS;

public class InnerNested {
    private static int value=20;
    public  int s = 15;
    public static int temp = 10;

    public static class Nested{

        private void display(){
        //    System.out.println(temp+s+value);//error because non static variable cant access to static nested class
        }
        public static void main(String args[])
        {
            InnerNested.Nested d=new InnerNested.Nested();
            d.display();
        }
    }
}
