import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Arrays;

public class FindTheNearest {

    public static void main(String args[]){
        int a[]={2,5,4,6,8,9,7,1};
        int s=4;
        getNearest(a,s);
    }

    private static void getNearest(int[] a,int s) {
     //   int s=2;
        Arrays.sort(a);//1 2 4 5 6 7 8 9

        int l=0;
        int h=a.length-1;
        int m=l+h/2;

        while(l<=h){
            if(a[m]==s){
                System.out.print(m);
                break;
            }
            else if(a[m]<s){
                l=m+1;
            }
            else{
                h=m-1;
            }
            m=(l+h)/2;
        }

    }
}
