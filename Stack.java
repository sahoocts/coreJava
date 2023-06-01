package HackersRankk;

public class Stack {

    public static void main(String args[]){
        int a=10;
        int b=20;
        getRecusively( a,b);
    }
    private static void getRecusively(int a,int b) {
         try{
             getRecusively(a,b);
         }
         catch (StackOverflowError e){
             System.out.print("errror");
         }
    }
}
