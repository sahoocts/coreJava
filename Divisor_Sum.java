package LogicImplemented;

class MyCalculator{
    public int divisor_sum(int a){
 /*       int s=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                s=s+i;
            }
        }
        return s;
    }*/
        int s=1;
        int v=0;
       // int f=0;

        while(s<=a){

            if(a%s==0){
                v=v+s;
            }
            s++;
        }

        return v;
    }


}

//Devisor of 6 is =1,2,3,and 6
//sum is = 12;

public class Divisor_Sum {

    public static void main(String args[]){

        MyCalculator myCalculator=new MyCalculator();
      //  Scanner sc=new Scanner(System.in);
      //  int n=sc.nextInt();
        int n=myCalculator.divisor_sum(6);
        System.out.println(n);

    }
}
