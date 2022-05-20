package nighteen_four;

public class PowerOfNumber {
    static int getPower(int a,int b){
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;

        }
        return power;
    }
    public static void main(String args[]){
        int a=5;
        int b=4;
        int x=getPower(a,b);
        System.out.println(x);
    }
}
