package Kushal;

public class DigitSum {
    public static void main(String[] args) {
      //  int ans = sum(1342);
         int x=sumA(13422);
        System.out.println(x);
    }

    private static int sumA(int n) {
        int sum=0;
       while(n>0){
           int a=n%10;
           sum=sum+a;
           n=n/10;
       }
       return sum;
    }

    /*static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }*/
}
