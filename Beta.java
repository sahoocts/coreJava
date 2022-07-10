package Java8.MCQS;

class Alpha
{
    public String type = "a ";
    public Alpha() {
        System.out.print("alpha ");
    }
}

public class Beta extends Alpha
{
    String d=super.type;
    public Beta() {
        super();
        System.out.print("beta ");
        System.out.print(d);
    }

    void go()
    {
        type = "b ";
        String c=super.type;
        System.out.print(this.type + c);
        System.out.print(d);
    }

    public static void main(String[] args)
    {
        new Beta().go();
    }
}

