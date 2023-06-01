package HackersRankk;

import java.util.Scanner;

public class Lexicographical {

    public static void main(String args[]){
      //  Scanner sc=new Scanner(System.in);
     //   String s=sc.next();
     //   int n=sc.nextInt();
        String s="welcometojava";
        int n=3;

        System.out.println((getlexi(s,n)));

    }

    private static String getlexi(String s, int n) {
        String small="";
        String lar="";
          small=lar=s.substring(0,n);
          int l=s.length();
          for(int i=1;i<l-n;i++){
              String sub=s.substring(i,i+n);
             if(small.compareTo(sub)>0){
                 small=sub;
             }
             if(lar.compareTo(sub)<0){
                 lar=sub;
             }
          }

          return small+"\n"+lar;
    }
}
