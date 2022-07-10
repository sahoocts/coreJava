package Java8.MCQS;

public class Test1 {

    public void convert(String val){
       // return val.toString();
        //return false;
        System.out.println("String");
    }
    public void convert(Integer val){
        // return val.toString();
        //return false;
        System.out.println("Integer");
    }
    public void convert(Object val){
        // return val.toString();
        //return false;
        System.out.println("Object");
    }



    public static void main(String args[]){
        Test1 t=new Test1();
       // t.convert("null");
      //  t.convert(null);//ambiguis

        //System.out.println(10);
    }
}
