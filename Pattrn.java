package NewPrepare;

public class Pattrn {
    public static void main(String[] args) {
        int sp = 5;
        int st = 1;
        for (int i = 1; i <= 5; i++) {

            for (int k = 0; k < sp; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("p\t");
            }
            System.out.println();
            sp--;
            st++;

        }
    }
}
