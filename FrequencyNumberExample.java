package NewHackersRank;

public class FrequencyNumberExample {
    public static void main(String args[]){
    int x=7;
     int c=0;
        int a=767;
      //  int i=0;
        while(a>0){
            int n=a%10;//7
            a=a/10;//76
            if(n==7){
                c++;
            }


        }
        System.out.print("f is"+c);
    }
}
