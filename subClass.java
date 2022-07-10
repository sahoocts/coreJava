package Java8.MCQS;

class superClass
{
     public int calc(int a, int b)
    {
        return 0;
    }
}
class subClass extends superClass
{
    public int calc(int a, int b)
    {
        return 1;
    }

    public static void main(String args[])
    {
        subClass get = new subClass();
        System.out.println("x = " + get.calc(0, 1));
    }
}

