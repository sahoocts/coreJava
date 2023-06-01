package JAVA8;

public class ThreadApp{

  /*  public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
        }
    }*/

    public static void main(String args[]){
        Runnable r=()->{
            for(int i=0;i<=5;i++){
                System.out.println("hello");
            }
        };
      //  ThreadApp a=new ThreadApp();
        Thread t=new Thread(r);
        t.start();
    }
}
