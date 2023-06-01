package HackersRankk;


public class JavaSort {
    public static void main(String args[]){
        System.out.println(devide());

     //   System.out.println(a);
    }

    private static int devide() {
        try{
            int a=2/0;
            return 1;
        }
        catch(Exception e){
            System.out.println("Exception accure");
            return 2;
        }
        finally{
            System.out.println("finally accure");
            return 3;
        }
    }
}
