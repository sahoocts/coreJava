package Java8;
////Lambda Expression:It is a anonymous function,without name,without return type,without modifier
public class LamdaExpression1 {

  /*  public void m1(){
        System.out.println("Hello");
    }*/

    //We wrote this LE for the above commented code of method m1()
      //()->{System.out.println("Hello");}
  //  ()->System.out.println("Hello");
    ////LE :without name(m1),without return type(void),without modifier(public)
    //if inside body single line is there then the bracket is optional

  /*  public void m1(int a,int b){
        System.out.println(a+b);
    }*/

   // Lambda Expression is:

   // (a,b)->System.out.println(a+b);


/*   public int squareIt(int n){
        return n*n;
    }*/
    // Lambda Expression is:

  // (int n)->{return n*n};
    //(int n)-> n*n;//withput curly bracket return also not required
    //(n)->n*n;
   // n->n*n;
    public static void main(String args[]){


    }
}
