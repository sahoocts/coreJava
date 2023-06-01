package NewClassAdded;

public class ReverseNum {
    public static void main(String[] args) {
        int n=23597;
        int res=0;
        while(n>0){
            int a=n%10;
            res=res*10+a;
            n=n/10;
        }

        System.out.print(res);
    }
}

