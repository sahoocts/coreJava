public class DigitEx {
    public static void main(String args[]){
        int temp=123321;
        int ans=0;
        /*while(a>0){
            a=a/10;
            c++;
            System.out.println(c);
        }*/
        while (temp > 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(ans);
    }
}
