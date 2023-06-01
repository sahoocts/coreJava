package TwentyFive;

public class PartenExx {
    public static void main(String args[]){
        int st=5;
        int sp=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            sp++;
            st--;
        }

    }
}
