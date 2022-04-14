package Geeksforgeeks;

public class SortArray {
    static int[] sortArray(int a[]){
        int n=a.length;
        for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]>a[j]){
                   int t=a[i];
                   a[i]=a[j];
                   a[j]=t;
               }
           }
        }
        return a;
    }

    public static void main(String args[]){
        int N = 4;
        int arr[] = {1, 5, 3, 2};
        sortArray(arr);
        for(int s:arr){
            System.out.println(","+s);
        }
    }
}
