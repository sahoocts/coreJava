package Java8.MCQS;

public class CountDigit {
    public static void main(String args[]){
        int a=23455;
        int c=0;
       while(a>0){
           a=a/10;
           c++;
       }
        System.out.println(c);
    }
}
