package LogicImplemented;

public class Testing {

    public static void main(String args[]){

        int arr[]={15,-2,-1,1,2,-8,1,7,10,23};
        int rsult=getMax(arr);

    }

    private static int getMax(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    System.out.println("sum is zero");
                }

            }
        }
        return 1;
    }

}
