public class MovingAllZerosToRightSide {

    public  int[] getAllzeros(int a[]){
        int c[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                c[j]=a[i];
                j++;
            }
        }
        return c;
    }
    public static void main(String args[]){
        MovingAllZerosToRightSide s=new MovingAllZerosToRightSide();
        int a[]={3,0,4,0,0,6,10,22,7};

        int b[]=s.getAllzeros(a);
        for(int f:b){
            System.out.println(f);
        }

    }
}
