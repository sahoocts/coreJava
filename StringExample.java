package NewHackersRank;

import java.util.Scanner;

//Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed
//characters as  space-separated strings on a single line (see the Sample below for more detail).
//input:1
//Hacker
public class StringExample {

    public static void main(String args[]){
        //String str="hacker";
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            String str=sc.next();
            printEvenOdd(str);
            printEvenOdd1(str);

        }

      //  printEvenOdd(str);

    }

    private static void printEvenOdd1(String str) {
        StringBuffer even=new StringBuffer();
        StringBuffer odd=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i%2==0){
                even.append(ch);
            }
            else{
                odd.append(ch);
            }
        }

        System.out.println(even+" "+odd);


    }

    static void printEvenOdd(String str){
         // System.out.println(str);
        char ch[]=str.toCharArray();//h a c k e r
        int n=ch.length;
        char ch1[]=new char[3];
        char ch2[]=new char[3];
        int i=0;
        int j=0;
        while(i<=4){
            ch1[j]=ch[i];
            i=i+2;
            j++;
        }
        int k=1;
        int s=0;
        while(k<=6){
            ch2[s]=ch[k];
            k=k+2;
            s++;
        }


        for(char c:ch1){
            System.out.print(c);
        }
        System.out.print(" ");
        for(char c1:ch2){
            System.out.print(c1);
        }

    }




}
