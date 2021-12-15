package JAVA8.FunctionalInterface;


public class TestThread{

    /*public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
        }
    }*/
    static Runnable r=()->{
        for(int i=0;i<=5;i++){
            System.out.println("hello 1");
        }
    };

    public static void main(String args[]){
        TestThread b=new TestThread();
        Thread t=new Thread(r);
        t.start();
    }
}
