package NewPrepare;



import java.util.Arrays;

public class MedianOfArray {

    public static void main(String args[]){
        int a[]={2,4,5,3,1,6};
        getMedianOfArray(a);
    }

    private static void getMedianOfArray(int[] a) {
        Arrays.sort(a);
        int median=a.length/2;
        int b[]=new int[median];
        //  for(int i=0;i<median;i++)
        int j=0;
        int n=0;
        while(median>0){

            for(int i=median;i<a.length;i++){
                b[j]=a[i];
                j++;
                n=b.length/2;
                median=n;
            }
        }
        System.out.println(median);
        //   System.out.println(a[median]);
    }
}
