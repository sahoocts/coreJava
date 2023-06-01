package HackersRank_06062022;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray{

    public static void main(String args[]){
        int arr1[][]={{1,2,3},{4,5,6}};
        int arr2[][]={{4,5,6},{1,2,3}};

        /*Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr1[i][j]=sc.nextInt();
            }
        }*/

        int sum[][]=new int[2][3];
        int n1=arr1.length;
        int n2=arr1[0].length;
        System.out.print(n1+"::"+n2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Resultant 2D array: ");
        for (int i = 0; i < sum.length; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }
    }
}
