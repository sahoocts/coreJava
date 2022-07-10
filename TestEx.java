package Java8;
interface AAA{
    public void m1();
}
interface AAB{
    public void m2();
}

interface AAC{
    public void m3();
}
interface AAD extends AAA,AAB,AAC{

        }

public class TestEx implements AAD {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}
