package PrevPractice;

import java.util.ArrayList;

public class AlternatePosNeg {
    private static void getAlternatePosNeg(int[] arr) {
        int b[]=new int[arr.length];
      //  ArrayList<Integer> al=new ArrayList<>();
        int k=0;
        int s=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                if(k>=arr.length){
                    break;
                }
                b[k]=arr[i];
                k+=2;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                if(s>=arr.length){
                    break;
                }
                b[s]=arr[i];
                s+=2;
            }
        }

        for(int s1:b){
            System.out.print(s1);
        }

    }
    public static void main(String args[]){
        int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        getAlternatePosNeg(Arr);
    }


}
