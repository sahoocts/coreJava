package Java8.MCQS;

public class Calculator
{
    int num = 100;
    public void calc(int num)

    { this.num = num * 10;
        int b;
    }
    /*Calculator(int num){
        this.num=num*10;
    }
*/
    public void printNum()	 {
        System.out.println(num);
    }

    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        obj.calc(2);//20
        obj.printNum();
        System.out.println(obj.num);
      //  boolean b;
      //  System.out.println(b);

    }
}

