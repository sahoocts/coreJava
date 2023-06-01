package TwentyFive;

import java.util.HashMap;

public class CountDigit {
    public static void main(String args[]){
        int a[]={11,12};
     // int a=11;

        for(int i=0;i<a.length;i++){
            int digit=0;
            int b=a[i];
            while(b!=0){
                b=b/10;
                digit++;
            }
            if(digit==2){
                System.out.println(a[i]);
                HashMap<Integer,Integer> hs=new HashMap<>();
                int d=a[i];
                while(d!=0){

                }

            }
        }

    //  System.out.print("digit");
    }
}
