package AddDigit;

import java.util.ArrayList;

public class ZeroMoveRight {

    public static void main(String args[]){
        int n=10010000;
        getMoveZeroToRight(n);
    }
    private static void getMoveZeroToRight(int n) {
        //int m[]=new int[7];
        ArrayList<Integer> al=new ArrayList<>();
        int i=0;
        //System.out.print();
        while(n>0){
            int a=n%10;
            if(a>0){
               al.add(a);
            }
            n=n/10;
        }

       // System.out.print(m[0]);

    }
}
