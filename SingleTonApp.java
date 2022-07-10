package Java8.MCQS;

class ABC{
   static ABC obj=new ABC();
    private ABC(){
    }
    public static ABC getC(){
        return obj;
    }
}
public class SingleTonApp {
    public static void main(String args[]){
        ABC a=ABC.getC();
        ABC b=ABC.getC();

    }
}

