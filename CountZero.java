package Kushal;

public class CountZero {

    public static void main(String args[]){
        int n=30210004;
        int s=0;
        while(n>0){
            int a=n%10;
           // getZero(a);
            if(a==0){
                s++;
            }
            n=n/10;

        }
    }

  //  static int cnt=0;
   /* public static int getZero(int c){
        cnt++;
        return cnt;
    }*/
}
