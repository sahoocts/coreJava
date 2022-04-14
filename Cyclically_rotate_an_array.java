package Geeksforgeeks;
//Input:
//N = 5
//A[] = {1, 2, 3, 4, 5}
//Output:
//5 1 2 3 4

public class Cyclically_rotate_an_array {

    static int[] cyclicRotation(int []a){
        int n=a.length;
       int x=a[n-1];
       for(int i=n-1;i>0;i--){
           a[i]=a[i-1];
       }
       a[0]=x;
       return a;
    }
    public static void main(String args[]){
        int N = 5;
       int A[] = {1, 2, 3, 4, 5};
       int c[]=cyclicRotation(A);
       for(int f:c){
           System.out.println(f);
       }
    }
}
