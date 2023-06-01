package Sorting;

public class SelectionSort {
    static int[] selectionSort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int t=a[i];
                a[i]=a[min];
                a[min]=t;
                //  swap(a[i],a[min]);
            }
        }

        return a;
    }
    public static void main(String[] args) {
        int a[]={7,4,10,8,3,1};
        int s[]= selectionSort(a);
        for(int d:s){
            System.out.print(d);
        }
    }
}
