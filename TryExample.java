package Others;

public class TryExample {
    public static void main(String args[]){

        System.out.print(getN());
    }

    private static int getN() {
        try{
          //  System.out.println("try");
            return 100;
        }
        catch(Exception e){
            return 200;
        }
        finally{
           //System.out.println("Finally");
            return 400;
        }
    }
}
