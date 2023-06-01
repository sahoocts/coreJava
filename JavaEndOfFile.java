package Kushal;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      //  String d=sc.nextLine();
      // String dd=sc.next();
       // System.out.print(d);
      //  System.out.print("next is"+dd);
        int c=0;
        while(sc.hasNext()){
            c++;
            String n=sc.nextLine();
            System.out.print(c+" "+n);
        }
    }
}
