package NewHackersRank;

import java.util.Scanner;

public class reverseOrderInteger {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
      for(int s:a){
          System.out.print(s);
      }

        /*int A[]={1,2,3,4};
        for(int i=A.length-1;i>=0;i--){
            System.out.print(A[i]);
        }*/
    }
}
