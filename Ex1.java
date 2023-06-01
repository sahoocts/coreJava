package LogicImplemented;

public class Ex1 {

    public static void main(String args[]){
        int n=12345;
        getSum(n);
    }
    private static void getSum(int n) {
        int s=0;
        while(n>0){
            int p=n%10;
                s=s+p;
                n=n/10;
        }
        int t=s;
        getDisit(t);
        System.out.println(t);
    }

    private static void getDisit(int t) {
        int s1=0;
        while(t>0){
            int i=t%10;
            s1=s1+i;
            t=t/10;

        }
        System.out.println("the disit is"+s1);
    }
}
