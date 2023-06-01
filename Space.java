package PrevPractice;

public class Space {
    public static void main(String args[]){
        int sp=7;
        int st=1;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("p\t");
            }
            System.out.println();
            sp--;
            st++;
        }
    }
}
