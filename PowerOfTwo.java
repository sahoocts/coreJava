package New_Leetcode;

public class PowerOfTwo {
    private static boolean isPower(int n){
        if(n==1) return true;
        if(n%2!=0 || n<0) return false;
        return isPower(n/4);
    }
    public static void main(String args[]){
        int  a=64;
        boolean d=isPower(a);
        System.out.print(d);
    }
}
