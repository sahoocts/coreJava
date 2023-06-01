package Kushal;

public class FindFrequencyDigitInNumber {
    //count d=2,how many times present
    public static void main(String args[]){
        int N = 1122322;
        int d=2;
        int c=0;
        while(N>0){
            int a=0;
            if(N%10==d){
             c++;
            }
            N=N/10;
        }
        System.out.print(c);
    }
}
