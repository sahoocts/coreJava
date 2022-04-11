package NewTry;

public class ThreadEx implements Runnable {
    public void run(){
        for(int i=0;i<2;i++){
            System.out.println("ok");
        }
    }

    public static void main(String args[]){
        ThreadEx t=new ThreadEx();
        Thread tt=new Thread(t);
        tt.run();

    }
}
