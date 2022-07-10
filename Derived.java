package Java8.MCQS;

class Base1
{
    private int data;

    public Base1()
    {
        data = 5;
    }

    public int getData()
    {
        return this.data;
    }
}

class Derived extends Base1
{
    private int data;
    public Derived()
    {
        data = 6;
    }
    public int getData()
    {
        return data;
    }

    public static void main(String[] args)
    {
        Derived myData = new Derived();
        System.out.println(myData.getData());
    }
}

