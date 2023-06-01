package Others;

public class CloningSingleton {
    public static void main(String args[]) throws CloneNotSupportedException,Exception {
        Abc aaa=Abc.getObj();
        Abc bbb=(Abc)aaa.clone();
        System.out.println("hashCode of instance 1 - " + aaa.hashCode());
        System.out.println("hashCode of instance 2 - " + bbb.hashCode());
    }
}
