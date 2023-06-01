package HackersRank;

public class InversionCount {

    public static void main(String args[]){
    long arr[] = {2, 4, 1, 3, 5};
        long N = 5;
        long d=getInversion(arr,N);
        System.out.print(d);
    }

    private static long getInversion(long[] arr, long n) {
        long c=0;

      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(arr[i]>arr[j]){
                      c++;
              }
          }
      }
        return c;
    }
}
