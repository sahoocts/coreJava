package Eighteen_four;

public class Alternate_positive_and_negative_numbers {

   static int[] rearrange(int a[], int n) {
        int b[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                b[s]=a[i];
                s=s+1;
            }
        }
        int m=s;
        int l=s;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                b[s]=a[i];
                s+=1;
            }
        }
        s=0;
        for(int i=0;i<n;){
            if(s<m){
                a[i]=b[s];
                s++;
                i++;
            }
            if(l<n){
                a[i]=b[l];
                l++;
                i++;
            }
        }
        return a;
    }

    public static void main(String args[]){
        int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
       int n=9;
        int c[]=rearrange(Arr,n);
        for(int d:c){
            System.out.print(d);
        }
        //9 -2 4 -1 5 -5 0 -3 2
    }
}
