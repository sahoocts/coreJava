public class ReturnMaxValue {

    public static int getMaxValue(int b[],int n){
        int max=b[0];
        for(int i=0;i<=n-1;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int a[]={2,10,4,54,25,5};
        int n=a.length;
        int x=ReturnMaxValue.getMaxValue(a,n);
        System.out.println(x);

    }
}
