package Kushal.Abstract;

public abstract class Parent {
    int age;
    final int VALUE;

    abstract void career();
    abstract void partner();
    public Parent(int age,int VALUE){
        this.age=age;
        this.VALUE=32456789;
    }
   static void hello(){
       System.out.println("hey");
   }
   void normal(){
       System.out.println("this is a normal method");
   }

}
