package TwentyFive;
 //11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55

//		*
//	*	*	*
//*	*	*	*	*
//	*	*	*
//		*
public class PatternEx4 {

    public static void main(String args[]) {
        int n = 5;
        int sp = n / 2;//2
        int st = 1;
        for (int i = 1; i <= n; i++) {
         //   System.out.println(sp + " ," + st);
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp--;
                st=st+2;
            }
            else{
                sp++;
                st=st-2;
            }
            System.out.println();
        }

    }
}