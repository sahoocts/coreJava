package TwentyFive;

import java.util.Scanner;

public class BarChat {
    public static void main(String args[]){
     //   Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();

      //  int arr[]=new int[n];
        int arr[]={3,6,1,2,5};
       /* for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }*/
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //System.out.println("::"+max);
        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                   if(arr[i]>=floor){
                       System.out.print("*\t");
                   }
                   else{
                       System.out.print("\t");
                   }
            }
            System.out.println();
        }
    }
}
