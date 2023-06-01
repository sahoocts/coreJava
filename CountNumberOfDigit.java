package NewHackersRank;

import java.util.Scanner;
//input:43534
//output:5
public class CountNumberOfDigit {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nod=0;
        while(n>0){
           n=n/10;
           nod++;
        }
        System.out.print(nod);
    }
}
