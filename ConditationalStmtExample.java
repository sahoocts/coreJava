package NewHackersRank;

import java.util.Scanner;

public class ConditationalStmtExample {


/*If  is odd, print Weird
    If  is even and in the inclusive range of 2 to5 , print Not Weird
    If  is even and in the inclusive range of 6 to 20 , print Weird
    If  is even and greater than 20, print Not Weird*/

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        String ans="";
        if(n%2!=0){
            ans="wired";
        }
        else{
            if(n>=6 && n<=20){
                ans="wired";
            }
            else{
                ans="not wired";
            }
        }

        System.out.println(ans);
    }
}
