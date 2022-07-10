package Java8.MCQS;

public class Test10 {
    private int data=10;
    public int getData(){
        return this.data;
    }

    public int getData(int a){
      return (data+1);
    }
    public int getData(int... a){
        return (data+2);
    }
    public static void main(String args[]){
        Test10 t=new Test10();
        System.out.println(t.getData(1,2,3));
    }
}


