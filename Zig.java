import java.util.Arrays;

public class Zig {
//a < b > c < d > e < f.
    public static void main(String args[]){

       int a[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
      //  int a[] = new int[] { 1, 4, 3, 2};
        // zigZag (a, a.length);
         //    System.out.print("hhh");

           getZigZag(a,a.length);

           System.out.print(Arrays.toString(a));
         /* for(int d:s){
               System.out.print(d+" ");
           }*/

    }

    private static void getZigZag(int[] arr, int length) {
        boolean flag = true;

        int temp =0;

        for (int i=0; i<=arr.length-2; i++)
        {
            if (flag) /* "<" relation expected */
            {
                /* If we have a situation like A > B > C,
                we get A > C < B by swapping B and C */
                if (arr[i] > arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
            else /* ">" relation expected */
            {
                /* If we have a situation like A < B < C,
                we get A < C > B by swapping B and C */
                if (arr[i] < arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }

        /*for(int i=1;i<a.length;i+=2){
            if(a[i-1]>a[i]){
                Swap(a,i-1,i);
            }
            if(a[i+1]>a[i]){
                Swap(a,i+1,i);
            }
        }*/

        //return a;
    }

   // int temp;
 /*   private static void Swap(int[] a, int  b, int c) {
          int temp=a[b];
          a[b]=a[c];
          a[c]=temp;


    }*/

}
