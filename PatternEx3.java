package TwentyFive;
// //11 12 13 14 15
//// 21 22 23 24 25
//// 31 32 33 34 35
//// 41 42 43 44 45
//// 51 52 53 54 55


//*	*	*	*	*
//	*	*	*	*
//		*	*	*
//			*	*
//				*
public class PatternEx3 {
    public static void main(String args[]){
        int sp=1;
        int st=5;
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
