package Others;

import java.io.*;

public class DeserializationSingleton {
    public static void main(String args[]) throws Exception {
        Abc aa=Abc.getObj();
        ObjectOutput out=new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(aa);

        ObjectInput in=new ObjectInputStream(new FileInputStream("file.txt"));
        Abc bb=(Abc)in.readObject();

        System.out.println("hashCode of instance 1 is - " + aa.hashCode());
        System.out.println("hashCode of instance 2 is - " + bb.hashCode());
    }
}
