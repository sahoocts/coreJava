package TwentySeven;

public class FindTriplateWithSumZero {
    static boolean findTriplets(int a[],int n){
  boolean flag=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==0){
                        System.out.println(a[i]+","+a[j]+","+a[k]);
                        flag=true;
                       // return 1;
                    }
                }
            }
        }
        return flag;
    }
    public static void main(String args[]){
        int arr[] = { 0, -1, 2, -3, 1 };
       // int arr[] = { 1,2,3};
        int n = arr.length;
       // boolean b=findTriplets(arr, n);
        if(findTriplets(arr, n)){
            System.out.print("-1");
        }
        else{
            System.out.print("0");
        }

    }
}
