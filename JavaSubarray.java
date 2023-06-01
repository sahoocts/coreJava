package HackersRankk;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String args[]){
       /* Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();*/
        /*int ar[]=new int[n];
        int k=0;
        while(sc.hasNext()){
            ar[k++]=sc.nextInt();
        }*/
        int ar[]={1,-2,4,-5,1};
        int n=ar.length;
        int c=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+ar[j];
                if(sum<0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
