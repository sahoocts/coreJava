package LogicImplemented;

public class Largest_Sum_Contiguous_Subarray {

    public static void main(String args[]){
        int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int x=getLargest_Sum_Contiguous_Subarray(a);
        System.out.println("max is::"+x);
    }
    private static int getLargest_Sum_Contiguous_Subarray(int[] a) {

        int max=-10;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}
