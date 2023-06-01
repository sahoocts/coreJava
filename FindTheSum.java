public class FindTheSum {

    static void findSum(int a[],int sum){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(sum==a[i]+a[j]){
                    System.out.println(a[i]+"::"+a[j]);
                    count++;
                }
            }
           // System.out.print(count);
        }
        System.out.print("Total pair is:::"+count);
    }
    public static void main(String args[]){

        int[] arr = { 2, 4, 7, -2, 8,-1 };
        int sum=6;
        findSum(arr,sum);

    }
}
