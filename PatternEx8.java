package TwentyFive;

import java.util.Scanner;
//outer space(os) inner space(is)
// os  is
// 2   -1
// 1    1
// 0    3
// 1    1
// 2    -1

//		*	                      (if(i>1 && i<n) )
//	*		*
//*				*
//	*		*
//		*	                       (if(i>1 && i<n))
public class PatternEx8 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int os=n/2;
        int is=-1;
        for(int i=1;i<=n;i++){
           // System.out.println(os+"::"+is);
            for(int j=1;j<=os;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j=1;j<=is;j++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }

            if(i<=n/2){
                os--;
                is=is+2;
            }
            else{
                os++;
                is=is-2;
            }
            System.out.println();
        }

    }
}
