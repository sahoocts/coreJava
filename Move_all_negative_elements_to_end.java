package Geeksforgeeks;

import java.util.Arrays;

public class Move_all_negative_elements_to_end {

    static void moveNegetive(int a[]){
        int temp[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                temp[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                temp[j]=a[i];
                j++;
            }
        }
       for(int s:temp){
           System.out.print(s);
       }

      //  return temp;
    }

    public static void main(String args[]){
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int N = 8;
      //  int b[]=moveNegetive(arr);
        moveNegetive(arr);

    }
}
