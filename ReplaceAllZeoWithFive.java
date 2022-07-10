public class ReplaceAllZeoWithFive {
    public static int convertfive(int num) {
        // Your code here
        int temp=0;
        while(num>0){
            int digit=num%10;
            if(digit==0){
                digit=5;
            }
            temp=temp*10+digit;
            num=num/10;
        }
        // System.out.print(num);
        return reverse(temp);
    }

    public static int reverse(int temp){
        int ans=0;
        int t=0;
        while(temp>0){
            t=temp%10;
            ans=ans*10+t;
            temp=temp/10;

        }
        return ans;
    }

    public static void main(String[] args) {
        int digit=10120;
        int x=convertfive(digit);
        System.out.println(x);
    }
}
