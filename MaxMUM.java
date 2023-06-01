package nighteen_four;

public class MaxMUM {

    public static void main(String args[]){
       /* int a[]={1,4,5,9};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.print(max);*/

        int b[]={2,11,13};
        int d[]=new int[b.length*2];
        int i=0;
        for(int j=0;j<b.length;j++){
            int c=b[j];
            int a=c/10;//2/10=0
            c=c%10;
             if(a!=0){
                 d[i]=a;
                 i++;
                 d[i]=c;
                 i++;
             }
             else{
                 d[i]=c;
                 i++;
             }

                //2%10=2
            //  System.out.println("---"+a);
            //  System.out.println("---"+c);

        }

        for(int j:d){
            System.out.print(j);
        }
    }
}
