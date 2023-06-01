package JAVA8;

public class MethodReferenceExam {
    public static void m1(){
        for(int i=0;i<10;i++){
            System.out.print("m1 is"+i);
        }
    }

    public static void main(String args[]){


        Runnable r=MethodReferenceExam::m1;
       /* Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.print("i is"+i);
            }
        };*/

        Thread t=new Thread(r);
        t.start();;
    }
}
