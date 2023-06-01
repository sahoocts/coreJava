package NewHackersRank;

public class TestE {

    public static void main(String args[]){
       // int a=3;
        for(int j=2;j<=15;j++){
            int c=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    c++;
                }

        }
            if(c==2){
                System.out.print(j);
            }

        }
    }
}
