package NewPrepare;

public class Prime {
    static void CharPresent(int prime){
        int c=0;
      //  for(int i=1;i<10;i++){
            for(int j=1;j<=prime;j++){
                if(prime%j==0){
                    c++;
                }
            }
      //  }
        if(c==2){
System.out.println("prime");
        }

    }
    public static void main(String[] args) {
        int prime=5;
        CharPresent(prime);
    }
}
