package NewHackersRank;

import java.util.Scanner;

//In this problem, you are given an interface Food. There are two classes Pizza and Cake which implement the Food interface, and they both contain a method getType().
//
//The main function in the Main class creates an instance of the FoodFactory class. The FoodFactory class contains a method getFood(String) that returns a new instance of Pizza or Cake according to its parameter.
//
//You are given the partially completed code in the editor. Please complete the FoodFactory class.

interface Food{
    public String getType();
}

class Pizza implements Food{

    public String getType(){
        return "Pizza order";
    }
}

class Cake implements Food{

    public String getType(){
        return "Cake order";
    }
}

class FoodFactory{
    public Food getFood(String order){
        if(order.equals("cake")){
            return new Cake();
        }
        return new Pizza();

    }
}

public class FactoryMethodExample {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            FoodFactory foodFactory=new FoodFactory();
            Food f=foodFactory.getFood(sc.nextLine());
            System.out.println("The factory returned"+f.getClass());
            System.out.println(f.getType());

        }
        catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}
