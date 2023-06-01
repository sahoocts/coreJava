package LogicImplemented;

import java.util.Scanner;

public class ReagganreTheArrayAlternatevly {
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }*/

        int a[]={1,2,3,4,5,6};

        getAlternative(a);
    }

    private static void getAlternative(int[] a) {

        int b[]=new int[a.length];
        int i=0;
        int j=a.length-1;
        int k=0;
        int temp;
        while(i<j){
            b[k]=a[j];
            k++;
            b[k]=a[i];
            k++;
            i++;j--;
        }
for(int s:b){
    System.out.print(s);
}

    }
}
