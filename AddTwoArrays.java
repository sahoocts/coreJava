package TwentyFive;

public class AddTwoArrays {
    public static void main(String args[]){
        int a1[]={9,9,9};
        int a2[]={1,0,0};
      //  int s=9/10;
     //   int s1=9%10;
     //   System.out.println("the ::"+s+"::"+s1);
        int n1=a1.length;
        int n2=a2.length;
        int sum[]=new int[n1>n2 ?n1 :n2];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;
        int c=0;
        while(k>=0){
            int d=c;
            if(i>=0){
                d=d+a1[i];//9
            }
            if(j>=0){
                d=d+a2[j];
            }
            c=d/10;//1
            d=d%10;
            sum[k]=d;
            i--;
            j--;
            k--;
        }
        if(c!=0){
           System.out.print(c);
        }
        for(int val:sum){
            System.out.print(val);
        }
    }
}
