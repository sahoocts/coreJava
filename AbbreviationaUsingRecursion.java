package NewHackersRank;

import java.util.Scanner;

public class AbbreviationaUsingRecursion {
    public static void solutions(String str,String asf,int count,int pos){
        if(pos==str.length()){
           // System.out.print();
            if(count == 0){
                System.out.println(asf);
            }
            else{
                System.out.println(asf+count);
            }
            return;
        }
        if(count>0)
            solutions(str,asf+count+str.charAt(pos),0,pos+1);
            else
            solutions(str,asf+str.charAt(pos),0,pos+1);

        solutions(str,asf,count+1,pos+1);


    }

    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
      //  String s=sc.next();
        solutions("pep"," ",0,0);
    }
}
